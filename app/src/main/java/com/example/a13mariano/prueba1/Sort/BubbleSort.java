package com.example.a13mariano.prueba1.Sort;

import com.example.a13mariano.prueba1.ListaSimple.ListaSimple;

public class BubbleSort {


    /**
     * Crea una copia de la lista, y llama al metodo privado para recursividad
     * @param lista para trabaja con una copia de la lista
     */
    public static void sort(ListaSimple lista)
    {
        ListaSimple list = lista;
        BubbleSortAuxiliar(list, lista.getCapacidad() - 1);
    }
    private static void BubbleSortAuxiliar(ListaSimple list, int amount){
        int comparaciones=0;
        for (int out = amount; out > 0; out--) {
            for (int in = 0; in < out; in++) {
                comparaciones++;
                if ((list.get(in)) < (list.get(in + 1))) {
                    list.swap(in, in + 1);
                    System.out.print(comparaciones);
                    list.imprimirL();


                }
            }
        }
    }
}
