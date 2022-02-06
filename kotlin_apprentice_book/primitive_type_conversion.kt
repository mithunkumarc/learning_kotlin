/* 
* primitive type conversion 
* more info: https://kotlinlang.org/docs/typecasts.html#unchecked-casts
*/

// import statements

 
fun main() {
	var n: Int = 100
    var d: Double = 12.5
    // n = d // type mismatch
    // use buitin function to convert
    var c: Int = d.toInt()
	println(c) // 12 , overflow(dataloss) : big datatype to small datatype
}
