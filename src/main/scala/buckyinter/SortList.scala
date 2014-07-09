package buckyinter

class SortList {
  def sortMe = {
    val craps = Array("apples", "lemons", "geese", "bacon", "youtube")
    var thelist = craps.iterator.toList
    
    // ascending
    val sortedlist = thelist.sorted // or
    val sortedlist2 = thelist.sortWith(_ < _)
    
    // descending
    val sortedlist3 = thelist.sortWith(_ > _)
    
    // loop through
    sortedlist3.foreach(printf("%s ", _))
  }
}

object SortList {
  def main(args: Array[String]) {
    val s = new SortList
    s.sortMe
  }
}