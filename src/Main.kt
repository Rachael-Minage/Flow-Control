fun main() {
    isOdd()
   var arrayNames= nameList(arrayOf("Nancy", "Caudencia", "Otieno", "Trump", "Tony", "Lulu"))
println(arrayNames)
    partyRobot(12)
    partyRobot(16)
    partyRobot(2)
    fizzBuzz()
}

fun isOdd() {
    for (number in 1..100) {
        if (number % 2 != 0) {
            println(number)
        }
    }
}

fun nameList(names: Array<String>): Int {
    var len = 0
    names.forEach { name ->
        if (name.length > 5)
            len++

        }
        return len
    }
fun partyRobot(age: Int){
    if (age<=6){
        println("You get a glass of milk")
    }
    else if( age<=15){
        println("You get Fanta Orange")
    }
    else{
        println("You get CocaCola")
    }
}
fun fizzBuzz(){
    var totals =0
    for(number in 1..100){
        if ((number%3==0)&&(number%5==0)){
            println("FizzBuzz")
        }
        else if(number%3==0){
            println("Fizz")
        }
        else if (number%5==0){
            println("Buzz")
        }
        else{
            println(number)
        }

}
}