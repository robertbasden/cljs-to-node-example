(defproject l33t "0.1.0"
  :dependencies [[org.clojure/clojure "1.9.0-alpha15"]
                 [org.clojure/clojurescript "1.9.521"]
                 [cljsjs/nodejs-externs "1.0.4-1"]]

  :plugins [[lein-cljsbuild "1.1.5"]]

  :cljsbuild {:builds [{:id "prod"
                        :source-paths ["src"]
                        :compiler {:main l33t.core
                                   :output-to "dist/index.js"
                                   :target :nodejs
                                   :output-dir "target"
                                   :optimizations :advanced
                                   :pretty-print true
                                   :parallel-build true}}]})