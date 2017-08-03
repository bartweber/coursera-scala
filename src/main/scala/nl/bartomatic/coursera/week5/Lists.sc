def last[T](xs: List[T]): List[T] = xs match {
  case List() => throw new Error("last of empty list")
  case List(x) => Nil
  case y :: ys => ys
}

def init[T](xs: List[T]): List[T] = xs match {
  case List() => throw new Error("init of empty list")
  case List(x) => Nil
  case y :: ys => y :: init(ys)
}

def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {
  case List() => ys
  case z :: zs => z :: concat(zs, ys)
}

def reverse[T](xs: List[T]): List[T] = xs match {
  case List() => xs
  case y :: ys => reverse(ys) ++ List(y)
}

def removeAt[T](n: Int, xs: List[T]): List[T] = (xs take n) ::: (xs drop n + 1)

def flatten(xs: List[Any]): List[Any] = xs match {
  case List() => xs
  case y :: ys =>
    (y match {
      case z :: zs => flatten(List(z)) ::: flatten(zs)
      case _ => List(y)
    }) ::: flatten(ys)
}

val a = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
val b = List(9, 8, 7, 6, 5, 4, 3, 2, 1)
init(a)
concat(a, b)
reverse(a)
removeAt(1, a)
removeAt(-1, a)
removeAt(1, List(1))
flatten(List(List(1, 1), 2, List(3, List(5, 8))))
flatten(Nil)
flatten(List(1))
flatten(List(List(List(List(List(List(1), 2), 3), 4), 5), 6))