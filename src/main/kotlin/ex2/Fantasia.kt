package ex2

class Fantasia(nome:String,autor:String):Livro(nome,autor){
    private val livrosDeFantasia = ArrayList<Fantasia>()

    override fun cadastrar() {
        super.cadastrar()
        livrosDeFantasia.add(Fantasia(nome,autor))
    }

    override fun exibirLivros() {
        super.exibirLivros()
        for (i in livrosDeFantasia){
            println("Nome:${i.nome}\nAutor:${i.autor}\n------")
        }
    }
}