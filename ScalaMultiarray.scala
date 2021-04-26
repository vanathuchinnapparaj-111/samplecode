package javasample

object ScalaMultiarray {
  def main(args:Array[String]): Unit ={
    var a =Array.ofDim[Int](2,2)
    for(i <- 0 to 1){
      for(j <-0 to 1){
        println(a(i)(j))
      }

    }


  }

}
