package ex3

fun main(){
    val filme1 = Filme("Os Vingadores", 142)
    filme1.exibirDuracaoEmHoras()

    val filme2 = Filme("Hotel Transilvânia", 93)
    filme2.exibirDuracaoEmHoras()

    println("\nOs filmes em cartaz são '${filme1.titulo}' e '${filme2.titulo}'\n")

    var listaDeFilmes = ArrayList<Filme>()
    listaDeFilmes.add(Filme("A Noiva-Cadáver",77))
    listaDeFilmes.add(Filme("Pocahontas",81))
    listaDeFilmes.add(Filme("Moulin Rouge",127))
    listaDeFilmes.add(Filme("A Polegarzinha",86))
    listaDeFilmes.add(Filme("Super Mario Bros",92))

    for (filme in listaDeFilmes) {
        filme.exibirDuracaoEmHoras()
    }

    println("\n  Filmes em cartaz:  ")
    for (filme in listaDeFilmes){
        println("'${filme.titulo}'")
    }
}