package com.example.a13mariano.prueba1.ListaSimple;

public class NodoSimple <T>{
    private T data;
    private NodoSimple siguiente;

    public NodoSimple(T data) {
        this.data = data;
        this.siguiente=null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public NodoSimple getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSimple siguiente) {
        this.siguiente = siguiente;
    }
}
