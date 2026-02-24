public abstract class AlertaAdapter implements AlertaListener {
    @Override
    public void naDisponibilidade(ProdutoEvent event) {
        // Não faz nada por padrão
    }

    @Override
    public void naPromocao(ProdutoEvent event) {
        // Não faz nada por padrão
    }
}