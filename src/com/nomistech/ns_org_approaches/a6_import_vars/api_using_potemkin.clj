(ns com.nomistech.ns-org-approaches.a6_import-vars.api-using-potemkin
  (:require [com.nomistech.ns-org-approaches.a6_import-vars.protocols
             :as protocols]
            [com.nomistech.ns-org-approaches.a6_import-vars.impl
             :as impl]
            [potemkin :as i]))

(i/import-vars [protocols
                P
                m])

(i/import-vars [impl
                x-val
                x-fun
                x-fun-caller
                x-macro
                with-x
                get-x
                create-r])

(do
  ;; We can import something even though we don't have a dependency
  ;; on its namespace in our `ns` form. This will cause tools that rely
  ;; on `ns` forms to fail to work. That includes clojure.tools.namespace
  ;; and Midje.
  (i/import-vars [com.nomistech.clojure-dev-utils
                  nomis-pp-classpath]))
