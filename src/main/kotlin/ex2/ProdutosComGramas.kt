package ex2

abstract class ProdutosComGramas(var grama:Double,var nome:String){
    abstract fun compra()
    abstract fun mostrarLista()
}

class Verdura(grama:Double,nome:String):ProdutosComGramas(grama,nome){
    var listaVerdura = arrayListOf<Verdura>()

    override fun compra() {
        try {
            println("Informe a quantidade em gramas que deseja comprar:")
            var grama = readln()
            while (grama.contains('-') || grama=="0"){
                println("A quantidade não pode ser um número negativo, digite novamente:")
                grama= readln()
            }
            if (grama.isNullOrBlank()){
                throw UnsupportedOperationException()
            }
            if (!(grama.contains('.'))){
                throw NumberFormatException()
            }
            println("Informe o nome do produto:")
            var nome = readln()
            while (nome.isNullOrBlank()){
                println("Digite um nome válido:")
                nome= readln()
            }
            listaVerdura.add(Verdura(grama.toDouble(),nome))

        } catch (exception:UnsupportedOperationException){
            exception.printStackTrace()
            println("Causa: ${exception.cause}")
            println("Mensagem: Não é permitido inserir valor vazio")
        }
        catch (exception:NumberFormatException){
            exception.printStackTrace()
            println("Causa: ${exception.cause}")
            println("Mensagem: Para verdura, a quantidade deve ser informada com ponto")
        }
    }

    override fun mostrarLista(){
        if (listaVerdura.isEmpty()){
            println("Você não comprou nenhuma verdura")
        }
        else{
            println("A quantidade a ser comprada de verdura é ${listaVerdura.size}")
            for (i in listaVerdura){
                println("Nome: ${i.nome} | Gramas: ${i.grama}g")
            }
        }

    }

}
class Graos(grama:Double,nome:String):ProdutosComGramas(grama,nome){
    var listaGraos = arrayListOf<Graos>()

    override fun compra() {
        try {
            println("Informe a quantidade em gramas que deseja comprar:")
            var grama = readln()
            while (grama.contains('-') || grama=="0"){
                println("A quantidade não pode ser um número negativo, digite novamente:")
                grama= readln()
            }
            if (grama.isNullOrBlank()){
                throw UnsupportedOperationException()
            }
            if (!(grama.contains('.'))){
                throw NumberFormatException()
            }
            println("Informe o nome do produto:")
            var nome = readln()
            while (nome.isNullOrBlank()){
                println("Digite um nome válido:")
                nome= readln()
            }
            listaGraos.add(Graos(grama.toDouble(),nome))

        } catch (exception:UnsupportedOperationException){
            exception.printStackTrace()
            println("Causa: ${exception.cause}")
            println("Mensagem: Não é permitido inserir valor vazio")
        }
        catch (exception:NumberFormatException){
            exception.printStackTrace()
            println("Causa: ${exception.cause}")
            println("Mensagem: Para grãos, a quantidade deve ser informada com ponto")
        }
    }

    override fun mostrarLista(){
        if (listaGraos.isEmpty()){
            println("Você não comprou nenhum grãos")
        }
        else{
            println("A quantidade a ser comprada de grãos é ${listaGraos.size}")
            for (i in listaGraos){
                println("Nome: ${i.nome} | Gramas: ${i.grama}g")
            }
        }
    }
}