package ex1
import java.time.LocalDate

class Caixa {
    private val bebida = Bebidas("",0, LocalDate.now())
    private val laticinios = Laticinios("",0, LocalDate.now())
    private val acougue = Acougue("",0, LocalDate.now())
    private var continuar=true

    fun menuPrincipal(){
        do {
            println("Você deseja:\n1-Cadastrar produto | 2-Ver produtos | 3-Sair")
            val escolha = readln().toIntOrNull()
            when(escolha){
                1 -> menuEscolha()
                2 -> menuExibir()
                3 -> System.exit(0)
                else -> {
                    continuar=false
                    println("Opção inválida!")
                }
            }
        }while (!continuar)
    }

    fun menuEscolha(){
        do {
            println("Deseja cadastrar qual tipo de produto:\n1-Bebidas | 2-Laticínios | 3-Açougue | 4-Voltar")
            val escolha = readln().toIntOrNull()
            when(escolha){
                1 -> {bebida.cadastrar()
                menuEscolha()}
                2 -> {laticinios.cadastrar()
                menuEscolha()}
                3 -> {acougue.cadastrar()
                menuEscolha()}
                4 -> menuPrincipal()
                else -> {
                    continuar=false
                    println("Opção inválida!")
                }
            }
        }while (!continuar)
    }

    fun menuExibir(){
        do {
            println("Deseja ver qual produto:\n1-Bebidas | 2-Laticínios | 3-Açougue | 4-Voltar")
            val escolha = readln().toIntOrNull()
            when(escolha){
                1 -> {bebida.exibirProdutos()
                menuExibir()}
                2 -> {laticinios.exibirProdutos()
                menuExibir()}
                3 -> {acougue.exibirProdutos()
                menuExibir()}
                4 -> menuPrincipal()
                else -> {
                    continuar=false
                    println("Opção inválida!")
                }
            }
        }while (!continuar)
    }
}