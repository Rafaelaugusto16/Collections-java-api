package Operacoes;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
        
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));      
    }

    public void removerItem(String nome){
        
        List<Item> itemParaRemover = new ArrayList<>();
        for (Item i : itemList) {
           if (i.getNome().equalsIgnoreCase(nome)){
            itemParaRemover.add(i);
           } 
        }
        itemList.removeAll(itemParaRemover);
    }
    
    public double calcularValorTotal(){
        double valorTotal = 0;
        for (Item i : itemList) {
            valorTotal = valorTotal + (i.getPreço() * i.getQuantidade());           
        }
    return valorTotal;
    }

    public void exibirItens(){
        System.out.println(itemList);
    }
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Relógio",10, 5);
        carrinhoDeCompras.adicionarItem("lápis",5, 1);
        carrinhoDeCompras.exibirItens();
        System.out.println("O valor total do carrinho é de: R$ " + carrinhoDeCompras.calcularValorTotal());
  
    }
}

       


