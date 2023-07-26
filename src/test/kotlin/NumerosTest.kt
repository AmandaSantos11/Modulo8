import ex3.Numeros
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
class NumerosTest {

    val classe = Numeros()
    @Test
    fun verificaMaiorNumero(){
        val vetor = arrayOf(10,25,40,34,12)
        val resultado = classe.recebeNumero(vetor)
        assertEquals(40,resultado)
    }
}