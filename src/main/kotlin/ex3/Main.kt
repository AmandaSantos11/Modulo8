package ex3

fun main(){
    val dicionario = Dicionario()

    dicionario.adicionarUmTermo("canela")
    dicionario.adicionarUmTermo("amora")
    dicionario.adicionarUmTermo("banana")
    dicionario.mostrarDicionario()
    dicionario.procurarTermo("bola")
}