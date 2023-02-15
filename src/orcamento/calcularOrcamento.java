package orcamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import impostos.ICMS;

public class calcularOrcamento {

    
    public static void main(String[] args) {
        // Lista para somar os valores de imposto e o preco
        List<Float> valoreList = new ArrayList<Float>();

        // Pegar entrada de dados do console
        Scanner scanner = new Scanner(System.in);
        // Instancia de um novo orcamento
        orcamento novOrcamento = new orcamento();

        // Impostos a serem calculados
        ICMS icms = new ICMS();


        // Pega os dados de entrada
        System.out.println("Digite o valor do produto: ");
        float preco = scanner.nextFloat();

        // SETA os valores
        novOrcamento.setPreco(preco);
        icms.calcular(preco);

        // Fecha scanner para não ler mais entradas
        scanner.close();

        valoreList.add(novOrcamento.getPreco());
        valoreList.add(icms.getICMS());

        float somaValores = 0;
        for(int i = 0; i < valoreList.size(); i++){
            somaValores += valoreList.get(i);
        }
        // Seta a soma dos valores para o preco final
        novOrcamento.setPrecoFinal(somaValores);


        System.out.println("++++++++++++++++++++++");
        System.out.printf("|Preco: R$ %.2f\n", novOrcamento.getPreco());
        System.out.printf("|ICMS: R$ %.2f\n", icms.getICMS());
        System.out.printf("|Valor final: R$ %.2f\n", novOrcamento.getPrecoFinal());
        System.out.println("++++++++++++++++++++++");

        
    }
    
}
