(ns com.nomistech.ns-org-approaches.a6_import-vars.src.impl
  (:require [com.nomistech.ns-org-approaches.a6_import-vars.src.protocols
             :as protocols]))

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

(defmacro with-x
  [[x] & body]
  `(binding [*x* ~x]
     ~@body))

(defn get-x [] *x*)

(defrecord R [x]
  protocols/P
  (m [r] (:x r)))

(defn create-r
  [x]
  (R. x))
