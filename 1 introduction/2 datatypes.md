#### dataType size in	Bits
            Double 	64
            Float 	32
            Long 	64
            Int 	32
            Short 	16
            Byte 	8

#### datatypes size in bytes

          fun main(){	
            println(Byte.SIZE_BYTES)//1
            println(Short.SIZE_BYTES)//2	
            println(Int.SIZE_BYTES)//4
            println(Long.SIZE_BYTES)//8
            println(Char.SIZE_BYTES)//2
            //Float , double has no size_bytes property
          }


#### type of data

            val a = 100
            val l : Long = 123;
            val b = 100.44f;
            val c : Byte = 23;
            val s : Short = 345;
            val d = 1234.345; //default decimal type is double
            val flag = true;
            val word = "hello"
            val letters = arrayOf('a','b','c','d','e')


            fun main(){
              println(a::class)  //class kotlin.Int
              println(l::class) //class Kotlin.Long
              println(b::class) //class kotlin.Float
              println(c::class) //class kotlin.Byte
              println(s::class) //class kotlin.Short
              println(d::class) //class kotlin.Double
              println(flag::class) // class kotlin.Boolean
              println(word::class) // class kotlin.String	
              println(letters::class) // class Kotlin.Array
            }

