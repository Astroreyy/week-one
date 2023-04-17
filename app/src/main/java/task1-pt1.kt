import java.util.Scanner
fun TheFunction( x : Int , y : Int , z : Int ) : Int {

            if (x>y && x>z){        println("max is $x")
                if(y>z){            println("min is $z")}
                else{            println("min is $y")}}

            if (y>x && y>z){        println("max is $y")
                if (x>z){            println("min is $z")}
                else{ println("min is $x")}    }

            else{        println("max is $z")
                if(x>y){ println("min is $y")}        else{ println("min is $x")}}

            var evenList: MutableList<Int> = mutableListOf<Int>()
            var oddList: MutableList<Int> = mutableListOf<Int>()
            var myList: MutableList<Int> = mutableListOf<Int>()
            myList.add(x)
            myList.add(y)
            myList.add(z)
            for (number in myList)
                if (number%2==0){
                    evenList.add(number)}
                else{
                    oddList.add((number))        }
            print("the odd numbers are :" + oddList)
            print("the even numbers are :" + evenList)
            return (x+y+z)/3}
fun main(): Unit {
            val x1 = Scanner(System.`in`)
            print("Enter x: ")
            var x:Int = x1.nextInt()
            val y1 = Scanner(System.`in`)
            print("Enter y: ")
            var y:Int = y1.nextInt()
            val z1 = Scanner(System.`in`)
            print("Enter z: ")
            var z:Int = z1.nextInt()
    TheFunction(x,y,z)
}
