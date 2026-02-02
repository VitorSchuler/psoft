import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    private Biblioteca biblioteca;

    @BeforeEach
    void setUp() {
        biblioteca = new Biblioteca();
        // Populando o cenário
        biblioteca.adicionarLivro(new Livro("1", "Harry Potter e a Pedra Filosofal", "J.K. Rowling"));
        biblioteca.adicionarLivro(new Livro("2", "O Senhor dos Anéis", "J.R.R. Tolkien"));
        biblioteca.adicionarLivro(new Livro("3", "Clean Code", "Robert Martin"));
    }

    @Test
    void deveRetornarLivrosAoBuscarPorTituloParcial() {
        // Ação: Busco por "Harry"
        List<Livro> resultado = biblioteca.buscarLivrosPorTitulo("Harry");

        // Verificação
        assertEquals(1, resultado.size());
        assertEquals("Harry Potter e a Pedra Filosofal", resultado.get(0).getTitulo());
    }
    
    @Test
    void deveRetornarListaVaziaSeNaoEncontrar() {
        List<Livro> resultado = biblioteca.buscarLivrosPorTitulo("Livro Inexistente");
        assertTrue(resultado.isEmpty());
    }
}