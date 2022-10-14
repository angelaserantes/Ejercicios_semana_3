package com.ejercios.ejercicios_semana_3;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner cadenas = new Scanner(System.in);
        System.out.println("Dime una palabra");
        String palabra1 = cadenas.next();
        System.out.println("Dime otra palabra");
        String palabra2 = cadenas.next();
        if (palabra1.equals(palabra2)){
            System.out.println("Las palabras introducidas son iguales ");
        } else System.out.println("Las palabras introcudidas no son iguales ");
    }

}

//Crea un programa que compare dos cadenas de texto y muestre por pantalla si son la misma.
//Se utiliza equals para comparar si las palabras introducidas son iguales o no