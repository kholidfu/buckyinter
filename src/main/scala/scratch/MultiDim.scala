package scratch

class MultiDim {

}

object MultiDim {
  def main(args: Array[String]) = {
    // build 2x2 multidimensional array
    val grids = Array.ofDim[Int](2, 2)
    // give a value to each element
    grids(0)(0) = 1
    grids(0)(1) = 2
    grids(1)(0) = 3
    grids(1)(1) = 4
    // loop through and print it
    grids.foreach(_.foreach(printf("%s ", _)))
    // which is equal to
    grids.foreach(grid => {
      grid.foreach(g => printf("%s ", g))
    })
  }
}