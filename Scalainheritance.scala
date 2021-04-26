package javasample

object Scalainheritance {
  def main(args:Array[String]): Unit ={
    var cobj = new c();
  }
  class a{
    var a=10;
    var b=20;
    var c="raj";
  }
  class b extends a{
    var d=2.0;
    var f=30;
  }
  class c extends b{
    var g=a+f;
    println("The result value is:"+g);
  }



}
