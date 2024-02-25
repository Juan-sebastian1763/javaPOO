import java.util.Scanner;
public class Promedio {
    public static void main(String[] args) {
        //Instanciar a scanner en un metodo para poder ser utilizada;
        Scanner scanner = new Scanner(System.in);

        //Leer los numeros que ingresaran para ser calculados
        //numero 1
        System.out.println("Introduce el primer numero: ");
        int numero1 = scanner.nextInt();

        //numero 2
        System.out.println("introduce el segundo numero: ");
        int numero2 = scanner.nextInt();

        //numero 3
        System.out.println("Introduce el tercer numero");
        int numero3 = scanner.nextInt();

        //Calculo del promedio de los tres numeros
        int promedioNumeros = (numero1 + numero2 + numero3) / 3 ;

        System.out.println("El promedio de los 3 numeros dados es: " + promedioNumeros);

    }
}
