fun main(){
 
    sayHello("Dev", 22);  // -> argument

    val hasInternetConnection = false;
    if(hasInternetConnection){
        getData("hehe boi is your data!")
    }
    else{
        showErrorMessage("You do not have an active internet connection!")
    }

    val a = 3.4;
    val b = 5.0;
    val max = getMax(a, b);
    println(max)

    sendMessage("Alexa", "Welcome to the company!");
}

fun sayHello(name: String, age: Int){ // -> parameter

    
    println("Hello to you $name!, your age is $age!")

    
}

fun getData(data: String){

    println("The data is $data");
}

fun showErrorMessage(message: String){
    println("Error getting data: $message")
}

// fun getMax(a: Int, b: Int): Int{
//     return if (a > b) a else b;    
// }
fun getMax(a: Int, b: Int) = if (a > b) a else b
fun getMax(a: Double, b: Double) = if (a > b) a else b

fun sendMessage(name: String, message: String){
    println("Hi $name, ")
}
