name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "$scalaVersion$"

resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/"
resolvers += "Clojure Repo" at "http://clojars.org/repo"
resolvers += "Scalaz Releases" at "https://dl.bintray.com/scalaz/releases"

libraryDependencies ++=  Seq(
	"org.specs2" %% "specs2-core" % "3.5" % "test"
)


