public class ToDo implements State {
    @Override
    public void mover(UserStory us, User user, boolean aprovar) {
        // Regra: Qualquer integrante pode mover de ToDo para InProgress
        us.setEstado(new InProgress());
        System.out.println("✅ [ToDo] -> Movido para [InProgress] por " + user.getNome());
    }
}