/* 
* Operators with mixed types
* ex : you have one int value and double value and you want product of both values
*/

// import statements

 
fun main() {
	var n: Int = 100
    var d: Double = 12.5
    var c = n * d.toInt()
    println(c) // downcase(overflow occues) //1200
    //or if want : product in double 
    var b = n.toDouble() * d
    println(b) // 1250.0
}
