(ns hello-world.core
	(:use [org.httpkit.server :only [run-server]]))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "<i>Hello World</i>"
   :blah "foo"})

(defn -main [& args]
	(run-server handler {:port 3000}))