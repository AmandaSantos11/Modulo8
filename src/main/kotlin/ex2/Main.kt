package ex2

fun main(){
    var array = ArrayList<Forma>(5)
    val retangulo = Retangulo(10f,54f)
    val circulo = Circulo(45f)
    val quadrado = Quadrado(14f,14f)

    array.add(retangulo)
    array.add(circulo)
    array.add(quadrado)

    for (i in array){
        println("Área: "+i.calcularArea())
        println("Perímetro: "+i.calcularPerimetro()+"\n")
    }
}