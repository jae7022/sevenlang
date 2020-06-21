import scala.actors.Actor._
import scala.actors._
import scala.io.Source

object Sizer {
  class PageInfo(val length : Int, val linkSize : Int)

  object PageLoader {
    def getPageSize(url: String) = {
      val s = Source.fromURL(url).mkString
      new PageInfo(s.length, s.split("\n").count(data => data.contains("a href")))
    }
  }

  val urls = List("http://www.amazon.com", "http://www.twitter.com", "http://www.google.com", "http://www.cnn.com")

  def timeMethod(method: () => Unit) {
    val start = System.nanoTime
    method()
    val end = System.nanoTime
    println("Method took " + (end - start)/1000000000.0) + "seconds."
  }

  def getPageSizeSequentially() = {
    for(url <- urls){
      println("Size for " + url + ": " + PageLoader.getPageSize(url).length + ", " + PageLoader.getPageSize(url).linkSize)
    }
  }

  def getPageSizeConcurrently(): Unit ={
    val caller = self

    for(url <- urls){
      actor { caller ! (url, PageLoader.getPageSize(url).length, PageLoader.getPageSize(url).linkSize)
      }
    }

    for(i <- 1 to urls.size){
      receive {
        case (url, size, linkSize) =>
          println("Size for " + url + ": " + size + ", " + linkSize)
      }
    }
  }

  def main(args: Array[String]): Unit = {
    println("Sequential run : ")
    timeMethod { getPageSizeSequentially }

    println("Concurrent run")
    timeMethod { getPageSizeConcurrently }
  }
}
