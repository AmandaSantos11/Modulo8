package ex2
import java.time.LocalDate

class Pessoa (nome: String, dia:Int, mes:Int, ano:Int,idade:Int){

    var nome = nome
        get() {return field}
        set(value) {field = value}

    var dia = dia
        get() {return field}
        set(value) {field = value}

    var mes = mes
        get() {return field}
        set(value) {field = value}

    var ano = ano
        get() {return field}
        set(value) {field = value}

    var idade = idade
        get() {return field}
        set(value) {field = value}



    fun ajustaDataDeNascimento(dia:Int,mes:Int,ano:Int){
        this.dia=dia
        this.mes=mes
        this.ano=ano
    }

    fun calculaIdade(){
        var dataAtual = LocalDate.now()
        idade = dataAtual.year - ano
    }

    fun informarIdade():Int{
        return idade
    }

    fun informarNome():String{
        return nome
    }
}