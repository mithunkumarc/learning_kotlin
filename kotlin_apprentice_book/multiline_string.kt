/* 
* multiple lines string
*/

// import statements

fun main() {
    val msg: String = """
    hello
    kotlin
    new
    programming language
    """
    println(msg)
    
    // use margin for readability, but remove while printing
	// use trimMargin() to remove extra spaces at the left
    val bigString = """
    |You can have a string
    |that contains multiple
    |lines
    |by
    |doing this.
    """.trimMargin()
    println(bigString)
}


/* 
    hello
    kotlin
    new
    programming language
    
You can have a string
that contains multiple
lines
by
doing this.
 */

