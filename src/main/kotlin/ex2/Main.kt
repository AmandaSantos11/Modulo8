package ex2

fun main(){
    var conjuntoNumeros = mutableSetOf<Int>()

    conjuntoNumeros.add(1)
    conjuntoNumeros.add(5)
    conjuntoNumeros.add(5)
    conjuntoNumeros.add(6)
    conjuntoNumeros.add(7)
    conjuntoNumeros.add(8)
    conjuntoNumeros.add(8)
    conjuntoNumeros.add(8)

    println(conjuntoNumeros)

    //A diferença desse exercício para o primeiro é que nesse os números repetidos não exibidos no print.
}