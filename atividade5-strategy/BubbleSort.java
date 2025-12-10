import java.util.Collections;
import java.util.List;

public class BubbleSort implements OrdenacaoStrategy {
    @Override
    public List<Integer> ordena(List<Integer> elementos) {
        System.out.println("Ordenando usando BUBBLE SORT...");
        // Como não precisamos implementar o algoritmo na unha, 
        // usamos o sort padrão apenas para cumprir o contrato.
        Collections.sort(elementos); 
        return elementos;
    }
}