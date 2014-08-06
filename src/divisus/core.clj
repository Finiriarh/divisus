(ns divisus.core
	(:require [ring.adapter.jetty     :refer [run-jetty]]
		        [ring.middleware.params :refer [wrap-params]]
		        [clojure.java.io        :refer [file]])
	(:gen-class))

(defn ls [path] 
	(seq (.list (file path))))

(defn json-array [seq]
	(str "[" (apply str (interpose ", " (map #(str "\"" % "\"") seq))) "]"))
(defn handler [{{path "path"} :params}]
	{:status 200
		:headers {"Content-Type" "application/json"}
		:body (json-array (ls path))})

(def app
  (-> handler wrap-params))

(defn -main
	"Starts jetty server"
	[& args]
	(run-jetty app {:port 3131}))
