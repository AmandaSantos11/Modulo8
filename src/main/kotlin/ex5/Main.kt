package ex5

fun main(){
    val turma = Turma()
    turma.alunosJaCadastrados()
    do {
        println()
        println("Você deseja:\n1-Cadastrar aluno | 2-Listar alunos | 3-Listar alunos com sobrenome\n4-Ver aluno mais velho | 5-Ver média das idades | 6-Atualizar dados\n7-Remover dados | 8-Sair")
        val opcao = readln().toInt()
        when(opcao){
            1 -> {turma.cadastrarAluno()}
            2 -> {turma.mostrarAlunos()}
            3 -> {turma.mostrarAlunosComSobrenome()}
            4 -> {turma.mostrarAlunoMaisIdoso()}
            5 -> {turma.mostrarMediaDasIdades()}
            6 -> {turma.atualizarDados()}
            7 -> {turma.removerDados()}
            8 -> {System.exit(0)}
            else -> {
                println("Opção inválida!")
            }
        }
    }while (opcao != 8)
}