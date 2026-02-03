public class User {
    private String nome;
    private String cargo; // "Developer" ou "ScrumMaster"

    public User(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public String getNome() {
        return nome;
    }
}