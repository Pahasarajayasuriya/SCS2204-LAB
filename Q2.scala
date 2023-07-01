import scala.io.StdIn

object PatternMatching {
  def main(args: Array[String]): Unit = {
    println("Enter a value: ")
    val value = StdIn.readLine().toInt
    patternChecker(value)

    def patternChecker(amount: Int): Unit = {
      if (amount < 0 ||  amount == 0) {
        println("Negative/Zero input")
      }

      if (amount % 2 == 0) {
        println("Even number is given")
      } else {
        println("Odd number is given")
      }
    }
  }
}
