package ex2

open class Livro(var nome:String,var autor:String) {

    open fun cadastrar(){
        println("Digite o nome do livro:")
        nome= readln()
        println("Digite o nome do autor:")
        autor= readln()
    }

    open fun exibirLivros(){
        println("====Nossos livros====\n")
    }
}