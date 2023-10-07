import java.util.Scanner;

public class arreglopares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo de enteros: ");
        int t = scanner.nextInt();

        // Declarar y construir el arreglo de enteros
        int[] arregloDeEnteros = new int[t];

        // Introducir los valores enteros por teclado
        System.out.println("Ingrese los valores del arreglo:");
        for (int i = 0; i < t; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arregloDeEnteros[i] = scanner.nextInt();
        }

        // Encontrar el valor máximo y mínimo
        int mayor = arregloDeEnteros[0];
        int menor = arregloDeEnteros[0];
        int impares = 0;
        int pares = 0;

        for (int valor : arregloDeEnteros) {
            if (valor > mayor) {
                mayor = valor;
            }
            if (valor < menor) {
                menor = valor;
            }
            if (valor % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        // Imprimir los resultados
        System.out.println("Valor máximo: " + mayor);
        System.out.println("Valor mínimo: " + menor);
        System.out.println("Cantidad de valores pares: " + pares);
        System.out.println("Cantidad de valores impares: " + impares);

        scanner.close();
    }
}