package com.ejercios.ejercicios_semana_3;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Dime un numero");
        int n1 = datos.nextInt();
        System.out.println("Dime otro número");
        int n2 = datos.nextInt();
        System.out.println("Dime tu número favorito");
        int n3 = datos.nextInt();
        if (n1==n2 & n1==n3 & n2==n3) {
            System.out.println("los tres números son iguales");
        } else if (n1==n2 | n1==n3 | n2==n3){
            System.out.println("dos números son iguales");
        } else
             System.out.println("ninguno de los números no son iguales");
    }
}

//Crea un programa que recoja 3 datos del usuario y muestre si son el mismo dato alguno de ellos.
//En el primer if compruebo si los tres son iguales
//En el if else compruebo que al menos uno es igual al otro
// En el último else confirma que ninguno son iguales