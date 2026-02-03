public class ToVerify implements State {
    @Override
    public void mover(UserStory us, User user, boolean aprovar) {
        // Regra: Apenas ScrumMaster pode mover daqui
        if ("ScrumMaster".equalsIgnoreCase(user.getCargo())) {
            if (aprovar) {
                // Se aprovada -> Done
                us.setEstado(new Done());
                System.out.println("✅ [ToVerify] -> Aprovado! Movido para [Done] por " + user.getNome());
            } else {
                // Se não aprovada -> Volta para ToDo
                us.setEstado(new ToDo());
                System.out.println("⚠️ [ToVerify] -> Reprovado! Voltando para [ToDo] por " + user.getNome());
            }
        } else {
            System.out.println("❌ Apenas Scrum Master pode avaliar User Stories.");
        }
    }
}