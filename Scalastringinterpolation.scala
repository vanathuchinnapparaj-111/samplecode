package javasample

object Scalastringinterpolation {
  def main(args:Array[String]): Unit ={
    var sobj = new Sample()
    sobj.Smethod()
    sobj.fmethod()
    sobj.rawmethod()
  }
  class Sample{
    def Smethod(){
      var s1="This is the sample string method";
      println(s"String interpolation method $s1");
    }
    def fmethod(): Unit ={
      var s2 = "This is the string f method";
      println(f"this is f method $s2");
    }
    def rawmethod(): Unit ={
      var s1 = "Scala \tstring \nexample"
      var s2 = raw"Scala \tstring \nexample"
      println("This is s1 method:"+s1)
      println("This is s2 method:"+s2)
    }

  }
 }
