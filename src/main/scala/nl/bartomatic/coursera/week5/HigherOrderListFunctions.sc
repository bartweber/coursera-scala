def scaleList(xs: List[Double], factor: Double): List[Double] = xs match {
  case Nil => xs
  case y :: ys => y * factor :: scaleList(ys, factor)
}

def squareList(xs: List[Int]): List[Int] =
  xs match {
    case Nil => xs
    case y :: ys => (y * y) :: squareList(ys)
  }

def squareListWithMap(xs: List[Int]): List[Int] =
  xs map (x => x * x)

def posElems(xs: List[Int]): List[Int] = xs match {
  case Nil => xs
  case y :: ys => if (y > 0) y :: posElems(ys) else posElems(ys)
}

def posElemsWithFilter(xs: List[Int]): List[Int] =
  xs filter (x => x > 0)

val a = List[Int](1, 2, 3, 4, 5, 6)
val b = List[Double](1, 2, 3, 4, 5, 6)
val c = List[Int](-1, 2, -3, 4, -5, 6)
scaleList(b, 2)
squareList(a)
squareListWithMap(a)
posElems(c)
posElemsWithFilter(c)