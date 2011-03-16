;; (defproject themis "1.0.0-SNAPSHOT"
;;   :description "FIXME: write"
;;   :dependencies [[org.clojure/clojure "1.2.0"]
;;                  [org.clojure/clojure-contrib "1.2.0"]])

(defproject themis "1.0.0-SNAPSHOT"
  :description "FIXME: Themis Task Manager"
  :dependencies [ [ org.clojure/clojure "1.2.0" ]
                 [ org.clojure/clojure-contrib "1.2.0" ]
                 [ conjure-core "0.8.0" ] ]
  :dev-dependencies [ [ lein-conjure "0.8.0" ] ]
)
