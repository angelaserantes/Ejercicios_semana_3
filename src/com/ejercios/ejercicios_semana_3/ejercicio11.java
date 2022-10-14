package com.ejercios.ejercicios_semana_3;

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        System.out.println("Dime un numero");
        int n1 = numeros.nextInt();
        int resultado1 = n1 + 1;
        System.out.println("Dime otro numero");
        int n2 = numeros.nextInt();
        int resultado2 = n2 * resultado1;
        System.out.println("el resultado es " + resultado2);


    }
}

//Crea un programa que recoja un dato del usuario, lo incremente en 1, que el
//usuario introduzca otro dato y que multiplique el nuevo dato por el anterior
//incrementado y lo muestre por pantalla.