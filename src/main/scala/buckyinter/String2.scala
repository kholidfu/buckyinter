package buckyinter

class String2 {
  def stringOps = {
    val name = "pythonscalapythonscala"
    println(name.indexOf("s"))
  }
}

object String2 {
  def main(args: Array[String]) {
    val s = new String2
    s.stringOps
  }
}