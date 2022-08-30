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
    }

    public static double ivaPrecio (double precio) {
        double iva = 1.21;
        return precio * iva;
    }
}
