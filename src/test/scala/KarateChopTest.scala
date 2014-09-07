import org.scalatest.{Matchers, FlatSpec, FunSuite}

class KarateChopTest extends FlatSpec with Matchers {

  "A KarateChop" should "return -1 when searching an empty list of numbers" in {
    val karateChop = new KarateChop()
    assert(-1 === karateChop.chop(1, new Array[Int](0)))
  }

  "A KarateChop" should "return index of number" in {
    val karate = new KarateChop()

    assert(-1 === karate.chop(3, new Array[Int](0)))
    assert(-1 === karate.chop(3, Array(1)))
    assert(0 === karate.chop(1, Array(1)))

    assert(0 === karate.chop(1, Array(1, 3, 5)))
    assert(1 === karate.chop(3, Array(1, 3, 5)))
    assert(2 === karate.chop(5, Array(1, 3, 5)))
    assert(-1 === karate.chop(0, Array(1, 3, 5)))
    assert(-1 === karate.chop(2, Array(1, 3, 5)))
    assert(-1 === karate.chop(4, Array(1, 3, 5)))
    assert(-1 === karate.chop(6, Array(1, 3, 5)))
    assert(0 === karate.chop(1, Array(1, 3, 5, 7)))
    assert(1 === karate.chop(3, Array(1, 3, 5, 7)))
    assert(2 === karate.chop(5, Array(1, 3, 5, 7)))
    assert(3 === karate.chop(7, Array(1, 3, 5, 7)))
    assert(-1 === karate.chop(0, Array(1, 3, 5, 7)))
    assert(-1 === karate.chop(2, Array(1, 3, 5, 7)))
    assert(-1 === karate.chop(4, Array(1, 3, 5, 7)))
    assert(-1 === karate.chop(6, Array(1, 3, 5, 7)))
    assert(-1 === karate.chop(8, Array(1, 3, 5, 7)))

    assert(0 === karate.chop(1, Array(1, 3, 5, 7, 9)))
    assert(1 === karate.chop(3, Array(1, 3, 5, 7, 9)))
    assert(2 === karate.chop(5, Array(1, 3, 5, 7, 9)))
    assert(3 === karate.chop(7, Array(1, 3, 5, 7, 9)))
    assert(4 === karate.chop(9, Array(1, 3, 5, 7, 9)))
    assert(-1 === karate.chop(4, Array(1, 3, 5, 7, 9)))
    assert(-1 === karate.chop(10, Array(1, 3, 5, 7, 9)))
  }
}