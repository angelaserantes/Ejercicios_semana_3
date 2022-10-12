package com.ejercios.ejercicios_semana_3;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
    Scanner datos = new Scanner(System.in);
    System.out.println("Dime un numero");
    int n1 = datos.nextInt();
    System.out.println("Dime otro numero");
    int n2 = datos.nextInt();
    if (n1 == n2) {
        System.out.println("Los datos introcudidos  son iguales ");
    } else System.out.println("Los datos introcudidos  no son iguales ");
    }
}

//Crea un programa que compare dos datos introducidos por el usuario y
// muestre por pantalla si tienen el mismo valor o no.
// Con if muestro si los datos son iguales si no lo son los muestra con else
