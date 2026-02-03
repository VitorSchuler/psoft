public class UserStory {
    private State estadoAtual;
    private String descricao;

    public UserStory(String descricao) {
        this.descricao = descricao;
        // Regra: "Quando uma US é criada ela inicia no estado ToDo"
        this.estadoAtual = new ToDo(); 
    }

    public void setEstado(State novoEstado) {
        this.estadoAtual = novoEstado;
    }

    // Método que o cliente chama. 
    // Por padrão, passamos 'true' para aprovação se não for especificado, 
    // mas aqui deixaremos explícito.
    public void mover(User user, boolean aprovar) {
        estadoAtual.mover(this, user, aprovar);
    }
    
    // Sobrecarga para facilitar chamadas que não exigem aprovação
    public void mover(User user) {
        estadoAtual.mover(this, user, true);
    }
}