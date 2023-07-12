package ex3

class SistemaDeNotas {

    private var vetorDeNotas = arrayOf<Double>()
        get() {return field}
        set(value){field = value}

    internal fun receberNotas() {
        var nota: Double?

        for (i in 1..4) {
            println("Digite a ${i}º nota:")
            nota = readln().toDoubleOrNull()
            while (nota == null || !(nota >= 0 && nota <=10)){
                println("Nota inválida, digite novamente:")
                nota = readln().toDoubleOrNull()
            }
            vetorDeNotas = vetorDeNotas.plus(nota)
        }
        calculoDaMedia(vetorDeNotas)
    }

    internal fun calculoDaMedia(vetorDeNotas: Array<Double>){
        val media = vetorDeNotas.sum()/4
        println("\nMédia = $media")
        menuDeEscolha()
    }

    private fun menuDeEscolha(){
        vetorDeNotas = arrayOf()
        println("\nNovo cálculo?\n1-Sim | 2-Não")
        when(readln().toIntOrNull()){
            1 -> receberNotas()
            2 -> System.exit(0)
            else -> { menuDeEscolha() }
        }
    }
}


