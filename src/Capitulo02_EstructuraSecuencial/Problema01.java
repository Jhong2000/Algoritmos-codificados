package Capitulo02_EstructuraSecuencial;

import java.util.Scanner;

public class Problema01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = teclado.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = teclado.nextInt();
        System.out.println("La suma es "+ (num1 + num2));
    }


}
