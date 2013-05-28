(ns ns-org-approaches.overtone-approach.api-test
  (:require [midje.sweet :refer :all]
            [ns-org-approaches.overtone-approach.api :refer :all]))

(fact x-val
      => "This is x-val.")

(fact (x-fun)
      => "This is x-fun.")

(fact "We can call `nomis-pp-classpath`"
      (let [_ (with-out-str (nomis-pp-classpath))]
        nil)
      => nil)

(fact "All is ok with protocols and records"
      (f1 (create-r 100))
      => 100)
