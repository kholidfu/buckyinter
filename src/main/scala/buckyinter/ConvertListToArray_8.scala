package buckyinter

import java.util._

class ConvertListToArray_8 {
  def act = {
    val stuff = Array("babies", "watermelon", "melons", "fudge")
    val thelist = stuff.iterator.toList

    // add to the first index
    val thelist2 = thelist.::("first")
    // add to the last index
    val thelist3 = thelist2.reverse.::("end").reverse
    
    // convert back to an Array
    val stuff2 = thelist3.toArray
    
    // loop through
    for(s <- stuff2) {
      printf("%s ", s)
    }
  }
}

object ConvertListToArray_8 {
  def main(args: Array[String]) {
    val c = new ConvertListToArray_8
    c.act
  }
}