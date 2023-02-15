package orcamento;

public class orcamento {
    public float preco;
    public float precoFinal;

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setPrecoFinal(float precoFinal) {
        this.precoFinal = precoFinal;
    }

    public float getPreco() {
        return preco;
    }

    public float getPrecoFinal() {
        return precoFinal;
    }

    @Override
    public String toString() {
        return "preco: " + preco + ", precoFinal: " + precoFinal;
    }
}
