package examples

object HigherOrderAndCurry {
  /**
   * Σ f(n) → a..b
   * ------------------
   * With currying
   */

  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
    if (a > b) zero
    else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))

  def sum(f: Int => Int)(a: Int, b: Int): Int =
    mapReduce(f, (x, y) => x + y, 0)(a, b)

  def product(f: Int => Int)(a: Int, b: Int): Int =
    mapReduce(f, (x, y) => x * y, 1)(a, b)

  def flattenArray(array: List[Any]): List[Int] = {
    def loop(nestedArray: List[Any], flatArray: List[Int]) =
      if (nestedArray.length == 0) flatArray
      nestedArray match {
        case (head: List[Any]) :: tail => loop(tail, flatArray ++ flattenArray(a))
        case (head: Int) :: tail => loop(tail, flatArray :+ i)
      }
  }
}
