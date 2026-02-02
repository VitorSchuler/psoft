public class MainTeste {
    public static void main(String[] args) {
        // Tenta pegar a instância duas vezes
        ProcessadorPagamento p1 = PagamentoFactorySingleton.getInstance();
        ProcessadorPagamento p2 = PagamentoFactorySingleton.getInstance();

        // Usa o objeto
        p1.processar(100.00);

        // Prova que é o mesmo objeto (Singleton)
        if (p1 == p2) {
            System.out.println("Sucesso! p1 e p2 são EXATAMENTE o mesmo objeto em memória.");
        } else {
            System.out.println("Erro: Objetos diferentes foram criados.");
        }
    }
}