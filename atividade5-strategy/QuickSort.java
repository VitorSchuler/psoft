import java.util.Collections;
import java.util.List;

public class QuickSort implements OrdenacaoStrategy {
    @Override
    public List<Integer> ordena(List<Integer> elementos) {
        System.out.println("Ordenando usando QUICK SORT...");
        Collections.sort(elementos);
        return elementos;
    }
}