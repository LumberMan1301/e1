package com.example.a13mariano.prueba1;

import com.example.a13mariano.prueba1.ListaSimple.ListaSimple;

import static com.example.a13mariano.prueba1.Sort.BubbleSort.sort;

public class Main {
    public static void main(String [] args){
        ListaSimple l = new ListaSimple();

        // cantidad de numeros
        int cantidad = (int) (Math.random()*20)+20;
        for(int i = 0; i < cantidad; i++){
            //numero aleatorio
            int num = (int) (Math.random()*99);
            l.insertar(num);
        }


        l.imprimirL();

        sort(l);

        l.imprimirL();


    }
}
