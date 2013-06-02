(in-ns 'com.nomistech.ns-org-approaches.a3-one-ns-many-files.src.the-ns)

(def x-val
  "This is the doc string for x-val."
  "This is x-val.")

(defn x-fun
  "This is the doc string for x-fun."
  []
  "This is x-fun.")

(defn x-fun-caller
  []
  (x-fun))

(defmacro x-macro
  "This is the doc string for x-macro."
  []
  "This is x-macro.")

(def ^:dynamic *x* :root-value)

(defmacro with-x
  [[x] & body]
  `(binding [*x* ~x]
     ~@body))

(defn get-x [] *x*)