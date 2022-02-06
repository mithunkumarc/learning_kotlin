/* 
* string template
* $var and ${expr}
* supports expression
*/

// import statements

fun getMsg(name: String, age: Int) : String {
    return "hi my name is $name and age is $age"
}

fun getExprAdditionMsg(a: Int, b: Int): String {
    return "the sum of $a and $b is ${a+b}"
}

fun main() {
    val msg = getMsg("rajat",33)
	println(msg) // hi my name is rajat and age is 33
	println(getExprAdditionMsg(3,5))
}
