import java.util.Collections;
import java.util.List;

public class InsertionSort implements OrdenacaoStrategy {
    @Override
    public List<Integer> ordena(List<Integer> elementos) {
        System.out.println("Ordenando usando INSERTION SORT...");
        Collections.sort(elementos);
        return elementos;
    }
}