package ex2

class Livros (var titulo:String,var qtdPaginas:Int,var paginasLidas:Int) {

    fun verificarProgresso(){
        val porcentagem = (paginasLidas*100)/qtdPaginas
        println("Você já leu $porcentagem por cento do livro")
    }
}