fun main (){

    // OPERATORS

    // var x = 5;
    // var y = 3.0;

    // // val result = x + y;

    // println("x + y = ${x +  y}"); //placeholder way
    // println("x * y = ${x *  y}"); //placeholder way
    // println("x - y = ${x -  y}"); //placeholder way
    // println("x / y = ${x /  y}"); //placeholder way
    // println("x % y = ${x %  y}"); //placeholder way

    // var result = x + y;

    // result = result + 2;
    // result++;
    // println("result is ${result}");



    // println("3 + 3 * 4 = ${(3+3)*4}")
    // x = 0;
    // println(++x);




    //------------------------------------------CONDITIONAL STATEMENTS

    // val isActive = true;

    // if(isActive == true){
    //     println("The user is Active!")
    // }
    // else{
    //     println("The user is not active!")
    // }

    //WHEN STATEMENTS

    // val alarm = 8

    // val text = when {
    //     (alarm <= 10) -> "This is the time!"
    //     (alarm > 10 && alarm < 20) -> "Not yet"
    //     else -> "The time is $alarm"
    // }

    // println(text)


    // NULL VALUES MANAGEMENT

    var text: String? = null
    // println(text!!.length) 
    println(text?.length) 
    //!! - to get the exception if value is null
    //? -> to handle it by getting null as output if the value is null

    text = null
    val text2: String = text ?: "The variable is null." //if text is null assign the string after ?:
    println(text2)



}