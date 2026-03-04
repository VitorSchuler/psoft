public abstract class Bebida {

    // 1. O Template Method: Define a ordem do algoritmo e é public final
    public final void preparar() {
        esquentarAgua();
        prepararIngrediente();
        servirEmUmCopo();
        adicionarCondimentos();
    }

    // 2. Passos em comum: DEVEM ser privados (regras da atividade)
    private void esquentarAgua() {
        System.out.println("Esquentando a água...");
    }

    private void servirEmUmCopo() {
        System.out.println("Servindo a bebida no copo...");
    }

    // 3. Os Ganchos: DEVEM ser protected abstract
    protected abstract void prepararIngrediente();
    protected abstract void adicionarCondimentos();
}