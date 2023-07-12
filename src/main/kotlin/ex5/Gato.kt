package ex5

class Gato(nome:String,raca:String,dono:String):Animal(nome,raca,dono) {

    override fun movimentar() {
        println("Andando e saltando em 4 patas")
    }

    override fun comer() {
        println("Comendo whiskas sachê")
    }

    override fun dormir() {
        println("Dormindo na caixa")
    }
}