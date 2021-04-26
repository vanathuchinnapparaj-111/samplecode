package javasample

object Scalathiskeyword {
  def main(args:Array[String]): Unit ={
    var thiobj = new Thiskeyword(123,"raj");
        thiobj.show();
  }
  class Thiskeyword{
    var id:Int=10;
    var name:String="";
    def this(id:Int,name:String){
      this()
      this.id=id;
      this.name=name;
    }
    def show(): Unit ={
      println(id+"\n"+name);
    }
  }
}
