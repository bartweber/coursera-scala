2 * 3
10 / 2
20 / (3 + 7)
1.+(2)
var x: Int = 1 + 2
println(x)
x = 3 * 4
println(x)
println("Hello world")

List(1, 2) map { i =>
  println("Hi")
  i + 1
}
List(1, 2) map {
  println("Hi")
  println("World")
  _ + 1
}