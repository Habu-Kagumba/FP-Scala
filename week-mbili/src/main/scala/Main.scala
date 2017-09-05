import examples._

object Main extends App {
  def testHigherOrder() =
    printf("Ints: %d\n", HigherOrder.sumInts(2, 3))
    printf("Cubes: %d\n", HigherOrder.sumCubes(2, 3))
    printf("Factorials: %d\n", HigherOrder.sumFactorials(2, 3))

  testHigherOrder()
}
