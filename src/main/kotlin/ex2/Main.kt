package ex2

fun main(){
    println("----Sua idade----")
    val usuario = Pessoa("Lola",0,0,0,0)
    usuario.ajustaDataDeNascimento(5,12,2005)
    usuario.calculaIdade()
    println("Nome: ${usuario.informarNome()}\nIdade: ${usuario.informarIdade()}\n")

    println("----Idade atual de alguns famosos----")
    val albert = Pessoa("Albert Einsten",0,0,0,0)
    albert.ajustaDataDeNascimento(14,3,1879)
    albert.calculaIdade()
    println("Nome: ${albert.informarNome()}\nIdade: ${albert.informarIdade()}\n")

    val isaac = Pessoa("Isaac Newton",0,0,0,0)
    isaac.ajustaDataDeNascimento(4,1,1643)
    isaac.calculaIdade()
    println("Nome: ${isaac.informarNome()}\nIdade: ${isaac.informarIdade()}")

}