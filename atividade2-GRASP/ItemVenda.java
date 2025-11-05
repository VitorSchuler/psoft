public class ItemVenda {
    private int quantidade;
    private Produto produto;

    //Constructor
    public ItemVenda(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    //G and S
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getSubTotal(){
        double SubTotal;
        if (quantidade >= 100) {
            SubTotal = produto.getPrecoUnd() * quantidade * 0.9;
        }
        else{
            SubTotal = produto.getPrecoUnd() * quantidade;
        }
        return SubTotal;
    }

}
