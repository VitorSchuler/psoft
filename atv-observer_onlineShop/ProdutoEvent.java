public class ProdutoEvent {
    private Produto produto;
    private String codigoPromocional;

    public ProdutoEvent(Produto produto, String codigoPromocional) {
        this.produto = produto;
        this.codigoPromocional = codigoPromocional;
    }

    public Produto getProduto() { return produto; }
    public String getCodigoPromocional() { return codigoPromocional; }
}