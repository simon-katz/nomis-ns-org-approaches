(ns com.nomistech.ns-org-approaches.a2-one-ns-one-file.test.the-ns-test
  (:require [midje.sweet :refer :all]
            [com.nomistech.ns-org-approaches.a2-one-ns-one-file.src.the-ns
             :refer :all]
            [com.nomistech.clojure-dev-utils :as u]))

(fact "Values work"
      x-val
      => "This is x-val.")

(fact "Funcions work"
      (x-fun)
      => "This is x-fun.")

(fact "Macros work"
      (x-macro)
      => "This is x-macro.")

(fact "Dynamic binding works"
      (binding [*x* 42] *x*)
      => 42)

(fact "We can call `nomis-pp-classpath`"
      (let [_ (with-out-str (u/nomis-pp-classpath))]
        nil)
      => nil)

(fact "Protocols and records #1"
      (m (create-r 100))
      => 100)

(defrecord R2 [x]
  P
  (m [r] 999))

(fact "Protocols and records #2"
      (m (R2. 100))
      => 999)

(fact "`with-redefs` works"
      (with-redefs [x-fun (fn [] "Redef")]
        (x-fun-caller))
      => "Redef")
