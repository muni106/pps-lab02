package task2

object TryCurrying extends App {
  def curriedSum(x: Double)(y: Double): Double = x + y

  val fee: Double = -1

  val feeApplicartion = curriedSum(fee)

  print(feeApplicartion(1000))

}
