import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca {
    private List<Livro> acervo = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        acervo.add(livro);
    }

    public List<Livro> buscarLivrosPorTitulo(String termo) {
        // Implementação simples para passar no teste
        return acervo.stream()
                .filter(l -> l.getTitulo().toLowerCase().contains(termo.toLowerCase())) // Ignora maiúsculas/minúsculas
                .collect(Collectors.toList());
    }
}