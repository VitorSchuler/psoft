public class Main {
    public static void main(String[] args) {
        System.out.println("--- PREPARANDO CAFÉ ---");
        Bebida meuCafe = new Cafe();
        meuCafe.preparar(); // Chama o Template Method

        System.out.println("\n--- PREPARANDO CHÁ ---");
        Bebida meuCha = new Cha();
        meuCha.preparar(); // Chama o Template Method
    }
}