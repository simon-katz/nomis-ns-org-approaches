(ns com.nomistech.ns-org-approaches.overtone-approach.api
  (:require [com.nomistech.clojure-utils :as u]
            [com.nomistech.ns-org-approaches.overtone-approach.protocols
             :as protocols]
            [com.nomistech.ns-org-approaches.overtone-approach.impl-1
             :as impl-1]))

(u/import-vars protocols [f1])

(u/import-vars impl-1 [x-val
                       x-fun
                       create-r])

(do
  ;; We can import something even though we don't have a dependency
  ;; on its namespace in our `ns` form. This will cause tools that rely
  ;; on `ns` forms to fail to work. That includes clojure.tools.namespace
  ;; and Midje.
  (u/import-vars com.nomistech.clojure-dev-utils [nomis-pp-classpath]))
