package ex2

abstract class ProdutosComUnidade(var unidade:Int,var nome:String){
    abstract fun compra()
    abstract fun mostrarLista()
}

class Legumes(unidade: Int,nome: String):ProdutosComUnidade(unidade, nome){
    var listaLegumes = arrayListOf<Legumes>()

    override fun compra() {
        try {
            println("Informe a quantidade em unidades que deseja comprar:")
            var unidade = readln()
            while (unidade.contains('-') || unidade=="0"){
                println("A quantidade não pode ser um número negativo, digite novamente:")
                unidade= readln()
            }
            if (unidade.isNullOrBlank()){
                throw UnsupportedOperationException()
            }
            if (unidade.contains('.') || unidade.contains(',')){
                throw NumberFormatException()
            }
            println("Informe o nome do produto:")
            var nome = readln()
            while (nome.isNullOrBlank()){
                println("Digite um nome válido:")
                nome= readln()
            }
            listaLegumes.add(Legumes(unidade.toInt(),nome))

        } catch (exception:UnsupportedOperationException){
            exception.printStackTrace()
            println("Causa: ${exception.cause}")
            println("Mensagem: Não é permitido inserir valor vazio")
        }
        catch (exception:NumberFormatException){
            exception.printStackTrace()
            println("Causa: ${exception.cause}")
            println("Mensagem: Para legumes, a quantidade deve ser informada em unidades inteiras")
        }
    }

    override fun mostrarLista(){
        if (listaLegumes.isEmpty()){
            println("Você não comprou nenhum legumes")
        }
        else{
            println("A quantidade a ser comprada de legumes é ${listaLegumes.size}")
            for (i in listaLegumes){
                println("Nome: ${i.nome} | Unidades: ${i.unidade}")
            }
        }
    }
}

class Outros(unidade: Int,nome: String):ProdutosComUnidade(unidade, nome){
    var listaOutros = arrayListOf<Outros>()

    override fun compra() {
        try {
            println("Informe a quantidade em unidades que deseja comprar:")
            var unidade = readln()
            while (unidade.contains('-') || unidade=="0"){
                println("A quantidade não pode ser um número negativo, digite novamente:")
                unidade= readln()
            }
            if (unidade.isNullOrBlank()){
                throw UnsupportedOperationException()
            }
            if (unidade.contains('.') || unidade.contains(',')){
                throw NumberFormatException()
            }
            println("Informe o nome do produto:")
            var nome = readln()
            while (nome.isNullOrBlank()){
                println("Digite um nome válido:")
                nome= readln()
            }
            listaOutros.add(Outros(unidade.toInt(),nome))

        } catch (exception:UnsupportedOperationException){
            exception.printStackTrace()
            println("Causa: ${exception.cause}")
            println("Mensagem: Não é permitido inserir valor vazio")
        }
        catch (exception:NumberFormatException){
            exception.printStackTrace()
            println("Causa: ${exception.cause}")
            println("Mensagem: Para outros, a quantidade deve ser informada em unidades inteiras")
        }
    }

    override fun mostrarLista(){
        if (listaOutros.isEmpty()){
            println("Você não comprou nenhum outros")
        }
        else{
            println("A quantidade a ser comprada de outros é ${listaOutros.size}")
            for (i in listaOutros){
                println("Nome: ${i.nome} | Unidades: ${i.unidade}")
            }
        }
    }
}