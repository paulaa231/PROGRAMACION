package org.example;
import java.util.Scanner;

public class Leysin {

    public static void main(String[] args) {

        int edad=0;
        Scanner teclado = new Scanner(System.in);


        System.out.println("Introduce tu edad");
        try {
        edad = teclado.nextInt();


        }catch (Exception err){

            System.out.println("El formato no es correcto");
        }

        if (edad > 21) {
            System.out.println("TODO TIPO DE ALCHOL");

        } else if (edad >=18) {
            System.out.println("SÓLO FERMENTADAS (cervezas y vinos).");

        }else{
            System.out.println("CONSUMO NO PERMITIDO.");

        }
    }
}
