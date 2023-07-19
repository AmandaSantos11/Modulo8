package ex6

class GuardaVolumes {
    var contador=0
    var dicionario = mutableMapOf<Int,ArrayList<Pecas>>()

    fun guardarPecas(listaDePeca:ArrayList<Pecas>):Int{
        contador++
        dicionario[contador] = listaDePeca
        return contador
    }

    fun mostrarPecas(){
        println("===Peças do Guarda Volume===")
        for ((chave,valor) in dicionario){
            println("Identificação:$chave")
            for (peca in valor){
                println("Marca:${peca.marca}\nModelo:${peca.modelo}\n")
            }
        }
    }

    fun mostrarPecasComIdentificacao(identificador:Int){
        if (dicionario.containsKey(identificador)){
            println("===Suas peças===")
            for (peca in dicionario.getValue(identificador)){
                println("Marca:${peca.marca}\nModelo:${peca.modelo}\n")
            }
        }
        else{
            println("Identificador inválido!\n")
        }
    }

    fun devolverPeca(identificador:Int){
        if (dicionario.containsKey(identificador)){
            dicionario.remove(identificador)
            println("Sua peça foi devolvida\n")
        }
        else{
            println("Identificador inválido!\n")
        }
    }
}