import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * REPOSITORY: Simula o banco de dados.
 * Guarda as Pessoas em um Mapa onde a chave é o CPF.
 */
public class PessoaRepository {

    // Usamos 'static' para simular um banco de dados único (Singleton)
    private static final Map<String, Pessoa> bancoDeDados = new HashMap<>();

    /**
     * Salva ou atualiza uma pessoa no "banco".
     */
    public Pessoa save(Pessoa pessoa) {
        bancoDeDados.put(pessoa.getCpf(), pessoa);
        return pessoa;
    }

    /**
     * Busca uma pessoa pelo CPF.
     * Retorna null se não encontrar.
     */
    public Pessoa findByCpf(String cpf) {
        return bancoDeDados.get(cpf);
    }

    /**
     * Retorna uma lista com todas as pessoas cadastradas.
     */
    public List<Pessoa> findAll() {
        // Retorna uma CÓPIA da lista para proteger o "banco"
        return new ArrayList<>(bancoDeDados.values());
    }

    /**
     * Deleta uma pessoa do "banco" pelo CPF.
     */
    public void delete(String cpf) {
        bancoDeDados.remove(cpf);
    }
}