package ex1

class Caixa {
    private var listaDeProduto = arrayListOf<Produto>()

    fun registrarProduto(produto: Produto){
        listaDeProduto.add(produto)
    }

    fun exibirProduto(){
        listaDeProduto.add(Produto("morango",6.50,5))
        println("====Nossos Produtos====")
        for (i in listaDeProduto){
            println("Produto: ${i.nome}\nPreço: R$${i.preco}\nQuantidade: ${i.quantidade}\n---------")
        }
    }

    fun exibirValorTotalDosProdutos(){
        var continuar=true
        println("Digite o nome produto que deseja comprar:")
        val nomeDoproduto = readln()

        for (i in listaDeProduto){
            if (i.nome.contains(nomeDoproduto)){
                do {
                    println("Informe a quantidade que deseja comprar:")
                    val quantidade = readln().toInt()

                    if (quantidade <= i.quantidade){
                        val totalDaCompra = i.preco*quantidade
                        println("Valor total da compra: R$$totalDaCompra\n-----")
                        i.quantidade -= quantidade
                        continuar=true
                    }
                    else{
                        println("Quantidade indisponível!")
                        continuar=false
                    }
                }while (!continuar)
            }
        }
    }
}