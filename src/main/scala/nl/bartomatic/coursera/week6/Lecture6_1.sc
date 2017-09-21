val xs = Array(1, 2, 3, 44)
xs map (x => x * 2)

val s = "Hello World"
s filter (c => c.isUpper)
s exists (c => c.isUpper)
s forall (c => c.isUpper)

val pairs = List(1, 2, 3, 4, 5) zip s
pairs.unzip

s flatMap (c => List('.', c))

xs.sum
xs.max

val bla = (1 to 5) flatMap (x => (1 to 6) map (y => (x, y)))

def scalarProduct(xs: Vector[Double], ys: Vector[Double]): Double =
  (xs zip ys).map { case (x, y) => x * y }.sum

val a = Vector[Double](1.2, 1.3, 1.4)
val b = Vector[Double](2.1, 2.2, 2.3)
scalarProduct(a, b)


def isPrime(n: Int): Boolean = (2 until n) forall (x => n % x != 0)
isPrime(7)
isPrime(3)
isPrime(2)
isPrime(4)
isPrime(29)



