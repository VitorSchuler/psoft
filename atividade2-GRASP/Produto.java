public class Produto {
    private String nome;
    private double precoUnd;

    //Construtor
    public Produto(String nome, double precoUnd) {
        this.nome = nome;
        this.precoUnd = precoUnd;
    }

    //getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoUnd() {
        return precoUnd;
    }

    public void setPrecoUnd(double precoUnd) {
        this.precoUnd = precoUnd;
    }

    
    
}

