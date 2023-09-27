package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> inteirosList;

    public SomaNumeros() {
        this.inteirosList = new ArrayList<>();
    }

    public void adicionarNumero (int numero){
        inteirosList.add(numero);
    }

    public int calcularSoma(){
        int valorTotal = 0;
        for (Integer i : inteirosList) {  
            valorTotal += i;
        }
        return valorTotal;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if (!inteirosList.isEmpty()) {
            for (Integer i : inteirosList) {  
                if (i>maiorNumero){
                    maiorNumero = i;
                }
            }
        }
        else {
            throw new RuntimeException("A lista está vazia!");
            }
        return maiorNumero;
    }

   public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if (!inteirosList.isEmpty()) {
            for (Integer i : inteirosList) {  
                if (i<menorNumero){
                    menorNumero = i;
                }
            }
        }
        else {
            throw new RuntimeException("A lista está vazia!");
            }
        return menorNumero;
    }

public void exibirNumeros(){
    if (!inteirosList.isEmpty()) {
        System.out.println(inteirosList);
    }
    else{
        System.out.println("A lista está vazia!");
    }
}

public static void main(String[] args) {
    SomaNumeros somaNumeros = new SomaNumeros();

    somaNumeros.adicionarNumero(16);
    somaNumeros.adicionarNumero(7);
    somaNumeros.adicionarNumero(1);
    somaNumeros.adicionarNumero(0);
    somaNumeros.adicionarNumero(-2);

    System.out.println("Números adicionados a lista:");
    somaNumeros.exibirNumeros();
    
    System.out.println("O maior número é: " + somaNumeros.encontrarMaiorNumero());
    System.out.println("O menor número é: " + somaNumeros.encontrarMenorNumero());
    System.out.println("A soma dos números é: " + somaNumeros.calcularSoma());
}
}   



