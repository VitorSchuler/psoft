public class InProgress implements State {
    @Override
    public void mover(UserStory us, User user, boolean aprovar) {
        // Regra: Apenas Developers podem mover para ToVerify
        if ("Developer".equalsIgnoreCase(user.getCargo())) {
            us.setEstado(new ToVerify());
            System.out.println("✅ [InProgress] -> Movido para [ToVerify] por " + user.getNome());
        } else {
            System.out.println("❌ Apenas Desenvolvedores podem mover de InProgress.");
        }
    }
}