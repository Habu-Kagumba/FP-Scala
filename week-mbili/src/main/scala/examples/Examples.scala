package examples

object HigherOrder {
  /**
   * Σ f(n) → a..b
   */
  def sum(f: Int => Int, a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int =
      if (a > b) acc
      else loop(a + 1, f(a) + acc)

    loop(a, 0)
  }

  def sumInts(a: Int, b: Int): Int = sum(x => x, a, b)
  def sumCubes(a: Int, b: Int): Int = sum(x => x * x * x, a, b)
  def sumFactorials(a: Int, b: Int): Int = sum(factorial, a, b)

  def factorial(x: Int): Int = if (x == 0) 1 else x * factorial(x - 1)
}
