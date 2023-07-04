fun main(){
println("This is the area of a circle  "+ circle(3.142,7.0))
    println(guess(90))
    println("This is the first random " + diceRoll(1..6))
    evenSum()
    println(primeNumbers(9))

}

//Write a program that calculates the area and circumference of a circle.
// The user should be prompted to enter the radius of the circle.
fun circle(pi:Double, radius:Double):Double{
    val area = pi*(radius*radius)
//    val circles = pi*(radius+radius)
    return area
//    return circles

}


//Write a program that generates a random number between 1 and 100 and prompts the user to guess the number.
// The program should keep prompting the user until they guess correctly.

fun guess(num:Int){
    if( num>100 &&num>1){
        println("that's not correct")
    }
    else{
        println(num)
    }
}

//Write a program that simulates a dice roll. The user should be prompted to enter the number
// of sides on the dice, and then the program should randomly generate a
// number between 1 and the number of sides. The program should then print out the result of the roll.

fun diceRoll(diceSides:IntRange):Int{
    var random = diceSides.random()
    return random
}

//Write a program that calculates the factorial of a number.
// The user should be prompted to enter the number.



//Write a program that calculates the sum of all even numbers between 1 and 100.
fun evenSum(){
    var f= 0
    for(i in 1..100) {
        if (i % 2 == 0) {
            f += i
        }
    }
    println("the sum of all even numbers between 1 to 100 is:$f")

}

//Write a program that prompts the user to enter a number
// and checks if it is a prime number.

fun primeNumbers(nums:Int){
    if(nums%nums==1){
        println("That's a prime number")
    }
    else(
        println("That is not a prime number")
    )
}


//Write a program that reads in a list of integers and finds the maximum and minimum values in the list.
fun values(value:Int){
    
}