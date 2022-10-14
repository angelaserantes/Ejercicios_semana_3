package com.ejercios.ejercicios_semana_3;

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner edad = new Scanner(System.in);
        System.out.println("Dime tu edad");
        int n1 = edad.nextInt();
        System.out.println(n1 >= 18 ? "Apto para obtener el carnet" : "no tienes permiso");
    }
}

//Crea un programa que compruebe, dada la edad introducida por el usuario, que puede obtener el permiso de conducción (18 años), mostrando por pantalla True o False.
// Con el interrogante se muestra el valor true  y con los dos puntos el false