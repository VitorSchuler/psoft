import java.util.List;

public interface OrdenacaoStrategy {
    // O contrato: recebe uma lista e devolve ela ordenada
    List<Integer> ordena(List<Integer> elementos);
}