name := "Query JSON doc in local Hive server via JDBC driver"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies += "org.apache.hive" % "hive-jdbc" % "0.14.0"

// Fork JVM when `run`-ing SBT
// http://stackoverflow.com/a/5265162/409976
fork in run := true