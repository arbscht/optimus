(defproject optimus "0.18.5"
  :description "A Ring middleware for frontend performance optimization."
  :url "http://github.com/magnars/optimus"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/core.memoize "0.5.6"]
                 [org.clojure/data.codec "0.1.0"]
                 [pathetic "0.5.1"]
                 [clj-time "0.6.0"]
                 [clj-jsr223-v8 "0.1.7"]
                 [juxt/dirwatch "0.2.2"]
                 [potemkin "0.3.13"]
                 [environ "1.0.2"]]
  :profiles {:dev {:dependencies [[midje "1.6.0"]
                                  [optimus-test-jar "0.1.0"]
                                  [test-with-files "0.1.0"]]
                   :plugins [[lein-midje "3.1.3"]
                             [lein-shell "0.3.0"]
                             [lein-environ "1.0.2"]]
                   :resource-paths ["test/resources"]
                   :source-paths ["dev"]}}
  :prep-tasks [["shell" "./build-js-sources.sh"]])
