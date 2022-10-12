package com.ejercios.ejercicios_semana_3;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Dame un valor para el radio");
        int r = valor.nextInt();
        double PI = 3.1415;
        double a = (PI * (r *r));
        double l = 2 * PI * r;
        System.out.println("El área es " +a);
        System.out.println("La longitud es " +l);
    }
}

/*Crea el programa del ejercicio 2, pero esta vez los valores deben de
obtenerse preguntando al usuario

Ponemos valor.nextInt() para recoger el valor que nos da el usuario*/