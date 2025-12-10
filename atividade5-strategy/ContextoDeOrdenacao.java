import java.util.List;

public class ContextoDeOrdenacao {

    // Composição: O Contexto TEM-UMA Estratégia
    private OrdenacaoStrategy estrategia;

    public ContextoDeOrdenacao() {
        // Regra do aviso: Definir BubbleSort como padrão no construtor
        this.estrategia = new BubbleSort();
    }

    // Método para trocar a estratégia dinamicamente
    public void setEstrategia(OrdenacaoStrategy novaEstrategia) {
        this.estrategia = novaEstrategia;
    }

    // O método que o cliente chama. 
    // O Contexto não sabe ordenar, ele DELEGA para a estratégia atual.
    public List<Integer> ordenarLista(List<Integer> lista) {
        return this.estrategia.ordena(lista);
    }
}