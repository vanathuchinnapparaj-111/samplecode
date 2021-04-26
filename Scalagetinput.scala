package javasample

object Scalagetinput {
  def main(args: Array[String]): Unit = {
    println("Please enter the number");
    val a = scala.io.StdIn.readInt();
    printMethod(a);
  }

  def printMethod(d: Int): Unit = {

    for (e <- 1 to d by 2) {

      if (e != 2) {
        println(e)
      } else {
        println(e)
      }

    }
  }
}
