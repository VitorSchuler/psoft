/**
 * CLASSE CLIENTE (MAIN)
 * * Simula o "Mercado" utilizando o sistema de Vendas.
 * * Demonstra o BAIXO ACOPLAMENTO
 */
public class Mercado {

    public static void main(String[] args) {
        
        System.out.println("--- Mercado Aberto ---");

        // 1. Criando os produtos disponíveis no catálogo
        Produto arroz = new Produto("Arroz Tio João (5kg)", 25.00);
        Produto cafe = new Produto("Café Melitta (500g)", 18.00);
        Produto chocolate = new Produto("Barra Chocolate (100g)", 7.00);

        // 2. Iniciando uma nova Venda
        Venda venda1 = new Venda();
        System.out.println("Criada nova venda...");

        // 3. Adicionando itens à Venda
        // A Venda (Creator) cuida de criar os ItemVenda internamente.
        venda1.adicionarItem(arroz, 2);      // 2 * 25.00 = 50.00 (sem desconto)
        venda1.adicionarItem(cafe, 1);       // 1 * 18.00 = 18.00 (sem desconto)
        
        // 4. Adicionando o item que terá o desconto
        // O Mercado (Cliente) não precisa saber da regra de desconto.
        // O Information Expert (ItemVenda) cuidará disso.
        venda1.adicionarItem(chocolate, 100); // 100 * 7.00 = 700.00
                                             // Com 10% off = 630.00
        
        System.out.println("\n--- Itens Adicionados ---");
        System.out.println(venda1.getItens());

        // 5. Consultando o total
        // A Venda (Expert) nos dá o total.
        // Esperado: 50.00 + 18.00 + 630.00 = 698.00
        double total = venda1.getTotal();
        System.out.println("\nValor total da Venda: R$ " + total);

        // 6. Realizando o Pagamento
        //
        // JUSTIFICATIVA (Low Coupling):
        // Note que a classe Mercado NÃO interage com a classe Pagamento.
        // Ela apenas "diz" à Venda qual a forma de pagamento.
        // A Venda (Coesa) cuida de criar e associar o pagamento.
        // Isso reduz o acoplamento do sistema.
        venda1.realizarPagamento("PIX");

        System.out.println("Pagamento realizado!");

        // 7. Imprimindo o recibo final
        System.out.println("\n--- Recibo Final ---");
        System.out.println(venda1);
    }
}