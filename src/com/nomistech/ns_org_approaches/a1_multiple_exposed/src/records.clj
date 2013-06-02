(ns com.nomistech.ns-org-approaches.a1-multiple-exposed.src.records
  (:require [com.nomistech.ns-org-approaches.a1-multiple-exposed.src.protocols
             :as protocols]))

(defrecord R [x]
  protocols/P
  (m [r] (:x r)))

(defn create-r
  [x]
  (R. x))
