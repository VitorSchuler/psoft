/**
 * CLASSE "DONA": Funcionario
 * Segue o princípio "Prefira Composição ao invés de Herança".
 * Ela "TEM-UM" Papel, que pode ser trocado dinamicamente.
 */
public class Funcionario {
    private String nome;
    
    // Composição: O atributo é a INTERFACE
    private Papel papelAtual;

    public Funcionario(String nome, Papel papelInicial) {
        this.nome = nome;
        this.papelAtual = papelInicial;
    }

    // Método que permite a mudança dinâmica de papéis
    public void setPapel(Papel novoPapel) {
        this.papelAtual = novoPapel;
        System.out.println(this.nome + " agora é: " + this.papelAtual.getDescricao());
    }

    // Delega o trabalho para o papel atual
    public void executarTrabalho() {
        System.out.println(this.nome + " (Sendo " + this.papelAtual.getDescricao() + ") está trabalhando:");
        System.out.println("  -> " + this.papelAtual.trabalhar());
    }

    public String getNome() {
        return nome;
    }
    
    public Papel getPapel() {
        return papelAtual; // Retorna o papel (para ser "decorado")
    }
}