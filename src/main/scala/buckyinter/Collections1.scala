package buckyinter

class Collections1 {
  def act = {
    val things = Array("eggs", "lasers", "hats", "pie")
    var list1 = new java.util.ArrayList[String]()
    things.foreach({ thing =>
      list1.add(thing)
    })
    
    // iterate and print each
    list1.toArray.foreach(l => printf("%s ", l))
    
    // print array size
    println(list1.toArray().size)
  }
}

object Collections1 {
  def main(args: Array[String]) {
    val c = new Collections1
    c.act
  }
}