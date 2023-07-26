import ex2.DiaDaSemana
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DiaDaSemanaTest {

    val classe = DiaDaSemana()

    @Test
    fun verificaODiaDaSemanaDomingo(){
        val numeroRecebido = classe.verificaDiaDaSemana(1)
        assertEquals("Domingo",numeroRecebido)
    }

    @Test
    fun verificaODiaDaSemanaSegunda(){
        val numeroRecebido = classe.verificaDiaDaSemana(2)
        assertEquals("Segunda",numeroRecebido)
    }

    @Test
    fun verificaODiaDaSemanaTerca(){
        val numeroRecebido = classe.verificaDiaDaSemana(3)
        assertEquals("Terça",numeroRecebido)
    }

    @Test
    fun verificaODiaDaSemanaQuarta(){
        val numeroRecebido = classe.verificaDiaDaSemana(4)
        assertEquals("Quarta",numeroRecebido)
    }

    @Test
    fun verificaODiaDaSemanaQuinta(){
        val numeroRecebido = classe.verificaDiaDaSemana(5)
        assertEquals("Quinta",numeroRecebido)
    }

    @Test
    fun verificaODiaDaSemanaSexta(){
        val numeroRecebido = classe.verificaDiaDaSemana(6)
        assertEquals("Sexta",numeroRecebido)
    }

    @Test
    fun verificaODiaDaSemanaSabado(){
        val numeroRecebido = classe.verificaDiaDaSemana(7)
        assertEquals("Sábado",numeroRecebido)
    }

    @Test
    fun verificaODiaDaSemanaInvalido(){
        val numeroRecebido = classe.verificaDiaDaSemana(0)
        assertEquals("Número inválido",numeroRecebido)
    }
}