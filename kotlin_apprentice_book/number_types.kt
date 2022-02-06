/*
 * 	Number types
 *  Byte : 1 byte
 * 	Short : 2 bytes
 *  Int : 4 bytes
 *  Long : 8 bytes
 *  Float : 4 bytes : precision decimal : 6 digits
 *  Double : 8 bytes : precision decimal : 15 digits
 */
 
// import statements


/*
 * kotlin directly wraps primitive to object,
 * even you declare a number as Int, internally it will be converted to wrapper object
 * 
 * */


fun main() {
	val a: Short = 2
    val b: Byte = 120
    val c: Int = -10000 
    val d = a + b + c
    println("d : $d, datatype is ${d.javaClass.kotlin.simpleName}") // output Int
}

/*
 * output : d : -9878, datatype is Int
 * */
