package ex6

abstract class Peca (var marca:String,var modelo:String){
    abstract fun retirada()
}

class Pecas(marca: String,modelo: String):Peca(marca,modelo){
    override fun retirada(){}
}