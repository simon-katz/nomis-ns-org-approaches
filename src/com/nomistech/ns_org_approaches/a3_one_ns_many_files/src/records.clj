(in-ns 'com.nomistech.ns-org-approaches.a3-one-ns-many-files.src.the-ns)

(defrecord R [x]
  P
  (m [r] (:x r)))

(defn create-r
  [x]
  (R. x))
