package javasample

object ScalamethodOverloading {
  def main(args:Array[String]): Unit ={
    var mobj = new Methodoverload();
    mobj.add(10,20);
    mobj.add(10,20,30);
  }
  class Methodoverload{
    def add(a:Int,b:Int):Unit ={
      var res=a+b;
      println("The addition of two value is:"+res);
    }
    def add(a:Int,b:Int,c:Int): Unit ={
      var res=a+b+c;
      println("The addition of three value is:"+res)
    }
  }
}
