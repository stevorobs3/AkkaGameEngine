name := "AkkaGameEngine"

version := "1.0"

scalaVersion := "2.11.8"

javacOptions ++= Seq(
  "-Xlint",
  "-encoding", "UTF-8",
  "-source", "1.8",
  "-target", "1.8"
)
scalacOptions ++= Seq(
  "-Xlint",
  "-feature",
  "-encoding", "UTF-8",
  "-unchecked",
  "-deprecation",
  "-Xfuture",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Ywarn-unused",
  "-Ywarn-unused-import"
)

libraryDependencies := Seq (
  "com.badlogicgames.gdx" % "gdx"               % "1.9.5",
  "com.badlogicgames.gdx" % "gdx-backend-lwjgl" % "1.9.5",
  "com.badlogicgames.gdx" % "gdx-platform"      % "1.9.5" classifier "natives-desktop",
  "com.typesafe.akka"     % "akka-actor_2.11"   % "2.4.17"
)