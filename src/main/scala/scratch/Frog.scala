package scratch

class Frog(var name: String, var age: Int) {
  def setName(name: String): Unit = {
    this.name = name
  }
  def setAge(age: Int): Unit = {
    this.age = age
  }
  def getName: String = {
    return name
  }
  def getAge: Int = {
    return age
  }
}

object Frog {
  def main(args: Array[String]) = {
    val frog1 = new Frog("Bertie", 1)
    println(frog1.getName)
    println(frog1.getAge)
  }
}