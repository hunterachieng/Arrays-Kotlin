import java.util.*

fun main(){
    ages()
    intArrays()
}
fun ages() {
    var ages = arrayOf(34, 12, 56, 78, 95, 5, 56, 35, 74, 7)
    //setting values a indexes
    ages.set(3, 10)
    println(Arrays.toString(ages))
    // changing the value of an element without using set
    ages[5] = 63
    println(Arrays.toString(ages))
}
fun intArrays (){
    var numbers  = arrayOf(456,769,245,25,64)
    // adding new elements into an array
    var numbersArray = numbers.plus(45).plus(123)
    println(Arrays.toString(numbersArray))
    // length of the new array
    println(numbersArray.count())
    // identifying the minimum value in an array
    println(numbersArray.minOrNull())
    //identify the maximum value in an array
    println(numbersArray.maxOrNull())
}