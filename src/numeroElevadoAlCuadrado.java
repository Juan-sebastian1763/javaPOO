import java.util.Scanner ;
public class numeroElevadoAlCuadrado {
    public static void main(String[] args) {
        //Inicializar la funcioanlidad de scanner creando un objeto:
        Scanner scanner = new Scanner(System.in);

        //Introducir el numero para elevar al cuadrado:
        System.out.println("Ingresar el numero para elevar al cuadrado: ");
        int numeroInicial = scanner.nextInt();

        //Definir el numero al que se elevara el numero inigresado:
        int elevado = numeroInicial * numeroInicial ;

        //imprimir la solucion de el calculo:
        System.out.println("El resultado del numero que elegiste para elevar al cuadrado: (" + numeroInicial + ")" + " es: " + elevado);
    }
}
