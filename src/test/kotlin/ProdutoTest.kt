import ex1.Produto
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ProdutoTest {

    val classe = Produto()
    @Test
    fun verificaOMaisBarato(){
        val vetor = arrayOf(44.5,23.8,78.9)
        val produtoMaisBarato = classe.produtoMaisBarato(vetor)
        assertEquals(23.8,produtoMaisBarato)
    }
}