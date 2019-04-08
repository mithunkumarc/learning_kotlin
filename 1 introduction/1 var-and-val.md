#### var : value can be changed

            //like c/c++ variables can be declared outside main method
            var a : Int = 100
            var b  = 200	//type inference 

            fun main(){
              println(a + b)
              a = 50	//reinitialized
              b = 100
              print(a +b) 
            }

            output ; 
            300
            150
            
            
#### val : cant be reinitilized

            //like c/c++ variables can be declared outside main method
            val a : Int = 100
            val b  = 200	//type inference 

            fun main(){
              println(a + b)
              //a = 50	//error : cant be reinitialized
              //b = 100	 
            }


