public class Cha extends Bebida {

    @Override
    protected void prepararIngrediente() {
        System.out.println("Mergulhando o saquinho de chá na água quente...");
    }

    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando uma rodela de limão...");
    }
}