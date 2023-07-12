package ex6

open class Conta(var agencia:Int=0,var conta:Int=0,var nome:String="",var saldo:Double=0.0) {
    open fun deposito(valor:Double, pergunta:Boolean){
        saldo += valor
    }
    open fun saque(valor:Double){
        saldo -= valor
    }
    open fun saldo(){
        println("Saldo atual: R$$saldo")
    }
    open fun exibirInformacoes(){
        println("====Informações da conta====")
        println("Nome: $nome\nAgência: $agencia\nConta: $conta\nSaldo: $saldo")
    }
}