package javasample

object Scalastringmethod {
  def main(args:Array[String]): Unit ={
    var s1="vanathu";
    s1= s1.concat("chinnapparaj");
    println(s1);

    if(s1.equals("Vanathuchinnapparaj")){
      println("This is equal");
    }else{
      println("This is notequal");
    }
  }
}
