package ex1

class Funcionario (var nome:String, var sobrenome:String, var horasTrabalhadas:Int, var valorPorHora:Double){

    fun nomeCompleto(){
        println("Nome do funcionário: $nome $sobrenome")
    }

    fun calcularSalario(){
        var salario = horasTrabalhadas*valorPorHora
        println("Irá receber no fim do mês: R$$salario")
    }

    fun incrementarHoras(valorIncrementado:Int){
        horasTrabalhadas += valorIncrementado
    }
}