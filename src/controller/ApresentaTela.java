package controller;

public class ApresentaTela {

    public void printTela(int cont){
        System.out.println("-------------------------------------");
        if (cont%2 ==1){
            System.out.println("Qual a moeda base que você pretende converter?");
        }
        else {
            System.out.println("Para qual moeda deve ser convertido?");
        }
        System.out.print("""
        1 - Real Brasileiro - BRL
        2 - Iene Japonês - JPY
        3 - Renminbi Chinês - CNY
        4 - Libra Esterlina - GBP
        5 - Euro - EUR
        6 - Dólar Americano - USD
        0 - Encerra aplicação
        Digite a opção que deseja:
        """);
    }

    public void printInvalida(){
        System.out.println("\nOpção inválida!\n");
    }

    public void printValorDesejado(String base, String alvo){
        System.out.println("Digite a quantidade em " + base + " que pretende converter para " + alvo);
    }

    public void printValorConvertido(String base, String alvo, double valorEntrada, double valorSaida){
        System.out.println("\nResultado da conversão: " + valorEntrada + " " + base + " = " + valorSaida + " " + alvo + "\n");
    }

    public void printInvalidaFim(){
        System.out.println("Valor inválido! A aplicação está sendo encerrada..");
    }
}
