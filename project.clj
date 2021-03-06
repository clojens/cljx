(defproject com.keminglabs/cljx "0.2.2"

  :description "Static Clojure code rewriting"
  :url "http://github.com/lynaghk/cljx"
  :license {:name "BSD"
            :url "http://www.opensource.org/licenses/BSD-3-Clause"}

  :dependencies [[org.clojure/core.logic "0.7.0"]
                 [jonase/kibit "0.0.8"
                  ; TODO this can't be good, but using newer core.logic revs
                  ; results in a stackoverflow....
                  ; https://github.com/lynaghk/cljx/issues/9
                  :exclusions [org.clojure/core.logic]]
                 [watchtower "0.1.1"]]

  :min-lein-version "2.0.0"
  :eval-in-leiningen true)
