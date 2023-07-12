package ex1

val caixa = Caixa()

fun main(){
    var continuar = true
    do {
        println("Você é:\n1-Funcionário | 2-Cliente | 3-Sair")
        when(readln().toInt()){
            1 -> vendedor()
            2 -> cliente()
            3 -> System.exit(0)
            else -> {
                continuar=false
                println("Opção inválida!")
            }
        }
    }while (!continuar)
}

fun vendedor(){
    println("---Registre 5 produtos:")
    for (i in 1 .. 5){
        println("Informe o nome do produto: ")
        var nome = readln()
        println("Informe o preço: ")
        var preco = readln().toDouble()
        println("Informe a quantidade: ")
        var quantidade = readln().toInt()

        var produto = Produto(nome,preco,quantidade)
        caixa.registrarProduto(produto)
    }
    main()
}

fun cliente(){
    caixa.exibirProduto()
    caixa.exibirValorTotalDosProdutos()
}