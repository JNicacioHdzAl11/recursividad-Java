/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uthh.edd.unidad1.recursion;

/**
 *
 * @author Lenovo_PC
 */
public class Palindromo {
   // Prepara la palabra o frase para ver si se lee igual al revés
    public boolean esPalindromo(String palabra) {
        // Si no nos enviaron nada, no hay nada que revisar
        if (palabra == null) {
            return false;
        }

        // Convertimos todo a minúsculas para no pelear con las mayúsculas
        String palabraNueva = palabra.toLowerCase();
        
        // Quitamos los espacios para que las frases largas no den problemas
        palabraNueva = palabraNueva.replace(" ", "");

        // Si terminó quedando vacía, tampoco cuenta
        if (palabraNueva.isEmpty()) {
            return false;
        }

        // Arrancamos a comparar desde las dos puntas: el inicio y el final
        return verificar(palabraNueva, 0, palabraNueva.length() - 1);
    }

    // Compara las letras desde las orillas hacia el centro
    private boolean verificar(String palabra, int izq, int der) {
        // Si los marcadores ya se cruzaron o llegaron al medio, es porque todo coincidió
        if (izq >= der) {
            return true;
        }

        // Si la letra de la izquierda es diferente a la de la derecha, no es palíndromo
        if (palabra.charAt(izq) != palabra.charAt(der)) {
            return false;
        }

        // Avanzamos un paso hacia el centro de ambos lados y volvemos a revisar
        return verificar(palabra, izq + 1, der - 1);
    }

    public static void main(String args[]) {
        Palindromo pruebas = new Palindromo();

        // Pruebas para ver qué tal funciona
        System.out.println("radar: " + pruebas.esPalindromo("radar"));
        System.out.println("reconocer: " + pruebas.esPalindromo("reconocer"));
        System.out.println("cadena vacia: " + pruebas.esPalindromo(""));
        System.out.println("cadena de espacios: " + pruebas.esPalindromo(" "));
        System.out.println("cadena nula: " + pruebas.esPalindromo(null));
        System.out.println("Una letra: " + pruebas.esPalindromo("a"));
        System.out.println("ab: " + pruebas.esPalindromo("ab"));
        System.out.println("Casa: " + pruebas.esPalindromo("Casa"));
        System.out.println("Anita lava la tina: " + pruebas.esPalindromo("Anita lava la tina"));
    }
    
}
