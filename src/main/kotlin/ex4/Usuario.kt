package ex4

class Usuario () {
    private var nome:String=""
    private var profissao:String=""
    private var mapDoUsuario = mutableMapOf<Usuario,List<Double>>()

    constructor(nome:String,profissao:String):this(){
        this.nome=nome
        this.profissao=profissao
    }


    fun cadastrarUsuario(){
        var listaDeSalarios = mutableListOf<Double>()
        println("Digite seu nome:")
        nome = readln()
        println("Digite sua profissão:")
        profissao = readln()

        for (i in 1..12){
            println("Digite o seu salário do ${i}º mês:")
            listaDeSalarios.add(readln().toDouble())
        }
        mapDoUsuario[Usuario(nome, profissao)] = listaDeSalarios
    }

    fun mostrarInformacoes(){
        println("Informações do habitante:")
        for ((usuario,lista) in mapDoUsuario){
            println("Nome: ${usuario.nome}\nProfissão: ${usuario.profissao}")
            println()
        }
    }

    fun mostrarSalarios(){
        var mes = 1
        println("===Salários===")
        for ((usuario,lista) in mapDoUsuario){
            println("Habitante: ${usuario.nome}")
            for (i in lista){
                println("${mes}º mês: R$$i")
                mes++
                if (mes>12){
                    mes=1
                }
            }
            println()
        }
        println()
    }

    fun calcularImposto(){
        var mes =1
        for ((usuario,lista) in mapDoUsuario){
            println("Habitante: ${usuario.nome}")
            for (i in lista){
                when{
                    i in 0.0 .. 2000.00 ->{ println("Imposto do ${mes}º mês - Isento") }
                    i in 2001.00 .. 3000.00 ->{ println("Imposto do ${mes}º mês - R$%.2f".format(i*0.08))}
                    i in 3001.00 .. 4500.00 ->{println("Imposto do ${mes}º mês - R$%.2f".format(i*0.18))}
                    i > 4500.00 ->{println("Imposto do ${mes}º mês - R$%.2f".format(i*0.28))}
                }
                mes++
                if (mes>12){
                    mes=1
                }
            }
            println()
        }
        println()
    }
}