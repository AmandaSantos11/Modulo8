package ex5

class Cachorro(nome:String,raca:String,dono:String):Animal(nome,raca,dono) {

    override fun movimentar() {
        println("Andando em 4 patas")
    }

    override fun comer() {
        println("Comendo bife")
    }

    override fun dormir() {
        println("Dormindo na cama da $dono")
    }
}