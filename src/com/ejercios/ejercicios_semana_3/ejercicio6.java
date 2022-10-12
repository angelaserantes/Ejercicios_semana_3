package com.ejercios.ejercicios_semana_3;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner cadena = new Scanner(System.in);
        System.out.println("Dime como te llamas");
        String nombre = cadena.next();
        System.out.println("Dime en que localidad vives");
        String localidad = cadena.next();
        System.out.println("Dime un gusto tuyo");
        String gusto = cadena.next();
        System.out.println("Hola tu nombre es " +nombre +"\nEres de " +localidad +"\n" +"te gusta el "+ gusto);
    }
}

/*Crea el programa del ejercicio 3, pero esta vez los valores deben obtenerse
preguntando al usuario.
Con cadena.next(); recogemos el valor que introduce el usuario y se le asigna a nombre*/