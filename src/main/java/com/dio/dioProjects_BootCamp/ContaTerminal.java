package com.dio.dioProjects_BootCamp;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        double Saldo = 12000;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Favor digite o nome da agencia");
        String Agencia = scanner.next();

        System.out.println("Digite o numero da agencia");
        int NumeroAgencia = scanner.nextInt();


        System.out.println("Digite o seu nome");
        String NomeCliente = scanner.next();


        System.out.println("Seja muito Bem-vindo " + NomeCliente + " sua agencia é " + Agencia + " e o numero dela " + NumeroAgencia + " e seu saldo:" + Saldo);
    }
}