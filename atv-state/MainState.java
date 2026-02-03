public class MainState {
    public static void main(String[] args) {
        // 1. Criar Atores
        User dev = new User("João Dev", "Developer");
        User sm = new User("Maria SM", "ScrumMaster");

        // 2. Criar a User Story (Nasce em ToDo)
        UserStory us = new UserStory("Criar tela de Login");
        System.out.println("--- Início do Ciclo ---");

        // 3. ToDo -> InProgress (Qualquer um pode)
        us.mover(sm); // SM moveu

        // 4. InProgress -> ToVerify (Tentar com SM - deve falhar)
        System.out.println("\n--- Tentativa Inválida (SM movendo InProgress) ---");
        us.mover(sm); 
        
        // 4.1 InProgress -> ToVerify (Tentar com Dev - deve passar)
        System.out.println("\n--- Tentativa Válida (Dev movendo InProgress) ---");
        us.mover(dev);

        // 5. ToVerify -> Done/ToDo (Tentar com Dev - deve falhar)
        System.out.println("\n--- Tentativa Inválida (Dev avaliando) ---");
        us.mover(dev, true);

        // 5.1 ToVerify -> ToDo (SM Reprovando)
        System.out.println("\n--- SM Reprovando a tarefa ---");
        us.mover(sm, false); // false = não aprovado

        // Agora voltou para ToDo. Vamos avançar rápido até ToVerify de novo
        System.out.println("\n--- Avançando rápido de volta ao ToVerify ---");
        us.mover(dev); // ToDo -> InProgress
        us.mover(dev); // InProgress -> ToVerify

        // 5.2 ToVerify -> Done (SM Aprovando)
        System.out.println("\n--- SM Aprovando a tarefa ---");
        us.mover(sm, true); // true = aprovado

        // 6. Done -> ??? (Nada deve acontecer)
        System.out.println("\n--- Tentando mover de Done ---");
        us.mover(sm);
    }
}