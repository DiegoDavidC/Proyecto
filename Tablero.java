package BuscaPalabra;

import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class Tablero {

    //Se modifica el array de adivinar palabra, para que sea un arreglo de varias dimensiones según el nivel que el usuario digite
    private String[] palabraAAdivinar = {"P", "A", "R", "A", "D", "I", "G", "M", "A", "S"};
    private String[] palabraAdivinada;
    private String[][][] palabras = {
            {"luna", "serpiente", "sol", "dia", "pato"}, 
            {"locomotora", "escalera", "dinosaurio", "bicicleta", "estrella"}, 
            {"electroencefalografista", "esternocleidomastoideo", "otorrinolaringolo", "paralelepipedo"},
    };

    public Tablero() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Selecciona el nivel que deseas realizar del 1 a 3");
        int nivel = entrada.nextInt();
        nivel(nivel);
        palabraAdivinada = new String[palabraAAdivinar.length];
        limpiar();
    }

    public String nivel(int nivel){
        switch(nivel){
            case 1:
                System.out.println("Escogio el nivel 1");
                break;
            case 2: 
                System.out.println("Escogio el nivel 2");
                break;
            case 3:
                System.out.println("Escogio el nivel 3");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }

    public void limpiar() {
        for (int i = 0; i < palabraAdivinada.length; i++) {
            palabraAdivinada[i] = "";
        }
    }

    public void imprimir() {
        for (int i = 0; i < palabraAdivinada.length; i++) {
            if (palabraAdivinada[i].equals("")) {
                System.out.print("_");
            } else {
                System.out.print(palabraAdivinada[i]);
            }

        }
        System.out.println("");
    }

    public void verificar(String letra) {
        for (int i = 0; i < palabraAAdivinar.length; i++) {
            if (palabraAAdivinar[i].equalsIgnoreCase(letra)) {
                palabraAdivinada[i] = letra;
            }
        }
    }

    public int getCantidadElementos() {
        return palabraAAdivinar.length;
    }

    public boolean verificarGanador() {
        boolean valor = true;
        for (int i = 0; i < palabraAdivinada.length; i++) {
            if (palabraAdivinada[i].equals("")) {
                valor = false;

            }

        }
        return valor;

    }

}