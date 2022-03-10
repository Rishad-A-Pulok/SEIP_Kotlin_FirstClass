fun main() {
    /* var x: Int = 10 // var type variable value can be updated
    val a = 50 // val type variable value can't be updated ever
    var e: Int //int type value can be assigned later
    var z = 100 //no need to mention data type. Compiler will understand from the given value
    var y: Long = 1000
    var f: Float = 3.14f
    var d: Double = 9.8
    var status: Boolean = true
    var name: String = "Rishad"
    var c: Char = 'A'
    var s: Short = 100
    var b: Byte = 1
    val country: String = "Bangladesh"
    val country1: String = "USA"
    var count: Int = 1
    println("Result: "+x.times(5)) //It multiplies the x value 5 times
    println("The sum of $x and $z is ${x+z}") //it can be written as var sum = x+z and $sum
    println(x>z)
    println(x<z)
    println(x!=z)
    println(x==z)
    println("I live in $country but I want to shift to $country1 which is ${country1.length} character long")
    println(country[0])
     */

    //Convert alternative characters to uppercase and lowercase
    /* for(o in country){
        if(count % 2 == 0){
            println(o.uppercase())
        }
        else{
            println(o.lowercase())
        }
        count++
    }
     */
    //Check largest smallest among two numbers
    /* val a1 = 10
    val a2 = 20
    /* if(a1 > a2){
        println("$a1 is greater than $a2")
    }
    else if(a1 < a2){
        println("$a1 is less than $a2")
    }
    else{
        println("Both numbers are equal")
    }
     */
    //if-else block can be return a value in kotlin(Same example using return)
    val res = if(a1 > a2){ //value gotten from if else block will be stored in res variable. res is a string type variable
        "$a1 is greater than $a2"
    }
    else if(a1 < a2){
        "$a1 is less than $a2"
    }
    else{
        "Both numbers are equal"
    }
    println(res) //print the value of res variable which holds the output from if-else block
     */

    //if-else if-else condition example
    /* val temp = 20
    val condition = if(temp in 11..15){ //condition is represented in range
        "I'm in Ukraine"
    }
    else if(temp in 16..20){
        "I'm in Poland"
    }
    else if(temp in 21..25){
        "I'm in Argentina"
    }
    else if(temp in 26..30){
        "I'm in Uruguay"
    }
    else if(temp in 31..35){
        "I'm in Bangladesh"
    }
    else if(temp in 36..40){
        "I'm in Senegal"
    }
    else if(temp in 41..45){
        "I'm in Sahara"
    }
    else{
        "I am Mr. Nobody from nowhere"
    }
    println(condition)
     */
    //using when(replacement of switch case)
    /* val temp = 20
    val condition = when (temp) { //when condition
        in 11..15 -> {
            "I'm in Ukraine"
        }
        in 16..20 -> {
            "I'm in Poland"
        }
        in 21..25 -> {
            "I'm in Argentina"
        }
        in 26..30 -> {
            "I'm in Uruguay"
        }
        in 31..35 -> {
            "I'm in Bangladesh"
        }
        in 36..40 -> {
            "I'm in Senegal"
        }
        in 41..45 -> {
            "I'm in Sahara"
        }
        else -> {
            "I am Mr. Nobody from nowhere"
        }
    }
    println(condition)
     */

    //range example in for loop
    /* for(ab in 1..10) //from small to large value(upperTo)
        println("$ab ")
    for(ac in 10 downTo 1) //from large to small value(downTo)
        println("$ac")
     */

    //Collection
    /* val marks = listOf<Int>(10,20,30,40,50) //Collection(List) of int type data. List is immutable
    val data = mutableListOf<Int>(1,2,3,4,5) //Mutable list. Values can be added or deleted
    println(marks[2]) //output will be the value of 2nd index
    println(data.add(2,10)) //add new value to 2nd index
     */

    //Function example
    /* println( add(5,6))
    showFullName("Rishad","Pulok")
    showFullName(lastName = "Incarnate", firstName = "Beast")
     */

    //Annonymous function example
    /*var f:() -> Unit = {
        println("Hello World")
    } //Code block or function block
    f.invoke() // to call a function invoke() method is used

    var g:(String) -> Unit = {
        println(it) //single parameter pass
    }
    g("Rishad")

    //Lamda expression/Annonymous function. It can be used as variable in kotlin.
    var h:(String,String) -> Unit = {s1,s2 ->
        println("$s1 $s2") //multi parameter pass
    }
    h("Rishad","Pulok")

     */

    //Use of lamda expression
    val sum = add(x = 10, y = 20) { x, y ->
        println(x+y)
    } //reference pass of a function
    println(sum)

    //Use of lamda expression
    val cities = listOf("Dhaka","Chittagong","Tangail","Rajshahi","Khulna","Barishal","Sylhet")
    cities.forEach {
        println(it)
    }


}
/* fun add(x:Int, y:Int):Int{ //Can be written as fun add(x:Int, y:Int):Int = x+y which is called Compact function
    return x+y
}
fun showFullName(firstName:String,lastName:String) = println("$firstName $lastName")
 */

//Higher order function example
 fun add(x:Int, y:Int,action: (Int, Int) -> Unit){
    action(x,y) //call a function
}



