package ejercicios;

import java.util.Scanner;

public class Tema3 {
    public static void main(String[] args) {

        System.out.println("¿Cuantas palabras quieres concatenar?");
        try {
            Scanner scanner = new Scanner(System.in);
            int cantidad = scanner.nextInt();

            String arrayString[] = new String[cantidad];
            for (int i = 0; i < cantidad; i++) {
                System.out.println("Palabra nª: " + (i + 1));
                String palabra = scanner.next();
                arrayString[i] = palabra;
            }

            String concatenar = "";
            for (String palabraMostrar : arrayString) {
                concatenar = concatenar + palabraMostrar;
            }
            System.out.println("Las palabras concatenadas son: " + concatenar);

            StringBuilder concatenarBuilder = new StringBuilder();
            for (String palabraMostrar : arrayString) {
                concatenarBuilder.append(palabraMostrar);
            }

            System.out.println("Las palabras concatenadas utilizando StringBuilder son: " + concatenarBuilder);
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
