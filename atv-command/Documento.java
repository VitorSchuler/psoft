                                //RECEIVER

import java.util.ArrayList;
import java.util.List;

public class Documento {
    private List<String> paragrafos = new ArrayList<>();

    public void adicionarParagrafo(String paragrafo) {
        this.paragrafos.add(paragrafo);
    }

    public void removerParagrafo(String paragrafo) {
        this.paragrafos.remove(paragrafo);
    }

    public void imprimir() {
        System.out.println("--- Conteúdo do Documento ---");
        for (String p : paragrafos) {
            System.out.println(p);
        }
        System.out.println("-----------------------------");
    }
}