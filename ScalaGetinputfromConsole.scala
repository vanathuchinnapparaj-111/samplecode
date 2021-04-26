package javasample

object ScalaGetinputfromConsole {
  def main(args:Array[String]){
    val input = getInputconsole();
    println("Name is:"+input);
  }
  def getInputconsole():String={
    val name=scala.io.StdIn.readLine("Please enter the Name:");
    println("Please Enter Age");
    val age=scala.io.StdIn.readDouble();
    return name+age
    }
  }
