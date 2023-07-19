package ex3
import java.lang.IllegalArgumentException

fun main(){
    val conversor = Conversor()
        try {
            println("\n===== Boas vindas ao conversor de moedas =====")
            println("Deseja converter qual moeda: \n1-Dólar americano | 2-Dólar canadense | 3-Euro | 4-Libra Esterlina | 5-Sair")
            val opcao = readln().toInt()
            when(opcao){
                1 -> {conversor.converterDolarAmericano()}
                2 -> {conversor.converterDolarCanadense()}
                3 -> {conversor.converterEuro() }
                4 -> {conversor.converterLibraEsterlina()}
                5 -> { println("Obrigado(a) por utilizar nosso conversor!")
                    System.exit(0) }
                else -> { throw IllegalArgumentException("Tipo de moeda inválido") }
            }
        }catch (exception:IllegalArgumentException){
            exception.printStackTrace()
            println("Causa: ${exception.cause}")
            println("Mensagem: ${exception.message}")
            main()
        }
        finally {
            println("\nDeseja fazer uma nova conversão?\n1-Sim | 2-Não")
            when(readln().toInt()){
                1 -> { main()
                    println() }
                2 -> { println("Obrigado(a) por utilizar nosso conversor!")
                    System.exit(0)}
                else -> { println("Opção inválida!")
                    System.exit(0) }
            }
        }
}