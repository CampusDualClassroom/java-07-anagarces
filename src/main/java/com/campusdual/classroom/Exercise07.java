package com.campusdual.classroom;


import java.util.ArrayList;
import java.util.List;

public class Exercise07 {

    public static void main(String[] args) {



       positionInAList(6);

       sumFirstNaturalNumbers(7);
       showFirstNaturalNumbers(10);
    }

    //
    // ESTE METODO NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {

        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(9);
        myList.add(8);
        myList.add(7);
        myList.add(6);
        myList.add(5);
        myList.add(4);
        myList.add(3);
        myList.add(2);
        myList.add(1);

        if (myList.contains(num)) {
            System.out.println("El elemento " + num + " se encuentra en la posición: " + myList.indexOf(num));
        } else {
            System.out.println("El elemento " + num + " no se encuentra en la lista.");
        }
    }

    //
    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {
        int total = 0;
        for (int i = 1; i <= num; i++){
            total += i;
        } System.out.println("La suma de los primeros numeros naturales de " + num + "  es igual a " + total);
    }

    //
    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {
        System.out.println("Lista de los primeros números positivos de " + num);

        for (int i = 1; i <= num; i++){
            System.out.println("Número natural = " + i);
        }
    }

}
