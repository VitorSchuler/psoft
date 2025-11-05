public class Pagamento {
    private double valorPago;
    private String forma;

    //Constructor
    public Pagamento(double valorPago, String forma) {
        this.valorPago = valorPago;
        this.forma = forma;
    }

    //G and S
    public double getValorPago() {
        return valorPago;
    }
    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }
    public String getForma() {
        return forma;
    }
    public void setForma(String forma) {
        this.forma = forma;
    }
    

    
}

