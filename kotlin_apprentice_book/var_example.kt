/* 
* var example
* more info : https://kotlinlang.org/docs/properties.html
*/

// import statements

/*
 * var / val both can be declared here
 * both are called property of this kotlin file/script
 * */

// var i: Int // error : property must be initialized
var k: String = "hello" //ok, datatype not required
var t = 5 // ok , datatype inferred
 
fun main() {
    var g: Int // ok , while declaring type, initialization is optional
    // var k // error : no type or not value so error
    // print(g) // error : must be intialized
    var t: String = "kotlin" // ok
    var x = 10 // ok, value is inferred
    print("***end***")
}
