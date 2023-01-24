import javafx.application.Application
import java.lang.Exception
import java.security.spec.ECField
import kotlin.math.pow

fun Task2(){
    println("Введите координаты точки A через пробел(x y):")
    var A = readLine().toString().split(" ")
    Validate(A);
    println("Введите координаты точки B через пробел(x y):")
    var B = readLine().toString().split(" ")
    Validate(B)
    var d: Double = dist(A,B)
    println(d)
}
fun Validate(C: List<String>){
    try {
        Pair(C[0].toDouble(),C[1].toDouble())
    }catch (e: Exception){
        println("Неверный формат!")
        System.exit(0)
    }
}
fun dist(A:List<String>,B:List<String>): Double{
    var (x1,y1) = Pair(A[0].toDouble(),A[1].toDouble())
    var (x2,y2) = Pair(B[0].toDouble(),B[1].toDouble())
    return Math.sqrt((x2-x1).pow(2) + (y2-y1).pow(2))
}