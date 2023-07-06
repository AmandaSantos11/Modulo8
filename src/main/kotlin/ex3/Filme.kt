package ex3
import kotlin.time.Duration.Companion.minutes

class Filme (var titulo:String,var duracaoEmMinutos:Int){

    fun exibirDuracaoEmHoras(){
        val duracaoEmHoras = duracaoEmMinutos.minutes
        println("O filme '$titulo' possui $duracaoEmHoras de duração.")
    }
}