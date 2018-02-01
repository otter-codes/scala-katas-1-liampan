package App

import scala.io.StdIn

object CentFinder extends App {


  val year = StdIn.readLine("enter a year: \n").toInt

    println(((year-1)/100)+1)

}

