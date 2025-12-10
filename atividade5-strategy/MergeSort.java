import java.util.Collections;
import java.util.List;

public class MergeSort implements OrdenacaoStrategy {
    @Override
    public List<Integer> ordena(List<Integer> elementos) {
        System.out.println("Ordenando usando MERGE SORT...");
        Collections.sort(elementos);
        return elementos;
    }
}