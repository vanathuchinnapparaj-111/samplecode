package javasample

object ScalaClass {
   def main(args:Array[String]){
    var scob = new Sampleaddress();
     scob.showAddress();
     scob.showDetails();

   }
  class Sampleclass  {
    def showDetails(){
      println("This is the show details method");
    }
  }
  class Sampleaddress extends Sampleclass{
    def showAddress(){
      println("This is the show Address method");
    }
  }


}

