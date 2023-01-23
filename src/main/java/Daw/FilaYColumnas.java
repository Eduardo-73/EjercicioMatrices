/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package Daw;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class FilaYColumnas {

    public static void main(String[] args) {
        //Mayor fila a mayor columna
        int numUsuario;
        numUsuario = solicitarNumero();
        int[][] matriz = new int[numUsuario][numUsuario];
        solicitarMatriz(matriz);
    }

    public static int solicitarNumero() {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        do {
            try {
                System.out.println("Introduzca un número del 3 al 6 ");
                if (num > 2 || num < 6) {
                    num = teclado.nextInt();
                }
                break;
            } catch (InputMismatchException ime) {
                System.out.println("No has introducido un número entero ");
            }
        } while (true);
        return num;
    }

    public static void solicitarMatriz(int[][] matriz) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Introduce los valores que quieres que "
                        + "vayan dentro de la matriz");
                matriz[i][j] = teclado.nextInt();
            }
        }
    }

    public static void solicitarMatrizRandom(int[][] matriz) {
        Random gen = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Introduce los valores que quieres que "
                        + "vayan dentro de la matriz");
                matriz[i][j] = gen.nextInt(0, 21);
            }
        }
    }

    public static Coordenadas coordenadaFilaMayor(int fila, int[][] matriz) {
        Coordenadas c1 = new Coordenadas(-1, -1);
        int numMayor = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[fila][i] > numMayor) {
                numMayor = matriz[fila][i];
                c1.setFila(fila);
                c1.setColumna(i);
            }
        }
        return c1;
    }

//    public static void  
}
