#### main funciton : 

          //main function with command line arguments
          fun main(args : Array<String>){
            println(args[0]) 	//next line at end
            print(args[1])	
          }

          executing kotlin file : 

                  >> kotlinc helloworld.kt -include-runtime -d hello.jar
                  >> java -jar hello.jar
                  >> java -jar hello.jar hello world
                  hello
                  world
                  >> 


#### main function without command line args

            //main function without command line args
            fun main(){
              println("hello world")	
            }



#### running kotlin file as script : filename : myscript.kts

              val a = 100
              var b = 200
              println(a + b)
              
              >> kotlinc -script myscript.kts
              >> 300



