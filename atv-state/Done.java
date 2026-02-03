public class Done implements State {
    @Override
    public void mover(UserStory us, User user, boolean aprovar) {
        // Regra: No estado Done, nada acontece.
        System.out.println("A User Story já está finalizada (Done). Nenhuma ação realizada.");
    }
}