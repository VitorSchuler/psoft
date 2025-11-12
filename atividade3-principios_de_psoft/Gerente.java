/**
 * IMPLEMENTAÇÃO: Papel de Gerente
 */
public class Gerente implements Papel {
    @Override
    public String trabalhar() {
        return "Gerenciando o backlog e a equipe.";
    }

    @Override
    public String getDescricao() {
        return "Papel: Gerente";
    }
}