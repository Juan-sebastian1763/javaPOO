import java.util.Scanner;
public class Circunferencia {
    public static void main(String[] args) {
        //Instanciar al objeto scanner para acceder a sus propiedades y ser utilizado;
        Scanner scanner = new Scanner(System.in);

        //Leer el radio de la circunferencia escrito por el usuario;
        System.out.println("Introduzca el radio de la circunferencia...");
        double radioCircunferencia = scanner.nextDouble();

        //Calcular la longitud de la circunferencia antes escrita por el usuario;
        double longitudCircunferencia = ( 2 * Math.PI * radioCircunferencia);

        //calcular el area de la circunferencia;
        //La constante PI define el valor de pi (π).
        //El metodo Math.pow define el poder elevar un numero a una potencia
        double areaCircunferencia = Math.PI * Math.pow(radioCircunferencia, 2);

        //Imprimir los resultados adquiridos;
        System.out.println("La longitud de la circunferencia dada es: " + longitudCircunferencia);
        System.out.println("El area de la circunferencia dada es: " + areaCircunferencia);
    }
}
