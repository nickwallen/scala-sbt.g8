giter8Settings

resolvers += Resolver.url("Typesafe", url("http://repo.typesafe.com/typesafe/releases/"))
resolvers += Resolver.url("Clojure", url("http://clojars.org/repo"))
resolvers += Resolver.url("Scalaz", url("https://dl.bintray.com/scalaz/releases"))

G8Keys.g8TestBufferLog := false

scriptedLaunchOpts ++= sys.process.javaVmArguments.filter(
  a => Seq("-Xmx", "-Xms", "-XX", "-Dsbt.log.noformat").exists(a.startsWith)
)
