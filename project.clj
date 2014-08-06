(defproject divisus "0.1.0-SNAPSHOT"
  :description "Artifact repository"
  :url "https://github.com/Finiriarh/divisus"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [ring/ring-core "1.3.0"]
                 [ring/ring-jetty-adapter "1.3.0"]]
  :main ^:skip-aot divisus.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
