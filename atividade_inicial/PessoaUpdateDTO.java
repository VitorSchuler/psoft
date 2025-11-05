import java.util.List;

/**
 * DTO: Usado para receber os dados de atualização de uma Pessoa.
 * Note a ausência de 'nome' e 'cpf'.
 */
public class PessoaUpdateDTO {
    
    private final int idade;
    private final String telefone;
    private final Profissao profissao;
    private final List<Endereco> enderecos; // Permite atualizar/substituir endereços

    public PessoaUpdateDTO(int idade, String telefone, Profissao profissao, List<Endereco> enderecos) {
        this.idade = idade;
        this.telefone = telefone;
        this.profissao = profissao;
        this.enderecos = enderecos;
    }

    // Getters
    public int getIdade() { return idade; }
    public String getTelefone() { return telefone; }
    public Profissao getProfissao() { return profissao; }
    public List<Endereco> getEnderecos() { return enderecos; }
}