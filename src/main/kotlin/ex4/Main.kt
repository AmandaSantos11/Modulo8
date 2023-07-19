package ex4

private val habitante = Usuario()

fun main(){

    menuPrincipal()
}
fun menuPrincipal(){
    do {
        println("Você deseja:\n1-Se cadastrar | 2-Ver habitantes | 3-Ver salários | 4-Ver calculo de imposto | 5-Sair")
        val opcao = readln().toInt()
        when(opcao){
            1 -> { habitante.cadastrarUsuario()}
            2 -> { habitante.mostrarInformacoes()}
            3 -> { habitante.mostrarSalarios()}
            4 -> { habitante.calcularImposto()}
            5 -> {System.exit(0)}
            else -> {
                println("Opção inválida")
            }
        }
    }while (opcao != 5)
}