package javasample

object Scalatraits {
  def main(args:Array[String]): Unit ={
    var s = new Sampleclass()
        s.ran();
        s.run();
        s.ran1();
    }
  trait smapletraits{
    def run()
  }
  trait sampletraits1{
    def ran()
  }
  trait sampletraits2{
    def ran1()
  }

  class Sampleclass extends sampletraits1 with smapletraits with sampletraits2 {
    println("This is class sample");
    def run: Unit ={
      println("This is trait example");
    }
    def ran: Unit ={
      println("This is traits2 example");
    }
    def ran1: Unit ={
      println("This is traits3 example");
    }
  }

}
