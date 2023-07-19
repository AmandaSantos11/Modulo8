package ex3
import java.math.BigDecimal
import java.time.LocalDate

class Conversor {
    val diaAtual = LocalDate.now()

    val cotacaoDolarAmericano = BigDecimal(4.80)
    val cotacaoDolarCanadense = BigDecimal(3.65)
    val cotacaoEuro = BigDecimal(5.37)
    val cotacaoLibraEsterlina = BigDecimal(6.19)

    val mensagemDeAviso = "AVISO: Só converto dinheiro para Real(R\$)\n -----------------"

    fun converterDolarAmericano(){
        println(mensagemDeAviso)
        var continuar = true
        do {
            try {
                println("Informe a quantidade que deseja converter:")
                val valor = BigDecimal(readln().toDouble())
                val verificarValor = valor.toInt()
                if (!(verificarValor<=0)){
                    println("No dia $diaAtual:\nA cotação do Dólar Americano está em: US$${cotacaoDolarAmericano.toDouble()}\n"+
                            "O valor que será convertido é de: US$${valor.toDouble()}\n" +
                            "O valor convertido em real é: R$${valor.multiply(cotacaoDolarAmericano).toDouble()}")
                    continuar=true
                }
                else{
                    println("Valor inválido, por favor, tente novamente\n")
                    continuar=false
                }
            }catch (exception:NumberFormatException){
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Mensagem: Para moeda, o valor monetário deve ser um número decimal")
                main()
            }
        }while (!continuar)
    }

    fun converterDolarCanadense(){
        println(mensagemDeAviso)
        var continuar = true
        do {
            try {
                println("Informe a quantidade que deseja converter:")
                val valor = BigDecimal(readln().toDouble())
                val verificarValor = valor.toInt()
                if (!(verificarValor<=0)){
                    println("No dia $diaAtual:\nA cotação do Dólar Canadense está em: C$${cotacaoDolarCanadense.toDouble()}\n"+
                            "O valor que será convertido é de: C$${valor.toDouble()}\n" +
                            "O valor convertido em real é: R$${valor.multiply(cotacaoDolarCanadense).toDouble()}")
                    continuar=true
                }
                else{
                    println("Valor inválido, por favor, tente novamente\n")
                    continuar=false
                }
            }catch (exception:NumberFormatException){
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Mensagem: Para moeda, o valor monetário deve ser um número decimal")
                main()
            }
        }while (!continuar)
    }

    fun converterEuro(){
        println(mensagemDeAviso)
        var continuar = true
        do {
            try {
                println("Informe a quantidade que deseja converter:")
                val valor = BigDecimal(readln().toDouble())
                val verificarValor = valor.toInt()
                if (!(verificarValor<=0)){
                    println("No dia $diaAtual:\nA cotação do Euro está em: €${cotacaoEuro.toDouble()}\n"+
                            "O valor que será convertido é de: €${valor.toDouble()}\n" +
                            "O valor convertido em real é: R$${valor.multiply(cotacaoEuro).toDouble()}")
                    continuar=true
                }
                else{
                    println("Valor inválido, por favor, tente novamente\n")
                    continuar=false
                }
            }catch (exception:NumberFormatException){
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Mensagem: Para moeda, o valor monetário deve ser um número decimal")
                main()
            }
        }while (!continuar)
    }

    fun converterLibraEsterlina(){
        println(mensagemDeAviso)
        var continuar = true
        do {
            try {
                println("Informe a quantidade que deseja converter:")
                val valor = BigDecimal(readln().toDouble())
                val verificarValor = valor.toInt()
                if (!(verificarValor<=0)){
                    println("No dia $diaAtual:\nA cotação da Libra Esterlina está em: £${cotacaoLibraEsterlina.toDouble()}\n"+
                            "O valor que será convertido é de: £${valor.toDouble()}\n" +
                            "O valor convertido em real é: R$${valor.multiply(cotacaoLibraEsterlina).toDouble()}")
                    continuar=true
                }
                else{
                    println("Valor inválido, por favor, tente novamente\n")
                    continuar=false
                }
            }catch (exception:NumberFormatException){
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Mensagem: Para moeda, o valor monetário deve ser um número decimal")
                main()
            }
        }while (!continuar)
    }
}


