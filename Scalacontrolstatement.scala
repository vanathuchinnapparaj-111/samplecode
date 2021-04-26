package javasample

object Scalacontrolstatement {
  def main(args: Array[String]){
    var a:Int=10;
    if(a<=15){
      println(a+" less then 15");
    }else{
      println("Please Enter the valid number");
    }
    showDetails(5);
  }
  def showDetails(a:Int = 5){
    println("Entered value is "+a);
    var fact:Double =1;
    for(i<-1 to a){
      fact =fact*i;
    }
    println("The factorial value of given number is:"+fact);
  }

}
