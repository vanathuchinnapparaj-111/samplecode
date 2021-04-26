package javasample

object ScalaArray {
  def main(args:Array[String]): Unit ={
    var a = Array(1,2,3,4,5);
    for(e <- a){
      println(e);
    }

  }
}
