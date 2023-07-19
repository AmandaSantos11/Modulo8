package ex5
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Turma {

    private var listaDeAlunos = arrayListOf<Aluno>()
    private val formato = DateTimeFormatter.ofPattern("dd/MM/yyyy")

    fun alunosJaCadastrados(){
        listaDeAlunos.add(Aluno("Lola","Sampaio", "Feminino", LocalDate.parse("11/05/2002", formato),111))
        listaDeAlunos.add(Aluno("Matheus","Lopes", "Masculino", LocalDate.parse("01/12/2003", formato),222))
    }

    fun cadastrarAluno(){
        println("Digite o nome do aluno:")
        var nome = readln()

        println("Digite o sobrenome:")
        var sobrenome = readln()

        println("Digite o sexo do aluno:")
        var sexo = readln()

        println("Digite a data de nascimento:")
        var dataDeNascimento = LocalDate.parse(readln(),formato)

        println("Digite a matrícula:")
        var matricula = readln().toInt()
        while (verificarMatricula(matricula)){
            println("Matrícula já cadastrada, digite novamente:")
            matricula = readln().toInt()
        }

        var aluno = Aluno(nome, sobrenome, sexo, dataDeNascimento, matricula)
        listaDeAlunos.add(aluno)
    }

    fun verificarMatricula(matricula: Int): Boolean{
        for (aluno in listaDeAlunos){
            if (aluno.matricula.equals(matricula)){
                return true
            }
        }
        return false
    }

    fun mostrarAlunos(){
        var numero = 1
        println("\n===Alunos===")
        for (i in listaDeAlunos){
            println("${numero}º aluno: ${i.nome}")
            numero++
        }
    }

    fun mostrarAlunosComSobrenome(){
        var numero = 1
        println("\n===Alunos com sobrenome===")
        for (i in listaDeAlunos){
            println("${numero}º aluno: ${i.nome} ${i.sobrenome}")
            numero++
        }
    }

    fun mostrarAlunoMaisIdoso(){
        val alunoMaisVelho = listaDeAlunos.minByOrNull { listaDeAlunos -> listaDeAlunos.dataDeNascimento }

        if (alunoMaisVelho != null) {
            println("\nO aluno mais velho é: ${alunoMaisVelho.nome}")
        }
        else{
            println("Não existe nenhum aluno")
        }
    }

    fun mostrarMediaDasIdades(){
        var listaDeIdades = arrayOf<Int>()
        for (i in listaDeAlunos){
            var idade = 2023-i.dataDeNascimento.year
            listaDeIdades = listaDeIdades.plus(idade)
        }

        var media = listaDeIdades.sum()/listaDeIdades.size
        println("\nMédia das idade: $media")
    }

    fun atualizarDados(){
        println("\nDigite a matrícula do aluno:")
        var matriculaUsuario = readln().toInt()
        for (aluno in listaDeAlunos){
            if (aluno.matricula==matriculaUsuario){
                println("Digite o nome para qual deseja atualizar:")
                val nomeNovo = readln()
                aluno.nome = nomeNovo
                println("Dado atualizado com sucesso!")
                return
            }
        }
        println("Matrícula não encontrada!")
    }

    fun removerDados(){
        println("\nDigite a matrícula do aluno:")
        var matriculaUsuario = readln().toInt()
        for (aluno in listaDeAlunos){
            if (aluno.matricula==matriculaUsuario){

                listaDeAlunos.remove(aluno)
                println("Aluno removido com sucesso!")
                return
            }
        }
        println("Matrícula não encontrada!")
    }
}