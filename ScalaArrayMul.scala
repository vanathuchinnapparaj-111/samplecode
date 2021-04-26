package javasample

object ScalaArrayMul {
  def main(args:Array[String]): Unit ={
    var a1 = Array(Array(1,2,3,4,5),Array(4,5,6,7,8));
    var a2 = Array(Array(2,5,4,6,7),Array(1,2,4,5,6));
    var a3 = Array.ofDim[Int](2,5);

  for(i <- 0 to 1 ){
    for (j <- 0 to 4){
      a3(i)(j)=a1(i)(j)+a2(i)(j);
      print(a3(i)(j));
    }
    println()
  }

  }

}
