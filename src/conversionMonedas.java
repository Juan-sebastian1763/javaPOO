import java.util.Scanner ;
public class conversionMonedas {
    public static void main(String[] args) {
        //Llamar al metodo scanner para poder ser utilizado:
        //importar la herramienta scanner, creando un objeto:
        Scanner scanner = new Scanner(System.in);

        //introducir la cantidad de euros que desea convertir a dolares:
        System.out.println("Introducir la cantidad de euros: ");
        double euros = scanner.nextDouble();

        //Tasa de cambio del euro-dolar actalmente que seria un aproximado
        double tasaDeCambioMonedas = 1.08;

        double cambioDolares = ( euros * tasaDeCambioMonedas );

        //Calcular la cantidad de dolares equivalente:
        System.out.println("La cantidad aproximada en dolares de la conversion euro a dolar es: " + cambioDolares);
    }
}
