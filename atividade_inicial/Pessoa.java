import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    private String telefone;

    private Profissao profissao;
    private List<Endereco> enderecos;

    public Pessoa(String nome, String cpf, int idade, String telefone, Profissao profissao, List<Endereco> enderecos) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.telefone = telefone;
        this.profissao = profissao;
        this.enderecos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public List<Endereco> getEndereco() {
        return enderecos;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    public void setEndereco(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    




}
