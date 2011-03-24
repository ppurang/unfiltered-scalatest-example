import sbt._

class Project(info: ProjectInfo) extends DefaultProject(info) {
  val uf_version = "0.3.3-SNAPSHOT"
  
  // unfiltered
  lazy val uff = "net.databinder" %% "unfiltered-filter" % uf_version
  lazy val ufj = "net.databinder" %% "unfiltered-jetty" % uf_version

  // testing
  lazy val uf_scalatest = "net.databinder" %% "unfiltered-scalatest" % uf_version % "test"

  lazy val jboss = "JBoss repository" at
    "https://repository.jboss.org/nexus/content/groups/public/"
  
  // logging
  val javaNetRepo = "Java.net Repository for Maven" at "http://download.java.net/maven/2"
  val newReleaseToolsRepository = ScalaToolsSnapshots
  val avsl = "org.clapper" %% "avsl" % "0.3.1"
}
