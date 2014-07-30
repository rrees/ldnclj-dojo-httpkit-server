(ns hello-world.core
	(:use [org.httpkit.server :only [run-server]]
            [compojure.handler :only [site]]
            [compojure.core :only [defroutes GET]]
            [ring.middleware.reload :as reload]))

(defroutes all-routes
  (GET "/" [] "<p>Hello <strong><em>ldnclj</em></strong> July 2015 dojo!</p>")) ;; all other, return 404

(defn in-dev? [] true) 

(defn -main [& args]
	(let [handler (if (in-dev?)
			(reload/wrap-reload (site #'all-routes))
			(site all-routes))]
		(run-server handler {:port 3000})))