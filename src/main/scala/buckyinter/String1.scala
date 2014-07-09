package buckyinter

class String1 {
  def stringOps = {
	val words = Array("funk", "chunk", "furry", "baconator")
	
	// startsWith example
	for(word <- words) {
	  if(word.startsWith("fu"))
	    println(word)
	}
	
	// endsWith example
	for(word <- words)
	  if(word.endsWith("unk"))
	    println(word)
  }
}

object String1 {
  def main(args: Array[String]) {
    val s = new String1()
    s.stringOps
  }
}