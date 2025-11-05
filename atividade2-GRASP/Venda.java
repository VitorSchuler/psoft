import java.util.ArrayList;
import java.util.List;

public class Venda {

    private List<ItemVenda> itens;
    private Pagamento pagamento;

    public Venda() {
        this.itens = new ArrayList<>();
    }

    // --- MÉTODO 1 (Creator) ---
    
    /**
     * Adiciona um item à venda.
     *
     * JUSTIFICATIVA (Creator):
     * [cite_start]A classe Venda é a CRIADORA (Creator) de ItemVenda [cite: 434-437].
     *
     * Por quê? [cite_start]Porque a Venda 'agrega' ou 'contém' os objetos ItemVenda[cite: 305].
     * Um ItemVenda só faz sentido no contexto de uma Venda.
     * Ao centralizar a criação aqui, mantemos o design coeso.
     */
    public void adicionarItem(Produto produto, int quantidade) {
        // A Venda cria a instância do seu "filho"
        ItemVenda novoItem = new ItemVenda(quantidade, produto);
        this.itens.add(novoItem);
    }

    // --- MÉTODO 2 (Information Expert) ---

    /**
     * Calcula o valor total da venda.
     *
     * JUSTIFICATIVA (Information Expert):
     * A classe Venda é a ESPECIALISTA DA INFORMAÇÃO (Information Expert)
     * [cite_start]responsável por calcular o total [cite: 434-437].
     *
     * Por quê? Porque ela é a única que 'conhece' a lista
     * [cite_start]completa de 'itens' que compõem a venda[cite: 191, 214].
     *
     * Note que ela *delega* o cálculo do subtotal (que inclui o desconto)
     * para o especialista de nível mais baixo (o próprio ItemVenda),
     * seguindo o padrão Expert de colaboração.
     */
    public double getTotal() {
       double total = 0.0;
       for (ItemVenda item : this.itens) {
            total += item.getSubTotal();
       }
       return total;
    }

    // --- MÉTODO 3 (High Cohesion / Low Coupling / Creator) ---

    /**
     * Processa o pagamento da venda.
     *
     * JUSTIFICATIVA (High Cohesion & Low Coupling):
     * [cite_start]A Venda é responsável por gerenciar seu próprio pagamento[cite: 434].
     *
     * 1. HIGH COHESION (Alta Coesão): A responsabilidade de 'pagar'
     * está fortemente relacionada com 'Venda'. Manter essa lógica
     * [cite_start]aqui torna a classe Venda mais focada e coesa[cite: 446].
     *
     * 2. LOW COUPLING (Baixo Acoplamento): Se a classe 'Mercado' (o cliente)
     * fosse responsável por criar o Pagamento e associá-lo,
     * o 'Mercado' ficaria acoplado (dependente) da Venda E
     * do Pagamento. Ao deixar a Venda cuidar disso, o 'Mercado'
     * [cite_start]só precisa conhecer a Venda, reduzindo o acoplamento [cite: 347-352].
     *
     * 3. CREATOR: A Venda também se torna a Criadora (Creator) do Pagamento.
     */
    public void realizarPagamento(String formaDePagamento) {
        // 1. Pede ao especialista (ela mesma) o valor total
        double totalAPagar = this.getTotal();
        
        // 2. Cria o objeto Pagamento
        this.pagamento = new Pagamento(totalAPagar, formaDePagamento);
    }

    // --- Getters ---
    
    public List<ItemVenda> getItens() {
        return this.itens;
    }

    public Pagamento getPagamento() {
        return this.pagamento;
    }

}
