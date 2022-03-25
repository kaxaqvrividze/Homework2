import kotlin.math.*

class Point(var X: Int, var Y: Int) {

    fun move(){
        X *= -1
        Y *= -1
    }

    override fun toString(): String {
        return "y = $Y; x = $X"
    }
    override fun equals(other: Any?): Boolean {
        if(other !is Point)
            return false
        return other.Y == this.Y && other.X == this.X
    }

    fun distance(point: Point): Double{
        return sqrt((X - point.X).toDouble().pow(2.0) + (Y - point.Y).toDouble().pow(2.0))
    }


}