/*
 * 	Pair or Triple are types that represent data composed 
 * of two or three values of any type. (example : tuple in typescript?)
 * If you want to have more than three values, you use what Kotlin calls a data class.
 * 
 */
 
// import statements


fun main() {
	val coordinates3D = Triple(2, 3, 1) // type is inferred
    val (x3, y3, _) = coordinates3D // ignoring z3
    /*
     * or 
     * x3 = coordinates3D.first
     * y3 = coordinates3D.second
     * z3 = coordinates3D.third
     * */
    print("x3 is $x3 and y3 is $y3")
}

