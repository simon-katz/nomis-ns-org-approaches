(ns com.nomistech.ns-org-approaches.import-vars.impl-1
  (:require [com.nomistech.ns-org-approaches.import-vars.protocols
             :as protocols]))

(def x-val "This is x-val.")

(defn x-fun [] "This is x-fun.")


(defrecord R [x]
  protocols/P
  (m [r] (:x r)))

(defn create-r [x] (R. x))