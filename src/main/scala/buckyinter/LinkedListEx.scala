package buckyinter

import java.util._

class LinkedListEx {
  def example = {
    val things = Array("apples", "noobs", "ponge", "bacon", "goats")
    var list1 = new LinkedList[String]
    for (thing <- things) {
      list1.add(thing)
    }
    
    val things2 = Array("sausage", "bacon", "goats", "harrypotter")
    var list2 = new LinkedList[String]
    for(thing2 <- things2) {
      list2.add(thing2)
    }
    
    list1.addAll(list2)
    list2 = null

    printMe(list1)
    removeStuff(list1, 2, 5)
    printMe(list1)
    reverseMe(list1)
    
  }
  
  private def printMe(list: LinkedList[String]): Unit = {
    for(l <- list.toArray()) {
      printf("%s ", l)
    }
    println
  }
  
  private def removeStuff(list: LinkedList[String], start: Int, end: Int) = {
    list.subList(start, end).clear()
  }
  
  // reverse a list using hasPrevious
  private def reverseMe(list: LinkedList[String]) = {
    val listIter = list.listIterator(list.size())
    while(listIter.hasPrevious()) {
      printf("%s ", listIter.previous())
    }
  }
}

object LinkedListEx {
  def main(args: Array[String]) {
    val l = new LinkedListEx
    l.example
  }
}