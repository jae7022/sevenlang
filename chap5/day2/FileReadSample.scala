import java.util

import scala.collection.mutable
import scala.io.Source

object FileReadSample {
  class test extends Censor

  def main(args: Array[String]): Unit = {

    val t = new test
    val data = Source.fromFile("test.txt").getLines().toList
    println(t.replace(data))
  }
}
