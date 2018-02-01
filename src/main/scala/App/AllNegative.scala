package App

import scala.io.StdIn

object AllNegative extends App{

 val x : Int = StdIn.readLine("enter number \n").toInt


  def makeNeg: Int = {
    if (x > 0){-x}
    else x
  }


  println(makeNeg)


}
