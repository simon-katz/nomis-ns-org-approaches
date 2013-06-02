(ns com.nomistech.ns-org-approaches.a3-one-ns-many-files.test.test
  (:require [midje.sweet :refer :all]
            [com.nomistech.ns-org-approaches.a3-one-ns-many-files.src.the-ns
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

(fact "Macros around dynamic binding work"
      (with-x [42] (get-x))
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
