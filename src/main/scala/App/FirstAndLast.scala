package App

import scala.io.StdIn

object FirstAndLast extends App {

  val word : String = StdIn.readLine("enter a word \n")


  def removeFL(word:String): String= {
    if (word.length > 1){
    val first = word.tail.reverse
    val last = first.tail.reverse
    last}
    else{
      ""
    }
  }

  println(removeFL(word))
}
