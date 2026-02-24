import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome;
    private String link;
    private boolean disponivel;
    private List<AlertaListener> alertas = new ArrayList<>();

    public Produto(String nome, String link, boolean disponivel) {
        this.nome = nome;
        this.link = link;
        this.disponivel = disponivel;
    }

    // --- Gerenciamento de Assinaturas (Observer) ---
    public void adicionarAlerta(AlertaListener listener) {
        alertas.add(listener);
    }

    public void removerAlerta(AlertaListener listener) {
        alertas.remove(listener);
    }

    // --- Mudanças de Estado ---
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
        if (disponivel) {
            dispararDisponibilidade();
        }
    }

    public void aplicarPromocao(String codigoPromocional) {
        if (this.disponivel) {
            dispararPromocao(codigoPromocional);
        } else {
            System.out.println("Não é possível aplicar promoção: Produto indisponível.\n");
        }
    }

    // --- Disparo de Eventos (Broadcast) ---
    private void dispararDisponibilidade() {
        ProdutoEvent event = new ProdutoEvent(this, null);
        for (AlertaListener listener : alertas) {
            listener.naDisponibilidade(event);
        }
    }

    private void dispararPromocao(String codigoPromocional) {
        ProdutoEvent event = new ProdutoEvent(this, codigoPromocional);
        for (AlertaListener listener : alertas) {
            listener.naPromocao(event);
        }
    }

    // Getters
    public String getNome() { return nome; }
    public String getLink() { return link; }
}