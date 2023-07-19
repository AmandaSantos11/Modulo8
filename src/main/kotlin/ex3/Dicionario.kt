package ex3

class Dicionario {

    private var dicionario = mutableListOf<String>()

    fun adicionarUmTermo(termo:String){
        dicionario.add(termo)
    }

    fun procurarTermo(termo:String){
        for (i in dicionario){
            if (i.equals(termo, ignoreCase = true)){
                println("\nTermo encontrado: $i")
                return
            }
        }
        println("\nTermo não encontrado")
    }

    fun mostrarDicionario(){
        println("==Dicionário==")
        for (i in dicionario.sorted())
        println(i)
    }
}