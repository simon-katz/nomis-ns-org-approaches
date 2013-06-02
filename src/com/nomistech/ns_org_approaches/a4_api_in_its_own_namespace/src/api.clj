(ns com.nomistech.ns-org-approaches.a4-api-in-its-own-namespace.src.api
  (:require [com.nomistech.ns-org-approaches.a4-api-in-its-own-namespace.src.impl
             :as impl]
            [com.nomistech.clojure-utils :as i]))

(defprotocol P
  (m [_] "This is the doc string for `m`."))

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

(defrecord R [x]
  ;; I can't put `R` in the impl namespace, because if I do I'll get
  ;; circular dependencies between namespaces:
  ;; - `R` (in impl ns) depends on `P` (in api ns)
  ;; - api ns depends on impl ns (just in general, not for what I'm showing)
  P
  (m [r] (:x r)))

(defn create-r
  [x]
  (R. x))
