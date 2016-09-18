name := "Blog Finagle"

scalaVersion := "2.11.8"


version := "1.0"

libraryDependencies ++= Seq(
"com.twitter" %% "finatra-http" % "2.3.0"
)

 resolvers +=
  "Twitter" at "http://maven.twttr.com"
