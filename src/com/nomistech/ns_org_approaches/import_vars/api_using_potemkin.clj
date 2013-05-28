(ns com.nomistech.ns-org-approaches.import-vars.api-using-potemkin
  (:require [com.nomistech.ns-org-approaches.import-vars.protocols
             :as protocols]
            [com.nomistech.ns-org-approaches.import-vars.impl-1
             :as impl-1]
            [potemkin :as pot]))

(pot/import-vars [com.nomistech.ns-org-approaches.import-vars.protocols
                  m])

(pot/import-vars [com.nomistech.ns-org-approaches.import-vars.impl-1
                  x-val
                  x-fun
                  create-r])

(do
  ;; We can import something even though we don't have a dependency
  ;; on its namespace in our `ns` form. This will cause tools that rely
  ;; on `ns` forms to fail to work. That includes clojure.tools.namespace
  ;; and Midje.
  (pot/import-vars [com.nomistech.clojure-dev-utils
                    nomis-pp-classpath]))
