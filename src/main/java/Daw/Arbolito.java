/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Daw;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Arbolito {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int altura;
        final int tronco = 2;

        System.out.println("Introduce un número del 2 al 10 para definir"
                + " la altura del árbol ");
        altura = teclado.nextInt();
        while (!(altura >= 2 && altura <= 10)) {
            System.out.println("Introduce un número del 2 al 10 para definir"
                    + " la altura del árbol ");
            altura = teclado.nextInt();
        }
        char matriz[][] = new char[altura + tronco][altura * 2];

        for (int i = 0; i < matriz.length - tronco; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j < altura - i || j > (altura + i)) {
                    matriz[i][j] = ' ';
                } else {
                    matriz[i][j] = '*';
                }
            }
        }

        for (int i = matriz.length - tronco; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j != altura) {
                    matriz[i][j] = ' ';
                } else {
                    matriz[i][j] = '*';
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.println();
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
        }
    }
}
