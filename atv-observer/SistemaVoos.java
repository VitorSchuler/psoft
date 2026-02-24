import java.util.ArrayList;
import java.util.List;

public class SistemaVoos {
    private List<TotemListener> listeners = new ArrayList<>();
    private List<Voo> voos = new ArrayList<>();

    // Gerenciamento de Listeners (Assinaturas)
    public void addListener(TotemListener listener) {
        listeners.add(listener);
    }

    public void removeListener(TotemListener listener) {
        listeners.remove(listener);
    }

    // Regras de Negócio do Aeroporto
    public void adicionarVoo(Voo voo) {
        voos.add(voo);
        dispararVooAdicionado(new VooEvent(voo));
    }

    // Métodos privados que fazem o Broadcast (Notificam todo mundo)
    private void dispararVooAdicionado(VooEvent event) {
        for (TotemListener listener : listeners) {
            listener.vooAdicionado(event);
        }
    }
    
    // Teria também dispararVooAtualizado() e dispararVooRemovido()...
}