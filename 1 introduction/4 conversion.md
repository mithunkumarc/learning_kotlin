#### byte to int

        val i : Byte = 100
        val j = i             // ok : inferred type Byte will be assigned to j
        // val k : Int = i    //error : compiler inferred as Byte, but you are expecting Int 
        fun main(){	
          print(j)
          print(j::class)     //class Kotlin.Byte
        }
        
        
#### Every number type supports the following conversions:

        toByte(): Byte
        toShort(): Short
        toInt(): Int
        toLong(): Long
        toFloat(): Float
        toDouble(): Double
        toChar(): Char

#### example : 

        val i : Byte = 100

        fun main(){
            println(i.toByte())
            println(i.toString())
            println(i.toShort())    
            println(i.toInt())
            println(i.toLong())
            println(i.toFloat())
            println(i.toDouble())
            println(i.toChar())//ascii
        }
