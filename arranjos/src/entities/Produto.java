package entities;

public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double prece) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }
    public void setNome() {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPrece(double prece) {
        this.preco = prece;
    }
}
