import scala.collection.immutable.List

object Main {

  def main(args: Array[String]) {

      val l = List(1, 2, 3, 9, 67)
      var value = l.foldRight(0)((a,b) => a+b)
      println(value)
  }
}
