
fun main(){
    println("------------------Digite um numero [1..3]--------")
    val x = readLine()!!.toInt()
    when(x){
        1 -> {
            for (a in 1..20 step 1){
                println(a)
            }
        }
        2->{
            for (a in 20 until 30){
                println(a)
            }
        }
        3->{
            for (a in 10 downTo 0){
                println(a)
            }
        }
        else -> println("Valor inválido")
    }
}