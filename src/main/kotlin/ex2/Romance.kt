package ex2

class Romance(nome:String,autor:String):Livro(nome,autor){
    private val livrosDeRomance = ArrayList<Romance>()

    override fun cadastrar() {
        super.cadastrar()
        livrosDeRomance.add(Romance(nome,autor))
    }

    override fun exibirLivros() {
        super.exibirLivros()
        for (i in livrosDeRomance){
            println("Nome:${i.nome}\nAutor:${i.autor}\n------")
        }
    }
}