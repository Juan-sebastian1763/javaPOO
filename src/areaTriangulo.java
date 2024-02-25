import java.util.Scanner ;

public class areaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite la base del triangulo");
        double baseTriangulo = scanner.nextDouble();

        System.out.println("Ingrese la altura del triangulo");
        double alturaTriangulo = scanner.nextDouble();

        double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;

        System.out.println("El area del tiangulo es:" + areaTriangulo );
    }


    }



