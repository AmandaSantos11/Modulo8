package ex6

class ContaPoupanca(agencia:Int,conta:Int,nome:String,saldo:Double):Conta(agencia,conta,nome,saldo){

    override fun saque(valor: Double) {
        if (valor>saldo){
            println("Saldo insuficiente")
        }
        else{
            super.saque(valor)
            saldo()
        }
    }

    override fun deposito(valor: Double, pergunta:Boolean) {
        if (pergunta){
            super.deposito(valor,pergunta)
            saldo()
        }
        else{
            println("Conta Poupança só pode receber depósito do usuário")
        }
    }
}