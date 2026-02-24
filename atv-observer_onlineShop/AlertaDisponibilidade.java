public class AlertaDisponibilidade extends AlertaAdapter {
    private Usuario usuario;

    public AlertaDisponibilidade(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public void naDisponibilidade(ProdutoEvent event) {
        System.out.println("🔔 [DISPONIBILIDADE] Olá " + usuario.getNome() + "!");
        System.out.println("O produto '" + event.getProduto().getNome() + "' já está disponível!");
        System.out.println("Link: " + event.getProduto().getLink() + "\n");
    }
}