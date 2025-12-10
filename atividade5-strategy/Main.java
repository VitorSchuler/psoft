import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando uma lista desordenada para teste
        // (Usamos ArrayList para ser mutável)
        List<Integer> lista = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 5, 6));

        // 1. Criar o Contexto (Já nasce com BubbleSort)
        ContextoDeOrdenacao ordenador = new ContextoDeOrdenacao();
        
        System.out.println("--- Teste 1: Padrão (Bubble) ---");
        ordenador.ordenarLista(lista); 
        // Saída esperada: "Ordenando usando BUBBLE SORT..."

        // 2. Trocando para QuickSort em tempo de execução
        System.out.println("\n--- Teste 2: Trocando para QuickSort ---");
        ordenador.setEstrategia(new QuickSort());
        ordenador.ordenarLista(lista);
        // Saída esperada: "Ordenando usando QUICK SORT..."

        // 3. Trocando para MergeSort
        System.out.println("\n--- Teste 3: Trocando para MergeSort ---");
        ordenador.setEstrategia(new MergeSort());
        ordenador.ordenarLista(lista);
        // Saída esperada: "Ordenando usando MERGE SORT..."
    }
}