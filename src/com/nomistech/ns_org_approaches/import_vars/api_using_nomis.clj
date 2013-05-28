(ns com.nomistech.ns-org-approaches.import-vars.api-using-nomis
  (:require [com.nomistech.ns-org-approaches.import-vars.protocols
             :as protocols]
            [com.nomistech.ns-org-approaches.import-vars.impl-1
             :as impl-1]
            [com.nomistech.clojure-utils :as i]))

(i/import-vars protocols
               [m])

(i/import-vars impl-1
               [x-val
                x-fun
                create-r])

(do
  ;; We can import something even though we don't have a dependency
  ;; on its namespace in our `ns` form. This will cause tools that rely
  ;; on `ns` forms to fail to work. That includes clojure.tools.namespace
  ;; and Midje.
  (i/import-vars com.nomistech.clojure-dev-utils
                 [nomis-pp-classpath]))
