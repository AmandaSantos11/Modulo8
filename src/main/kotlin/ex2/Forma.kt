package ex2
import kotlin.math.PI

abstract class Forma {
    abstract fun calcularArea():Float
    abstract fun calcularPerimetro():Float
}

open class Retangulo(var lado:Float,var altura:Float): Forma(){
    override fun calcularArea(): Float {
        return lado*altura //get implícito
    }
    override fun calcularPerimetro(): Float {
        return 2*(lado+altura) //get implícito
    }
}

class Circulo(var raio:Float):Forma(){
    override fun calcularArea(): Float {
        return PI.toFloat()*raio*raio
    }
    override fun calcularPerimetro(): Float {
        return 2* PI.toFloat()*raio
    }
}

class Quadrado(lado:Float,altura:Float):Retangulo(lado, altura){
}