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
    // Wrapper: lo que usa el programa principal
    public boolean esPalindromo(String palabra) {
        if (palabra == null) {
            return false;
        }
        String palabraNueva = palabra.toLowerCase();
        palabraNueva = palabraNueva.replace(" ", "");
        if (palabraNueva.isEmpty()) {
            return false;
        }
        return verificar(palabraNueva, 0, palabraNueva.length() - 1);
    }

    // Método recursivo que hace el trabajo
    private boolean verificar(String palabra, int izq, int der) {
        if (izq >= der) {
            return true;
        }
        if (palabra.charAt(izq) != palabra.charAt(der)) {
            return false;
        }
        return verificar(palabra, izq + 1, der - 1);
    }
    
    public static void main(String args[]) {
        Palindromo pruebas = new Palindromo();

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
