package scratch

class ScalaClass(
    val name: String, 
    val age: Int) {
}

object ScalaClass {
  def main(args: Array[String]) = {
    var s = new ScalaClass("kholid", 33)
    println(s.name)
    println(s.age)
  }
}