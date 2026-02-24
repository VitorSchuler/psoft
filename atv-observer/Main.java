import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        
        // 1. Criamos o Sujeito (O sistema central do aeroporto)
        SistemaVoos aeroporto = new SistemaVoos();

        // 2. Criamos os Observadores (Os totens físicos)
        TotemEmbarque totemEmbarque = new TotemEmbarque();
        TotemDesembarque totemDesembarque = new TotemDesembarque();

        // 3. Inscrevemos os totens no sistema central (Eles assinam o recebimento de eventos)
        aeroporto.addListener(totemEmbarque);
        aeroporto.addListener(totemDesembarque);

        System.out.println("--- INICIANDO AS OPERAÇÕES DO AEROPORTO ---");

        // 4. Criamos alguns voos
        Voo voo1 = new Voo("G3-1001", "Gol", TipoVoo.PARTINDO, LocalDateTime.now().plusHours(2));
        Voo voo2 = new Voo("LA-8080", "LATAM", TipoVoo.CHEGANDO, LocalDateTime.now().plusMinutes(30));
        Voo voo3 = new Voo("AD-4040", "Azul", TipoVoo.PARTINDO, LocalDateTime.now().plusHours(5));

        // 5. O sistema central adiciona os voos e dispara as notificações automaticamente
        System.out.println("\n> Sistema registrando o voo G3-1001...");
        aeroporto.adicionarVoo(voo1); 
        // Apenas o Totem de Embarque deve printar

        System.out.println("\n> Sistema registrando o voo LA-8080...");
        aeroporto.adicionarVoo(voo2); 
        // Apenas o Totem de Desembarque deve printar

        System.out.println("\n> Sistema registrando o voo AD-4040...");
        aeroporto.adicionarVoo(voo3); 
        // Apenas o Totem de Embarque deve printar
        
        System.out.println("\n--- FIM DAS ATUALIZAÇÕES ---");
    }
}