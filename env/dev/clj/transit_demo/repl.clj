(ns transit-demo.repl
  (:require [baum.core :as b]
            [clojure.java.io :as io]
            [clojure.pprint :refer (pprint)]
            [clojure.repl :refer :all]
            [clojure.string :as str]
            [clojure.test :as test]
            [clojure.tools.namespace.repl :refer [refresh refresh-all]]
            [transit-demo.system :as system]))

(defn go []
  (system/boot (b/read-config "dev-resources/local-config.edn")))

(defn shutdown []
  (system/shutdown))

(defn reset []
  (system/shutdown)
  (go))
