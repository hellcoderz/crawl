(defproject crawl "1.0.0-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojure/algo.monads "0.1.3-SNAPSHOT"]]
  :extra-classpath-dirs ["/home/me/graal/graal/com.oracle.graal.compiler/bin"
                         "/home/me/graal/graal/com.oracle.graal.compiler.phases/bin"
                         "/home/me/graal/graal/com.oracle.graal.nodes/bin"
                         "/home/me/graal/graal/com.oracle.graal.debug/bin"
                         "/home/me/graal/graal/com.oracle.graal.graph/bin"
                         "/home/me/graal/graal/com.oracle.max.cri/bin"
                         ]
  :aot [crawl.compiler
        crawl.nodes])
