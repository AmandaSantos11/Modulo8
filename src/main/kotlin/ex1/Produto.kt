package ex1
import java.time.LocalDate
import java.time.format.DateTimeFormatter
open class Produto (var nome:String,var codigoDeBarra:Int,var dataDeValidade:LocalDate) {
    open fun cadastrar(){
        println("Digite o nome do produto:")
        nome = readln()
        println("Digite o código de barra:")
        codigoDeBarra = readln().toInt()
        println("Digite a data de validade:")
        var data = readln()
        val formato = DateTimeFormatter.ofPattern("dd/MM/yyyy")
        dataDeValidade = LocalDate.parse(data,formato)
    }

    open fun exibirProdutos(){
        println("====Produtos====")
    }
}

class Bebidas(nome:String,codigoDeBarra:Int,dataDeValidade:LocalDate): Produto(nome, codigoDeBarra, dataDeValidade){
    var listaDeBebidas = ArrayList<Bebidas>()
    override fun cadastrar(){
        super.cadastrar()
        listaDeBebidas.add(Bebidas(nome,codigoDeBarra,dataDeValidade))
    }

    override fun exibirProdutos() {
        super.exibirProdutos()
        for (i in listaDeBebidas){
            println("Produto: ${i.nome}\nCódigo de barra: ${i.codigoDeBarra}\nData de validade: ${i.dataDeValidade}\n------")
        }
    }
}

class Laticinios(nome:String,codigoDeBarra:Int,dataDeValidade:LocalDate): Produto(nome, codigoDeBarra, dataDeValidade){
    var listaDeLaticinios = ArrayList<Laticinios>()
    override fun cadastrar(){
        super.cadastrar()
        listaDeLaticinios.add(Laticinios(nome,codigoDeBarra,dataDeValidade))
    }

    override fun exibirProdutos() {
        super.exibirProdutos()
        for (i in listaDeLaticinios){
            println("Produto: ${i.nome}\nCódigo de barra: ${i.codigoDeBarra}\nData de validade: ${i.dataDeValidade}\n------")
        }
    }
}

class Acougue (nome:String,codigoDeBarra:Int,dataDeValidade:LocalDate): Produto(nome, codigoDeBarra, dataDeValidade){
    var listaDeAcougue= ArrayList<Acougue>()
    override fun cadastrar(){
        super.cadastrar()
        listaDeAcougue.add(Acougue(nome,codigoDeBarra,dataDeValidade))
    }

    override fun exibirProdutos() {
        super.exibirProdutos()
        for (i in listaDeAcougue){
            println("Produto: ${i.nome}\nCódigo de barra: ${i.codigoDeBarra}\nData de validade: ${i.dataDeValidade}\n------")
        }
    }
}