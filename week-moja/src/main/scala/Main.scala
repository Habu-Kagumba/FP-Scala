import example._

object Main extends App {
  // def testSqrt() =
  //   println(Sqrt.sqrt(2))
  //   println(Sqrt.sqrt(4))
  //   println(Sqrt.sqrt(0.001))
  //   println(Sqrt.sqrt(0.1e-20))
  //   println(Sqrt.sqrt(1.0e20))
  //   println(Sqrt.sqrt(1.0e50))

  def testGCD() =
    printf("GCD (%d, %d): %d\n", 14, 21, GCD.euclidAlgorithm(14, 21))
    printf("GCD (%d, %d, %d, %d): %d\n",48, 16, 24, 96, GCD.gcdMultiple(48, 16, 24, 96))

  def testFactorial() =
    printf("Factorial (%d): %d\n", 4, Factorial.calc(4))

  // testSqrt()
  testGCD()
  testFactorial()
}
