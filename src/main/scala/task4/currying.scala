package task4

object currying extends App {
  val p1: (Int, Int, Int) => Boolean = (x, y, z) => x <= y && y == z


  print(p1(4, 7, 7))
}
