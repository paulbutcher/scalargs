import sbt._ 

class Scalargs(info: ProjectInfo) extends DefaultProject(info) { 
  val scalaToolsSnapshots = "Scala-Tools Snapshots" at "http://scala-tools.org/repo-snapshots"
  val scalatest = "org.scalatest" % "scalatest" % "1.0.1-for-scala-2.8.0.RC1-SNAPSHOT"
}
