package org.example;

import java.util.Scanner;

public class Delegados {

    public static void main(String[] args) {

        final int VOTOS_MAX = 25;
        String candidato1="", candidato2="";
        int votos1=0, votos2=0;
        Scanner teclado = new Scanner(System.in);


        System.out.println("Introduce el nombre del candidato 1:");
        candidato1 = teclado.next();

        System.out.println("Introduce los votos para "+(candidato1));
        votos1 = teclado.nextInt();

        System.out.println("Introduce el nombre del candidato 2:");
        candidato2 = teclado.next();

        System.out.println("Introduce los votos para "+(candidato2));
        votos2 = teclado.nextInt();

        int suma_votos = votos1 + votos2;
        int votos_blancos= 25-suma_votos;

        if (suma_votos>VOTOS_MAX){
            System.out.println("ERROR. No pueden votar mas personas "+(suma_votos)+" que personas en la clase: 25" );
        } else if (votos1 > votos2) {

            System.out.println("RESULTADOS:");
            System.out.println("Total de votos: "+(suma_votos));
            System.out.println("Votos en blanco: "+(votos_blancos));
            System.out.println(candidato1);

        }else if (votos2 > votos1) {

            System.out.println("RESULTADOS:");
            System.out.println("Total de votos: "+(suma_votos));
            System.out.println("Votos en blanco: "+(votos_blancos));
            System.out.println(candidato2);
        }else if (votos1 == votos2){
            System.out.println("REPETIR VOTACIÓN");
        }



    }
}
