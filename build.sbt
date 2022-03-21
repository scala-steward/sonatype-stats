scalaVersion := "2.13.8"

libraryDependencies ++= Seq(
  "com.typesafe.akka"  %% "akka-stream"             % "2.6.19",
  "com.typesafe.akka"  %% "akka-http-core"          % "10.2.9",
  "com.lightbend.akka" %% "akka-stream-alpakka-csv" % "3.0.4"
)

scalafmtOnCompile := true

ThisBuild / scalafixDependencies ++= Seq(
  "com.nequissimus" %% "sort-imports" % "0.6.1"
)
