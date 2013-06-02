(ns com.nomistech.ns-org-approaches.a1-multiple-exposed.src.other
  (:require [com.nomistech.ns-org-approaches.a1-multiple-exposed.src.protocols
             :refer :all]
            [com.nomistech.ns-org-approaches.a1-multiple-exposed.src.records
             :refer :all]))

(def x-val
  "This is the doc string for x-val."
  "This is x-val.")

(defn x-fun
  "This is the doc string for x-fun."
  []
  "This is x-fun.")

(defn x-fun-caller
  []
  (x-fun))

(defmacro x-macro
  "This is the doc string for x-macro."
  []
  "This is x-macro.")

(def ^:dynamic *x* :root-value)
