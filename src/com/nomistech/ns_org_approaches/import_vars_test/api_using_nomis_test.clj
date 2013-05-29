(ns com.nomistech.ns-org-approaches.import-vars-test.api-using-nomis-test
  (:require [midje.sweet :refer :all]
            [com.nomistech.ns-org-approaches.import-vars.api-using-nomis :refer :all]))

(fact x-val
      => "This is x-val.")

(fact (x-fun)
      => "This is x-fun.")

(fact (x-macro 42)
      => 42)

(fact "We can call `nomis-pp-classpath`"
      (let [_ (with-out-str (nomis-pp-classpath))]
        nil)
      => nil)

(fact "All is ok with protocols and records"
      (m (create-r 100))
      => 100)
