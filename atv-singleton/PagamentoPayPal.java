public class PagamentoPayPal implements ProcessadorPagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Processando R$" + valor + " via PAYPAL.");
    }
}