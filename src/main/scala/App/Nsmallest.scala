package App

import scala.io.StdIn

object Nsmallest extends App{

  val TheList = List(3,3,4,4,5,5) // input any list you like

  val n = StdIn.readLine("which term do you want? \n").toInt

  def nthterm = {
  val workingList = TheList.distinct.sorted
    println(workingList)
    workingList(workingList.size -n)}


  println(nthterm)

}

/** the question says smallest the examples say largest, i made it to do largest it could
  easily been changed in line 14 by changing it to -- workingList(n+1) -- **/