import java.sql.SQLOutput;
import java.util.Scanner;
public class areaVolumenCilindro {
    public static void main(String[] args) {
        //Instanciando como un objeto la funcionalidad scanner;
        Scanner scanner = new Scanner(System.in);

        //Inroducir el radio del cilindro para calcularlo:
        System.out.println("Introduce el radio del cilindro");
        double radioDelCilindro = scanner.nextDouble();

        //Introducir la altura del cilindro para calcularlo:
        System.out.println("introduce la altura del cilindro: ");
        double alturaDelCilindro = scanner.nextDouble();

        //

        double areaLateralcilindro = ( 2 * Math.PI * radioDelCilindro * alturaDelCilindro );
        double areaTotalDelCilindro = (2 * Math.PI * radioDelCilindro * (radioDelCilindro + alturaDelCilindro));
        double volumenDelCilindro = Math.PI * radioDelCilindro * radioDelCilindro * alturaDelCilindro ;

        //Imprimir los resultados:
        System.out.println("el area lateral del cilindro es: " + areaLateralcilindro);
        System.out.println("El area total del cilindro es: " + areaLateralcilindro);
        System.out.println("El volumen del cilindro es: " + volumenDelCilindro);
    }
}
