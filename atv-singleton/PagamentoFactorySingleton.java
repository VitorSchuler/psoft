public class PagamentoFactorySingleton {

    // A instância é do tipo da INTERFACE
    private static ProcessadorPagamento instance;

    // Construtor privado: Ninguém pode dar "new" aqui
    private PagamentoFactorySingleton() {}

    // Método Global de Acesso
    public static ProcessadorPagamento getInstance() {
        if (instance == null) {
            // Lógica de "Lazy Instantiation"
            // Aqui simulamos uma configuração. Num sistema real, viria do application.properties
            String tipoConfigurado = "CIELO"; 

            if (tipoConfigurado.equals("CIELO")) {
                instance = new PagamentoCielo();
            } else if (tipoConfigurado.equals("STONE")) {
                instance = new PagamentoStone();
            } else {
                instance = new PagamentoPayPal();
            }
        }
        return instance;
    }
    
    // Opcional: Método para resetar o Singleton (útil para testes)
    public static void reset() {
        instance = null;
    }
}