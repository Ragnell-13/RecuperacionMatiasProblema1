package Dispositivos;

import java.util.ArrayList;

public class Impresora {
    ArrayList<String> lista = new ArrayList<String>();
    public final int TOP = 0;



    public void enqueue (String value)  {lista.add(value);}

    public String dequeue () {return lista.remove(TOP);}

    public String status (int value) {
        String output;
        if (value == 1){
            output = "La impresora está encendida";
        }
        else{
            output = "La impresora está apagada";
        }
        return output;
    }

    public void imprimirTrabajos () {
        final int SIZE = lista.size();

        for (int i = 0; i < SIZE; i++) {
        System.out.println(dequeue());
        }
    }
    public void MostrarTrabajos () {
        final int SIZE = lista.size();

        for (int i = 0; i < SIZE; i++) {
            System.out.println(lista.get(i));
        }
    }


}
