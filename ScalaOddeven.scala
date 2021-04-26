package javasample

object ScalaOddeven {
  def main(args:Array[String]){
    val samobj = new sample();
    val resGet=samobj.getInput()
    if(resGet.equals("even")){
      println("The given number is Even");
    }else if(resGet.equals("odd")){
      println("The given number is Odd");
    }

  }
  class sample{
    def getInput(): String={
      var result:String ="";
      println("Please Enter the number:")
      val a = scala.io.StdIn.readDouble();
      if(a%2==0){
        result = "even";
      }else{
        result = "odd";
      }
      result;
    }
    }
  }
