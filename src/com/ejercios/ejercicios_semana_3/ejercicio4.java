package com.ejercios.ejercicios_semana_3;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Dame un valor para la base del rectángulo");
        int b = valor.nextInt();
        System.out.println("Dame un valor para la altura del rectángulo");
        int h = valor.nextInt();
        int a = b * h;
        System.out.println("El área de un rectángulo es " + a);

    }
}

/*Crea el programa del ejercicio 1, pero esta vez los valores deben de
obtenerse preguntando al usuario.
Pista: variable = prompt(“Introduce…”)

Scanner valor = new Scanner(System.in); es una clase de java para recoger valores de una consola
nextInt() el valor que estoy cogiendo de la pantalla es un número entero*/