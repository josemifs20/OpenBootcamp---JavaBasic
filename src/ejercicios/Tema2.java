package ejercicios;

public class Tema2 {
    public static void main(String[] args) {
        double precio = 100;
        double calculo = ivaPrecio(precio);
        System.out.println("El precio con Iva es de " + calculo);
    }

    public static double ivaPrecio (double precio) {
        double iva = 1.21;
        return precio * iva;
    }
}
