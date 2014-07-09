package buckyinter

class Recursion {
  def fact(n: Long): Long = {
    if(n <= 1) {
      return 1
    } else {
      return n * fact(n-1)
    }
  }
}

object Recursion {
  def main(args: Array[String]) {
    val r = new Recursion
    println(r.fact(5))
  }
}