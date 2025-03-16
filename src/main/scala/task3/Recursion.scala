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

  def reverseNumber(n: Int): Int =
   @annotation.tailrec
    def _reverseNumberAcc(n: Int, acc: Int) : Int = n match
      case i if i % 10 != 0 => _reverseNumberAcc(n / 10, acc * 10 + n % 10)
      case i if i % 10 == 0 => acc

    _reverseNumberAcc(n, 0)

}
