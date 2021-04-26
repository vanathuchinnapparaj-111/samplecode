package javasample

object ScalasingletonObject {
  def main(args:Array[String]): Unit ={
    Singletonobj.showMethod();
  }

}
object Singletonobj{
  def showMethod(): Unit ={
    println("this is singleton object method");
  }
}
