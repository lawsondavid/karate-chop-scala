import scala.annotation.tailrec

class KarateChop {

  final def chop(number: Int, numbers: Array[Int]): Int = {
    if (numbers == null || numbers.isEmpty) {
      -1
    } else {
      recursiveChop(number, numbers, numbers.length - 1, 0)
    }
  }

  @tailrec
  private def recursiveChop(number: Int, numbers: Array[Int], upper: Int, lower: Int): Int = {
    if (upper < lower) {
      -1
    } else {
      val mid = (upper + lower) / 2
      if (number == numbers(mid)) {
        mid
      } else {
        if (number > numbers(mid)) recursiveChop(number, numbers, upper, mid + 1) else recursiveChop(number, numbers, mid - 1, lower)
      }
    }
  }
}