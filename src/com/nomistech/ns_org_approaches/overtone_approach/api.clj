(ns com.nomistech.ns-org-approaches.overtone-approach.api
  (:require [com.nomistech.clojure-utils :as u]
            [com.nomistech.ns-org-approaches.overtone-approach.impl-1]))

(u/import-vars com.nomistech.ns-org-approaches.overtone-approach.impl-1 ; TODO: Add capability for using namespace aliases
               [x-val
                x-fun])


;;; We can import something even though we don't have a dependency
;;; on its namespace in our `ns` form. This will cause tools that rely
;;; on `ns` forms to fail to work. That includes clojure.tools.namespace
;;; and Midje.
(u/import-vars com.nomistech.clojure-dev-utils [nomis-pp-classpath])

(u/import-vars com.nomistech.ns-org-approaches.overtone-approach.protocols
               [f1])

(u/import-vars com.nomistech.ns-org-approaches.overtone-approach.impl-1
               [create-r])
