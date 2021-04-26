package javasample

object ScalapatternMatch {
  def main(args:Array[String]): Unit ={
    search("hellow");
  }
  def search(a:Any):Any= a match {
    case 1 => println("one")
    case 2 => println("two")
    case "hellow" => println("hellow")
    case _ => println("no")
  }

}
