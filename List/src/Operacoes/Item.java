package Operacoes;

public class Item {
    
     private String nome;
        public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private double preço;
        public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    private int quantidade;
       
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Item (String nome,double preço, int quantidade){
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
    }

    public String toString() {
        return "[Item:" + nome + ", R$ " + preço + ", quantidade: " + quantidade + "]";
    }
    
}
    
   