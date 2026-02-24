public class AlertaPromocao extends AlertaAdapter {
    private Usuario usuario;

    public AlertaPromocao(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public void naPromocao(ProdutoEvent event) {
        System.out.println("💰 [PROMOÇÃO] Olá " + usuario.getNome() + "!");
        System.out.println("O produto '" + event.getProduto().getNome() + "' entrou em promoção!");
        System.out.println("Link: " + event.getProduto().getLink());
        System.out.println("Código Promocional: " + event.getCodigoPromocional() + "\n");
    }
}