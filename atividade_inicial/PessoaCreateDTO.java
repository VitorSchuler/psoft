import java.util.List;

/**
 * DTO: Usado para receber os dados de criação de uma nova Pessoa.
 */
public class PessoaCreateDTO {
    
    private final String nome;
    private final String cpf;
    private final int idade;
    private final String telefone;
    private final Profissao profissao;
    private final List<Endereco> enderecos; // Para simplificar, recebemos os objetos

    public PessoaCreateDTO(String nome, String cpf, int idade, String telefone, Profissao profissao, List<Endereco> enderecos) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.telefone = telefone;
        this.profissao = profissao;
        this.enderecos = enderecos;
    }
    
    // Getters para o Service poder ler os dados
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public int getIdade() { return idade; }
    public String getTelefone() { return telefone; }
    public Profissao getProfissao() { return profissao; }
    public List<Endereco> getEnderecos() { return enderecos; }
}