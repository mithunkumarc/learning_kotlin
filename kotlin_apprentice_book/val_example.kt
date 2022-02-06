
/* 
* val : used to create constant
* val must declare its type of initialized with value
* val x: Int //ok but you cannot use it yet
* data type will be inferred after initialization
* val y: Int = 3 //ok
* 
*/
// imports packages
/*
 * any var/val declared here(outside function) must be initialized , else throws error
 * property must be initialized error 
 * 
 * */

// val k: Int // Property must be initialized (k) (not a local var)
val t = 5 // ok, its a property of package

fun main() {
    // val y   // error no type
	val x: Int
    // println(x) // error : local variables must be initialized before using
    val y: String = "hello" // datatype not required
    println(y)
    val z = 12.3f
  
    println(z)
    
}
