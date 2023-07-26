package ex1

class Produto {

    fun produtoMaisBarato(vetor:Array<Double>):Double{
        val produto = vetor.min()
        return produto
    }
}