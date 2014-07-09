package buckyinter


// Bucky Intermediate Java #6
class ArrayOps {
  def act = {
    val things = Array("eggs", "lasers", "hats", "pie")
    var list1 = new java.util.ArrayList[String]()
    things.foreach({t =>
      list1.add(t)
    })
    // print list1
    list1.toArray().foreach(printf("%s ", _))
    
    val morethings = Array("lasers", "hats")
    var list2 = new java.util.ArrayList[String]()
    
    morethings.foreach(m =>
      list2.add(m)
    )

    // apply new func into both list
    editList(list1, list2);
    println("\n---");
    
    // print list2
    list2.toArray().foreach(printf("%s ", _))
    
    println("\n---")
    
    // print list1 (again)
    list1.toArray().foreach(printf("%s ", _))
  }
  
  def editList(list1: java.util.ArrayList[String], list2: java.util.ArrayList[String]) = {
    var it = list1.iterator()
    while(it.hasNext())
      if(list2.contains(it.next()))
        it.remove()
  }
}

object ArrayOps {
  def main(args: Array[String]) {
    val a = new ArrayOps
    a.act
  }
}