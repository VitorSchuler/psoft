/**
 * IMPLEMENTAÇÃO (Decorator): Papel de Lider
 * Acumula responsabilidades usando Composição.
 */
public class Lider implements Papel {

    // Composição: O Lider "TEM-UM" Papel base (o Desenvolvedor)
    private Papel papelDecorado;

    public Lider(Papel papelBase) {
        this.papelDecorado = papelBase;
    }

    @Override
    public String trabalhar() {
        // 1. Delega para o papel base (o dev faz o seu)
        String trabalhoBase = this.papelDecorado.trabalhar();
        
        // 2. Acumula a nova responsabilidade
        String trabalhoLider = "Planejando a Sprint e removendo impedimentos.";
        
        return trabalhoBase + "\n  E TAMBÉM: " + trabalhoLider;
    }

    @Override
    public String getDescricao() {
        // Acumula as descrições
        return this.papelDecorado.getDescricao() + " + Líder";
    }
}