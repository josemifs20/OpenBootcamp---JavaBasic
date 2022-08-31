package ejercicios;

import java.util.Scanner;

public class Tema2 {
    public static void main(String[] args) {
        double precio = 100;
        double calculo = ivaPrecio(precio);
        System.out.println("El precio con Iva es de " + calculo);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica el precio al que sumar el IVA:");
        double precioTeclado = scanner.nextDouble();
        double calculoTeclado = ivaPrecio(precioTeclado);
        System.out.println("El precio con Iva es de " + calculoTeclado);
        // Extra
        // Declaraciones de arrays, formas.
        String[] name; // Declaración de array tipo 1
        String name1[]; // Declaración de array tipo 2
        String[] nombres = new String[3];  // Declaración de array y asignación espacio
        String[] nombres1 = {"pepe", "Mario", "juan"};  // Declaración de array y asignación de valores
        String[] arrayString = new String[]{"one", "two", "three", "four", "five"}; // Declaración de array y asignación valores tipo 2
    }

    public static double ivaPrecio(double precio) {
        double iva = 1.21;
        return precio * iva;
    }
}
