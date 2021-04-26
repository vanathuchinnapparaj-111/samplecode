package javasample

object ScalaInheritances extends App{
  abstract class a{
    val name:String
    def show:Unit
  }
  class Circle extends a{
      override val name: String ="raj"
      def show: Unit = println("sample raj")
  }
  trait Sampletrait{
    def show(aobj:a): Unit
  }

  class Samplemain extends a with Sampletrait{
    val name: String = "vanathu"
    def show: Unit = println("this is sample main method")
    def show(aobj:a): Unit =println(s"yes my name is ${aobj.name}")
  }
  val cir = new Circle
  val sampleobj = new Samplemain
  sampleobj.show(cir)
}
