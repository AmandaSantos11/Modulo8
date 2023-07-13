package ex1

fun main(){
    println("====Produtos====")
    val livro1 = Livros("Crepúsculo",70.0,100,"Stephenie Meyer")
    livro1.adicionarProdutoNoVetor(livro1)

    val livro2 = Livros("It - A Coisa",110.0,101,"Stephen King")
    livro2.adicionarProdutoNoVetor(livro2)

    val cd1 = Cds("Calipso",15.5,200,10)
    cd1.adicionarProdutoNoVetor(cd1)

    val cd2 = Cds("Rebeldes",20.9,201,8)
    cd2.adicionarProdutoNoVetor(cd2)

    val dvd1 = Dvds("A Noiva-Cadáver",49.9,300,77)
    dvd1.adicionarProdutoNoVetor(dvd1)

    val dvd2 = Dvds("Pocahontas",67.0,300,81)
    dvd2.adicionarProdutoNoVetor(dvd2)

    println()
    val vetor = arrayOf(livro1,livro2,cd1,cd2,dvd1,dvd2)
    procurarProduto(cd2,vetor)
    println()

    println("Compara código de barras:")
    val dvd3 = Dvds("Pocahontas",67.0,300,81)
    val dvd4 = Dvds("Pocahontas",67.0,301,81)
    println(dvd2.codigoDeBarra.equals(dvd3.codigoDeBarra))
    println(dvd2.codigoDeBarra.equals(dvd4.codigoDeBarra))
}
fun procurarProduto(produto: Any,vetor:Array<Produto>){
    for (i in 0 until vetor.size){
        if (vetor.get(i).equals(produto)){
            println("O produto está na posição ${i}")
            return
        }
    }
    println("Produto não encontrado")
}