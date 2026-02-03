public interface State {
    // Passamos o booleano 'aprovar' para cobrir o caso do ToVerify
    void mover(UserStory us, User user, boolean aprovar);
}