fun main(){
    val X: Point = Point(1,1)
    val Y: Point = Point(-1,1)

    println(X)
    println(X.distance(Y))
    X.move()
    println(X)

}