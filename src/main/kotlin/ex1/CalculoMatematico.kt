package ex1

class CalculoMatematico {

    fun divisao(numero1:Int,numero2:Int):Int{
        try {
            if (numero1>numero2){
                return numero1/numero2
            }
            return numero2/numero1
        }catch (exception:ArithmeticException){
            exception.printStackTrace()
            println("Causa: ${exception.cause}")
            println("Mensagem: Não é possível realizar a divisão com o número ZERO")
        }
    return 0
    }
}