(defproject hello-world "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
  	[ring/ring-core "1.3.0"]
  	[ring/ring-devel "1.3.0"]
  	[http-kit "2.1.16"]
  	[compojure "1.1.8"]
  	[javax.servlet/servlet-api "2.5"]]
  	:aot [hello-world.core]
	:main hello-world.core)
