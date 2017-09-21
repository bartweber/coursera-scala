def isPrime(n: Int): Boolean = (2 until n) forall (x => n % x != 0)

val n = 7
val a = (1 until n).flatMap(i =>
  (1 until i) map (j => (i, j))) filter (pair =>
  isPrime(pair._1 + pair._2))
a.foreach(println)

val b = for {
  i <- 1 until n
  j <- 1 until i
  if isPrime(i + j)
} yield (i, j)
b.foreach(println)

def scalarProduct(xs: Vector[Double], ys: Vector[Double]): Double =
  (xs zip ys).map { case (x, y) => x * y }.sum

val v1 = Vector[Double](1.2, 1.3, 1.4)
val v2 = Vector[Double](2.1, 2.2, 2.3)
scalarProduct(v1, v2)

def scalarProductWithFor(xs: List[Double], ys: List[Double]) =
  (for ((x, y) <- xs zip ys) yield x * y).sum

val v3 = List[Double](1.2, 1.3, 1.4)
val v4 = List[Double](2.1, 2.2, 2.3)
scalarProductWithFor(v3, v4)