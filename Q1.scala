import scala.io.StdIn

object CheckInterest {
  def main(args: Array[String]): Unit = {
    println("Enter deposit amount: ")
    val amount = StdIn.readLine().toDouble
    var value = 0.0
    println("Interest: " + calculateInterest(amount))

    def calculateInterest(amount: Double): Double = {
      if (amount < 20000) {
        value = amount * 0.02
      } else if (amount >= 20000 && amount < 200000) {
        value = amount * 0.04
      } else if (amount >= 200000 && amount < 2000000) {
        value = amount * 0.035
      } else {
        value = amount * 0.065
      }
      value
    }
  }
}
