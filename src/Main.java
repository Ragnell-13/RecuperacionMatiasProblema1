import Dispositivos.Impresora;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Impresora impresora = new Impresora();

        String option ="";
        Scanner leer = new Scanner(System.in);
        int estado = 0;

        while (!option.equals("Q")) {
            System.out.println(
                    " \n Seleccione una opción: " +
                    " \n 1.- Encender impresora" +
                    " \n 2.- Apagar impresora " +
                    " \n 3.- Añadir trabajo " +
                    " \n 4.- Ver lista de trabajos " +
                    " \n 5.- Imprimir " +
                    " \n Q.- Salir del programa");
            option = leer.nextLine().toUpperCase();

            switch (option){
                case "1":
                 estado = 1;
                 impresora.status(estado);
                    break;

                case "2":
                    estado = 0;
                    impresora.status(estado);
                    break;

                case "3":
                    if (estado == 1){
                        System.out.println("Nombre del trabajo: ");
                        impresora.enqueue(leer.nextLine());
                    }
                    else {
                        System.out.println("La impresora está apagada, no se pueden añadir trabajos");
                    }

                    break;

                case "4":
                    if (estado == 1){
                        System.out.println("Lista de trabajos: ");
                        impresora.MostrarTrabajos();
                    }
                    else {
                        System.out.println("La impresora está apagada, no se pueden mostrar los trabajos");
                    }

                    break;

                case "5":
                    if (estado == 1){
                        impresora.imprimirTrabajos();
                    }
                    else {
                        System.out.println("La impresora está apagada, no se pueden imprimir los trabajos");
                    }

                    break;

                default:

                    break;
            }

        }

    }
}
