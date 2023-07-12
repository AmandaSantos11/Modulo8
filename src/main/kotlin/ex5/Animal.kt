package ex5

open class Animal (var nome:String,var raca:String,var dono:String) {
    open fun movimentar(){}
    open fun comer(){}
    open fun dormir(){}
    open fun exibirInformacoes(){
        println("====Informações do animal====")
        println("Nome: $nome\nRaça: $raca\nDono: $dono")
    }
}

