package javasample

object Scalaabstractclass {
  def main(args: Array[String]): Unit = {
    var bobj = new b();
        bobj.move();

  }

  abstract class sampleabstract{
    def move();
  }
  class b extends sampleabstract{
    def move(): Unit ={
      println("This is the sampleabstract class extends");
    }
  }
}