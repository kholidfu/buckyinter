package scratch

import scala.util.control.Breaks._

class WhileScala {
  def summon = {
    var sum = 0
    for(i <- 0 to 10)
      if(sum < 10)
        sum += i
    sum
  }
}

object WhileScala {
  def main(args: Array[String]) {
    val w = new WhileScala
    println(w.summon)
  }
}