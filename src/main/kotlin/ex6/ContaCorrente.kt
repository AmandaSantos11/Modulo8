package ex6

class ContaCorrente(agencia:Int,conta:Int,nome:String,saldo:Double):Conta(agencia,conta,nome,saldo){

    override fun saque(valor: Double) {
        super.saque(valor)
        saldo()
    }

    override fun deposito(valor: Double, pergunta:Boolean) {
        if (valor>5000.00){
            println("Operação inválida,procure a sua agência")

        }
        else{
            super.deposito(valor,pergunta)
            saldo()
        }
    }
}