package ex2

class Terror(nome:String,autor:String):Livro(nome,autor){
    private val livrosDeTerror = ArrayList<Terror>()

    override fun cadastrar() {
        super.cadastrar()
        livrosDeTerror.add(Terror(nome,autor))
    }

    override fun exibirLivros() {
        super.exibirLivros()
        for (i in livrosDeTerror){
            println("Nome:${i.nome}\nAutor:${i.autor}\n------")
        }
    }
}