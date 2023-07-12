package ex3
class Time (var nome:String, var qntdDeJogadores:Int, var qntdDeVitorias:Int, var esporte:String){
    fun exibir(){
        println("----Time----")
        println("Nome do time: $nome\nQuantidade de jogadores: $qntdDeJogadores\nVitórias: $qntdDeVitorias\nEsporte: $esporte")
    }
}