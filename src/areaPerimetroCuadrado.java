import java.util.Scanner;
public class areaPerimetroCuadrado {
    public static void main(String[] args) {
        //Instanciando la funcionalidad scanner a travez de un metodo:
        Scanner scanner = new Scanner(System.in);

        //ingresar el lado del cuadrado:
        System.out.println("Introduce la longitud del lado el cuadrado: ");
        double ladoDelCuadrado = scanner.nextDouble();

        //calcular area double :
        double areaDelCuadrado = ladoDelCuadrado * ladoDelCuadrado ;

        //Calcular el perimetro
        double perimetroDelCuadrado = 4 * ladoDelCuadrado ;

        //Mostrar los dos resultados ;
        System.out.println("El area del cuadrado es: " + areaDelCuadrado);
        System.out.println("El perimetro del cuadrado es: " + perimetroDelCuadrado);
    }
}
