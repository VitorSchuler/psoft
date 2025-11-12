/**
 * IMPLEMENTAÇÃO: Papel de Desenvolvedor
 */
public class Desenvolvedor implements Papel {
    @Override
    public String trabalhar() {
        return "Codificando e testando features.";
    }

    @Override
    public String getDescricao() {
        return "Papel: Desenvolvedor";
    }
}