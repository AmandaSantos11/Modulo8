package ex1

fun main(){
    val novoFuncionario = Funcionario("Luis","Silva",10,25.5)

    novoFuncionario.nomeCompleto()
    novoFuncionario.calcularSalario()
    novoFuncionario.incrementarHoras(8)
    novoFuncionario.calcularSalario()

    var listaDeFuncionario = ArrayList<Funcionario>()
    listaDeFuncionario.add(Funcionario("Amanda","Souza",8,50.0))
    listaDeFuncionario.add(Funcionario("Laura","Xavier",12,350.0))
    listaDeFuncionario.add(Funcionario("Milena","",24,500.0))
    listaDeFuncionario.add(Funcionario("Vitoria","Cerqueira",4,300.0))
    listaDeFuncionario.add(Funcionario("Carol","Queiroz",12,30.5))
    listaDeFuncionario.add(Funcionario("Sibele","Cruz",12,25.0))
    listaDeFuncionario.add(Funcionario("Neymar","Junior",3,1000.0))
    listaDeFuncionario.add(Funcionario("Érick","Jacquin",9,100.0))
    listaDeFuncionario.add(Funcionario("Claudia","Raia",6,150.0))

    for (funcionario in listaDeFuncionario){
        println("\nNome: ${funcionario.nome+" "+funcionario.sobrenome} \nHoras trabalhadas: ${funcionario.horasTrabalhadas}" +
                "\nValor por hora: ${funcionario.valorPorHora}")
    }
}