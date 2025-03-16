package task3

object Recursion extends App{
  def power(base: Double, exponent: Int): Double = exponent match
    case i if i > 0 => base * power(base, exponent - 1)
    case 0 => 1

  def powerTail(base: Double, exponent: Int): Double =
    @annotation.tailrec
    def _powerWithMemo(base: Double, exponent: Int, memo: Double): Double = exponent match
      case i if i > 0 => _powerWithMemo(base, exponent - 1, memo * base)
      case 0 => memo

    _powerWithMemo(base, exponent, 1.0)

}
