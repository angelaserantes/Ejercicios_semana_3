package com.ejercios.ejercicios_semana_3;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner valor =new Scanner(System.in);
        System.out.println("Dime un número");
        int numero = valor.nextInt();
        System.out.println("Dime otro número");
        int numero2 = valor.nextInt();
        int modulo = numero % numero2;
        System.out.println("El módulo es " + modulo);
    }
}

/*Crea un programa que recoja el valor introducido por el usuario y calcule el
módulo y lo muestre por pantalla.*/