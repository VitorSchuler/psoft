public class Cafe extends Bebida {

    @Override
    protected void prepararIngrediente() {
        System.out.println("Moendo e coando o café...");
    }

    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando leite e açúcar...");
    }
}