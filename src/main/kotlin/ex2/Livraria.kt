package ex2
fun main(){
    menuPrincipal()
}

private val romance = Romance("","")
private val terror = Terror("","")
private val fantasia = Fantasia("","")
private var continuar=true

fun menuPrincipal(){
    do {
        println("Você deseja:\n1-Cadastrar livro | 2-Ver livros | 3-Sair")
        val escolha = readln().toIntOrNull()
        when(escolha){
            1 -> menuEscolha()
            2 -> menuExibir()
            3 -> System.exit(0)
            else -> {
                continuar=false
                println("Opção inválida!")
            }
        }
    }while (!continuar)
}

fun menuEscolha(){
    do {
        println("Deseja cadastrar qual gênero de livro:\n1-Romance | 2-Terror| 3-Fantasia | 4-Voltar")
        val escolha = readln().toIntOrNull()
        when(escolha){
            1 -> {
                romance.cadastrar()
                menuEscolha()}
            2 -> {
                terror.cadastrar()
                menuEscolha()}
            3 -> {
                fantasia.cadastrar()
                menuEscolha()}
            4 -> menuPrincipal()
            else -> {
                continuar=false
                println("Opção inválida!")
            }
        }
    }while (!continuar)
}

fun menuExibir(){
    do {
        println("Deseja ver qual gênero:\n1-Romance | 2-Terror | 3-Fantasia | 4-Voltar")
        val escolha = readln().toIntOrNull()
        when(escolha){
            1 -> {
                romance.exibirLivros()
                menuExibir()}
            2 -> {
                terror.exibirLivros()
                menuExibir()}
            3 -> {
                fantasia.exibirLivros()
                menuExibir()}
            4 -> menuPrincipal()
            else -> {
                continuar=false
                println("Opção inválida!")
            }
        }
    }while (!continuar)
}