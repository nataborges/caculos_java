package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {

        //local de declaração de variáveis
        Scanner scanner = new Scanner(System.in);
        int menu = 0;


        //Seção layout do menu
        System.out.println("---------------------------------------------");
        System.out.println("|           programa de resolução           |");
        System.out.println("|                de Cálculos                |");
        System.out.println("---------------------------------------------");
        System.out.println();
        System.out.println("Bem vindo ao programa de resolução de cálculos");
        System.out.println("escolha a opção desejada:");
        System.out.println("1 - Conversor de moedas");
        System.out.println("2 - Converor de medidas");
        System.out.println("3 - Conversor de temperatura");
        //lê a entrada do teclado do usuário
        System.out.print("Opção: ");
        menu = scanner.nextInt();

        //execução do menu correto

        switch (menu) {
            case 1:
                System.out.println("Entrou no conversão de moeda");
                break;
            case 2:
                System.out.println("Entrou no conversão de medida");
                break;
            case 3:
                System.out.println("Entrou no conversão de temperatura");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }

        //execução  do menu no nível complicado
      //  if (menu == 1) {
            //execução do menu 1
      //      System.out.println("Entrou no conversor de moeda");
      //  } else {
        //    if (menu == 2) {
        //        //execução do menu 2
            //    System.out.println("Entrou no conversor de medida");
       //     } else {
          //      if (menu == 3) {
                    //execução do menu 3
         //           System.out.println("Entrou no conversor de temperatura");
           //     }else {
                    //menu inválido
                //    System.out.println("Opção inválida");
              //  }
            //}
       // }
    }
}