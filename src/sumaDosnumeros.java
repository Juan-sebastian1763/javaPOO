import java.util.Scanner;
public class sumaDosnumeros {
    public static void main(String[] args) {
        //importar funcionalidad para leer numeros desde la consola:
        Scanner scanner = new Scanner(System.in);

        //introducir el primer numero:
        System.out.println("Ingrese el primer numero: ");
        int numero1 = scanner.nextInt();

        //Introducir el segundo numero:
        System.out.println("Ingrese el segundo numero: ");
        int numero2 = scanner.nextInt();

        //Sumatoria de los dos numero ingresados por consola:
        int sumatoria = numero1 + numero2 ;

        //Impresion del resultado de la sumatoria:
        System.out.println("El resulado de la suma es: " + sumatoria);
    }
}
