package javasample

object Scalamethodoverride {
  def main(args:Array[String]): Unit ={
    var bobj = new b();
        bobj.show();
  }
  class a{
    def show(): Unit ={
      println("This is class A");
    }
  }
  class b extends a{
    override  def show(): Unit ={
      println("This is class b overrided method ");
    }
  }
}
