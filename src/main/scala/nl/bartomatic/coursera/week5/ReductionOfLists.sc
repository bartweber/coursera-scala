def sum(xs: List[Int]): Int = xs match {
  case Nil => 0
  case y :: ys => y + sum(ys)
}

def sumWithReduce(xs: List[Int]) = (0 :: xs) reduceLeft (_ + _)
def productWithReduce(xs: List[Int]) = (1 :: xs) reduceLeft (_ * _)
def sumWithFold(xs: List[Int]): Int = (xs foldLeft 0) (_ + _)
def productWithFold(xs: List[Int]) = (xs foldLeft 1) (_ * _)
def concat[T](xs: List[T], ys: List[T]): List[T] = (xs foldRight ys) (_ :: _)

def mapFun[T, U](xs: List[T], f: T => U): List[U] =
  (xs foldRight List[U]()) (f(_) :: _)

def lengthFun(xs: List[String]): Int =
  (xs foldRight 0) (_.length + _)

val a = List(1, 2, 3)
val b = List()
sum(a)
sumWithReduce(a)
productWithReduce(a)
sumWithFold(a)
productWithFold(a)
productWithFold(b)
mapFun[Int, Int](a, x => x * x)
lengthFun(List("aap", "noot", "mies"))