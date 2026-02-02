public class PagamentoStone implements ProcessadorPagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Processando R$" + valor + " via STONE.");
    }
}