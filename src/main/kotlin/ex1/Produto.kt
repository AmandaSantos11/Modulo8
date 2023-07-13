package ex1
import kotlin.time.Duration.Companion.minutes

abstract class Produto (var nome:String,var preco:Double,var codigoDeBarra:Int){
    private var vetorDeProdutos = arrayOf<Any>()

    abstract fun mostrarDetalhesDoItem()

    open fun adicionarProdutoNoVetor(produto:Any){
        vetorDeProdutos = vetorDeProdutos.plus(produto)
        for (i in vetorDeProdutos){
            mostrarDetalhesDoItem()
            println("----------------")
        }
    }
}

class Livros(nome:String, preco:Double, codigoDeBarra:Int,var autor:String) : Produto(nome,preco,codigoDeBarra){
    override fun mostrarDetalhesDoItem() {
        println("Nome:$nome\nPreço:R$$preco\nCodigo de barras:$codigoDeBarra\nAutor:$autor") //get implícito
    }
}

class Cds(nome:String,preco:Double,codigoDeBarra:Int,var numeroDeFaixas:Int): Produto(nome,preco,codigoDeBarra){
    override fun mostrarDetalhesDoItem() {
        println("Nome:$nome\nPreço:R$$preco\nCodigo de barras:$codigoDeBarra\nNúmero de faixas:$numeroDeFaixas") //get implícito
    }
}

class Dvds(nome:String,preco:Double,codigoDeBarra:Int,var duracao:Int): Produto(nome, preco, codigoDeBarra){
    override fun mostrarDetalhesDoItem() {
        var duracaoHoras = duracao.minutes
        println("Nome:$nome\nPreço:R$$preco\nCodigo de barras:$codigoDeBarra\nDuração:$duracaoHoras") //get implícito
    }
}