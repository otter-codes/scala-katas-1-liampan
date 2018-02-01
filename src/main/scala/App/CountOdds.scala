package App

import scala.io.StdIn

object CountOdds extends App {


  val x = StdIn.readLine("enter number \n").toInt


  def countdown(input: Int) =
      List.range(1,x,2)



  println(countdown(x))

}
