package controller;

import java.util.Scanner;

public class RecebeValores {
    Scanner scanner = new Scanner(System.in);

    private int valorMenu;
    private double valorMoeda;

    public int OpcaoMenu(){
        valorMenu = scanner.nextInt();
        return valorMenu;
    }

    public double RecebeValor(){
            valorMoeda = scanner.nextDouble();
            return valorMoeda;
    }

}
