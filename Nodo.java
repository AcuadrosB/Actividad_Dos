package co.edu.uniminuto;


import co.edu.uniminuto.Nodo;

public class Nodo {  //   GRAFICVO //////*************

    Nodo enlace;
    String marca;
    String color;
    String placa;
    Nodo siguiente;
    Nodo anterior;

    public Nodo(String marca, String color, String placa) {

        this.marca = marca;
        this.color = color;
        this.placa = placa;
        this.enlace = null;
        this.anterior = null;
        this.siguiente = null;
    }

}
