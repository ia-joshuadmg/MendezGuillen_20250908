/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package mendezguillen_20250908;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //DEFINIMOS LA CANTIDAD DE DIGITOS QUE SE INGRESARÁN//
        int[] numeros = new int[5];

        // MODULO PARA EL INGRESO DE DATOS//
        System.out.println("Ingrese 5 numeros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        //MOSTRAMOS LOS DATOS INGRESADOS//
        System.out.println("\nNumeros ingresados en el orden original:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println();

        //SE ORDENAN LOS NÚMEROS QUE SE INGRESARON ANTERIORMENTE//
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        //SE MUESTRAN LOS NUMEROS YA ORDENADOS//
        System.out.println("\nNumeros ordenados (ascendente):");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
