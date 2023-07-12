package ex4
import java.time.LocalDate
import java.time.format.DateTimeFormatter
class Funcionario(var nome:String, var setor:String, var salario:Double, var dataDeAdmissao:String){
    fun exibir(){
        val formato = DateTimeFormatter.ofPattern("dd/MM/yyyy")
        var data  = LocalDate.parse(dataDeAdmissao,formato)
        println("Nome: $nome\nSetor: $setor\nSalário: R$$salario\nData de admissão: $data\n--------------------------------")
    }
}