@file:JvmName("MainApplication")
fun main(args: Array<String>){
    println(defaultParamterFun(1))
    println(namedParamtersFun(b=2,a=3))
    println("Main function executed")
    println(replaceMultipleWhiteSpaces("with     multiple \t whitespace"))
    println("with     multiple \t whitespace".replaceMultipleWhiteSpacesEx())
    println(findFixPoint(10.0))
    var h1 = Header("H1")
    var h2 = Header("H2")
    //infix
    var h3 = h1 plus h2
    //operator with infix
    var h4 = h1+h2
    println(h3.name)
    println(h4.name)
}

/** default Parameter
 * You can have any number of paramter. You can call this function without defaul parameters
 */
fun defaultParamterFun(a:Int, b:Int=1):Int{
    return a+b
}

/**Named Paramters
 * Functions call paramters can be interchanged, but it has to have the parameter name.
 */

fun namedParamtersFun(a:Int,b:Int):Int{
    return a+b
}

/**Extension function :: static function
 *Addvantages
 *can add functions to classes not owned by you
 * cut down use of utility classes
 * generate kotlin static functions
 * make code easier to read
 */

/**below two function replaces the whiteSpace from the text.
 *One normal function and the other one is extension Function.
 */
fun replaceMultipleWhiteSpaces(value : String):String{
    var regex = Regex("\\s+")
    return regex.replace(value, " ")
}
fun String.replaceMultipleWhiteSpacesEx():String{
    var regex = Regex("\\s+")
    return regex.replace(this, " ")
}

/**Infix function
 */
class Header(var name : String){}

operator infix fun Header.plus(other : Header):Header{
    return Header(this.name+other.name)
}

//Tailrec function is for recursive

tailrec fun findFixPoint(x: Double = 1.0): Double
        = if (x == Math.cos(x)) x else findFixPoint(Math.cos(x))