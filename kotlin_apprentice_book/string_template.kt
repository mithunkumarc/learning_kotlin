/* 
* string template
*/

// import statements

fun getMsg(name: String, age: Int) : String {
    return "hi my name is $name and age is $age"
}

fun main() {
    val msg = getMsg("rajat",33)
	println(msg) // hi my name is rajat and age is 33
}
