/*
 * 	Pair or Triple are types that represent data composed 
 * of two or three values of any type. (example : tuple in typescript?)
 * If you want to have more than three values, you use what Kotlin calls a data class.
 * 
 */
 
// import statements

// first way to initialize pair
// val coordinates: Pair<Int, Int> = Pair(2,6)

// second way
val coordinates: Pair<Int, Int> = 2 to 6

// mixed datatype
val userData: Pair<String, Int> = "rajat" to 32

fun main() {
	println(coordinates)
    println(userData)
    // reading
    val (x,y) = coordinates
    println("x : $x and y : $y")
    
    val (name, age) = userData
    println("name: $name and $age")
}

/*
  	(2, 6)
	(rajat, 32)
    x : 2 and y : 6
    name: rajat and 32
*/
