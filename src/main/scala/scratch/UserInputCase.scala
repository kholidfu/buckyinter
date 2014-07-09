package scratch

import java.util.Scanner
import scala.util.control.Breaks._

class UserInputCase {}

object UserInputCase {
  def main(args: Array[String]) = {
    val input: Scanner = new Scanner(System.in)
    
    println("Please enter a command: ")
    val text = input.nextLine()
    
    // switch implementation in Scala
    val result = text match {
      case "start" => println("Machine started!"); break;
      case "stop" => println("Machine stopped!"); break;
      case _ => println("Command not recognized!"); break;
    }
  }
}