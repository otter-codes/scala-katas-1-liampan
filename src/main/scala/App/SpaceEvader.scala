package App

import scala.io.StdIn

object SpaceEvader extends App{

  val word = StdIn.readLine("enter a word with or with out spaces \n")

  val remWord = word.foldLeft[String]("")((acc, point) => remSpace(point)  + acc)

  def remSpace(point:Char): String = {
    val letter = point.toString
    if (point == ' '){""}
    else {letter}
  }

  println(remWord.reverse)

}
