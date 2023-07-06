package ex2

fun main(){
    val livroFavorito = Livros("O pequeno príncipe",98,20)
    println("O livro '${livroFavorito.titulo}' possui ${livroFavorito.qtdPaginas} páginas")
    livroFavorito.verificarProgresso()
    livroFavorito.paginasLidas=50
    livroFavorito.verificarProgresso()

    var listaDeLivros = ArrayList<Livros>()
    listaDeLivros.add(Livros("Crespúsculo",480,50))
    listaDeLivros.add(Livros("A mandíbula de Caim",130,15))
    listaDeLivros.add(Livros("Minutos de sabedoria",288,90))
    listaDeLivros.add(Livros("Torto arado",264,2))
    listaDeLivros.add(Livros("Especialista em pessoas",224,20))
    listaDeLivros.add(Livros("Diário de um banana",218,45))
    listaDeLivros.add(Livros("Como fazer amigos e influenciar pessoas",256,110))
    listaDeLivros.add(Livros("Quem pensa enriquece: o legado",364,200))
    listaDeLivros.add(Livros("Tudo é rio",210,150))
    listaDeLivros.add(Livros("Mais esperto que o diabo",200,1))

    for (livro in listaDeLivros){
        println("\nO livro '${livro.titulo}' possui ${livro.qtdPaginas} páginas")
        livro.verificarProgresso()
        livro.paginasLidas = 35
        livro.verificarProgresso()
    }
}