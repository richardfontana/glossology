resolvers += Resolver.url("scalasbt releases", new URL("http://scalasbt.artifact
oryonline.com/scalasbt/sbt-plugin-releases"))(Resolver.ivyStylePatterns)

addSbtPlugin("org.scala-sbt" % "sbt-android-plugin" % "0.6.2")
