package com.ejercios.ejercicios_semana_3;

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int n1 = numeros.nextInt();
        int resultado1 = n1 * 1;
        int resultado2 = n1 * 2;
        int resultado3 = n1 * 3;
        int resultado4 = n1 * 4;
        int resultado5 = n1 * 5;
        int resultado6 = n1 * 6;
        int resultado7 = n1 * 7;
        int resultado8 = n1 * 8;
        int resultado9 = n1 * 9;
        System.out.println("La tabla de multiplicar del "+ n1 +" es:\n" + n1 +"X1=" + resultado1 + "\n" + n1 + "X2=" + resultado2
        + "\n" + n1 + "X3=" + resultado3 + "\n"+ n1 + "X4=" + resultado4 + "\n"+ n1 + "X5=" + resultado5 + "\n"+ n1 + "X6=" + resultado6 + "\n"+ n1 + "X7=" + resultado7
                + "\n"+ n1 + "X8=" + resultado8 + "\n"+ n1 + "X9=" + resultado9) ;

    }
}

//Crea un programa que dado un número, calcule la tabla de multiplicar (de 1 a 9) y la muestre por pantalla.
