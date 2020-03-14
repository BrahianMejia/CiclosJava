package main;

import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Número para sacar la tabla: ");

        int numero = teclado.nextInt();

        for(int i = 0; i <= 10; i++)
        {
            System.out.println(numero + "x" + i + ": " + (numero * i));
        }

        System.out.println("");
        System.out.println("");

        int j = 0;

        while(j <= 10)
        {
            System.out.println(numero + "x" + j + ": " + (numero * j));
            j++;
        }

        System.out.println("");
        System.out.println("");

        int k = 0;

        do
        {
            System.out.println(numero + "x" + k + ": " + (numero * k));
            k++;
        }while(k <= 10);
    }
}
