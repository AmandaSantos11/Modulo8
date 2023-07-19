package ex1

fun main(){
    val calculo = CalculoMatematico()
    do {
        println("Digite um número inteiro:")
        val dividendo = readln().toInt()
        println("Digite outro número inteiro:")
        val divisor = readln().toInt()
        val resultado = calculo.divisao(dividendo,divisor)

        if (resultado==0){
            println()
        }
        else{
            println("Resultado: $resultado")
        }
    }while (resultado==0)
}