def pack[T](xs: List[T]): List[List[T]] = xs match {
  case Nil => Nil
  case x :: _ =>
    val (first, rest) = xs span (y => y.equals(x))
    first :: pack(rest)
}

def encode[T](xs: List[T]): List[(T, Int)] =
  pack(xs) map (ys => (ys.head, ys.length))


val data: List[String] = List("a", "a", "a", "b", "c", "c", "a")
pack(data)
encode(data)