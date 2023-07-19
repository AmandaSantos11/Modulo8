package ex6

private val guardaVolumes = GuardaVolumes()

    fun main(){
        do {
            println("Você deseja:\n1-Guardar peças | 2-Ver suas peças | 3-Retirar peças | 4-Ver peças do guarda volume | 5-Sair")
            val opcao = readln().toInt()
            when (opcao){
                1 -> { pedirPecas() }
                2 -> { mostrarPecaComIdentificador() }
                3 -> { devolverPecaComIdentificador() }
                4 -> { guardaVolumes.mostrarPecas() }
                5 -> {System.exit(0)}
                else -> {
                    println("Opção inválida!")
                }
            }
        }while (opcao != 5)
    }

    fun pedirPecas(){
        var listaDePecas = ArrayList<Pecas>()
        println("Deseja guardar quantas peças:")
        val quantidade = readln().toInt()
        for (i in 1..quantidade){
            println("Informe a marca:")
            var marca = readln()
            println("Informe o modelo:")
            var modelo = readln()

            listaDePecas.add(Pecas(marca, modelo))
        }
        println("Seu identificador é: ${guardaVolumes.guardarPecas(listaDePecas)}")
    }

    fun mostrarPecaComIdentificador(){
        println("Digite seu identificador:")
        val identificador = readln().toInt()
        guardaVolumes.mostrarPecasComIdentificacao(identificador)
    }

    fun devolverPecaComIdentificador(){
        println("Digite seu identificador:")
        val identificador = readln().toInt()
        guardaVolumes.devolverPeca(identificador)
    }