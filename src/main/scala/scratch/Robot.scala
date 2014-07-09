package scratch

class Robot {
  
  def speak(text: String): Unit = {
    println(text)
  }
  
  def jump(height: Int): Unit = {
    println("Jumping: " + height)
  }
  
  def move(direction: String, distance: Double) = {
    println("Moving " + distance + " meters in direction " + direction)
  }
  
}

object Robot {
  def main(args: Array[String]) {
    val sam = new Robot
    sam.speak("Hi I'm Sam.")
    sam.jump(7)
    sam.move("West", 12.2)
  }
}