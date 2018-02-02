import examples._

object Main extends App {
  def factorial(x: Int): Int = if (x == 0) 1 else x * factorial(x - 1)
  def fact(x: Int) = HigherOrderAndCurry.product(x => x)(1, x)

  // def testHigherOrderAndCurry() =
  //   printf("SumInts: %d\n", HigherOrderAndCurry.sum(x => x)(2, 3))
  //   printf("SumCubes: %d\n", HigherOrderAndCurry.sum(x => x * x * x)(2, 3))
  //   printf("SumFactorials: %d\n", HigherOrderAndCurry.sum(factorial)(2, 3))

  //   printf("ProductInts: %d\n", HigherOrderAndCurry.product(x => x)(2, 3))
  //   printf("ProductCubes: %d\n", HigherOrderAndCurry.product(x => x * x * x)(2, 3))
  //   printf("ProductFactorials: %d\n", HigherOrderAndCurry.product(fact)(2, 3))


  // testHigherOrderAndCurry()
  HigherOrderAndCurry.flattenArray(List(List(1), 2, List(List(3, 4), 5)))
}
