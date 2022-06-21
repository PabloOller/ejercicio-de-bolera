/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oller_pérez_pablo_e1;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Oller_Pérez_Pablo_E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0, tickets = 0, edad;
        double dinero = 0, precio;
        Scanner lector = new Scanner(System.in);
        do {
            System.out.print("Bolera DAW");
            System.out.println("=====================");
            System.out.println("1. Vender Ticket.");
            System.out.println("2. Resumen de ventas.");
            System.out.println("3. Salir");
        } while (opcion >= 1 && opcion <= 3);
        do {
            System.out.print("\nOpción? ");
            opcion = lector.nextInt();
            switch (opcion) {
                case 1:
                    tickets++;
                    System.out.println("Generando ticket...");
                    System.out.print("\nedad? ");
                    edad = lector.nextInt();
                    if (edad <= 5) {
                        precio = 3;
                    } else if (edad >= 6 && edad <= 14) {
                        precio = (11 * 0.75);
                    } else if (edad >= 50 && edad <= 70) {
                        precio = (11 * 0.1);
                    } else if (edad >14 && edad < 50) {
                        precio = 11;
                    } else{
                        precio = 0.5;
                    }
                    dinero += precio;
                    System.out.println("TICKET DE ENTRADA");
                    System.out.println("Edad: " + edad);
                    System.out.println("Total a pagar: " + precio + "€");
                    break;

                case 2:
                    System.out.println("RESUMEN DE VENTAS");
                    System.out.println("-----------------");
                    System.out.println(tickets + " Tickets vendidos.");
                    System.out.println(dinero + "€ recaudados en caja.");
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("ERROR: opcion incorrecta");
                    break;
            }

        } while (opcion != 3);
    }

}
