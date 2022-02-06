/* 
* string and char datatype
*/

// import statements

 
fun main() {
	val letter: Char = 'a';
    println(letter::class.java.typeName) // char
    val type = letter.javaClass.kotlin
    println(type.simpleName) // char
    
    val stringDog: String = "Dog"
    println(stringDog);
    println(stringDog::class.java.typeName) // java.lang.String
	  println(stringDog.javaClass.kotlin.simpleName) // String
}
