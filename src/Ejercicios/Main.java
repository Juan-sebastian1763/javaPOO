package Ejercicios;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      double date1, date2, date3, date4, date5;

      // Instanciar a la clase Ejercicios:
      Ejercicios ejercicios = new Ejercicios();

      // *Calcular el area de un triangulo:
      System.out.println("Ingrese la base del triangulo: ");
      date1 = scanner.nextDouble();

      System.out.println("Ingrese la altura del triangulo: ");
      date2 = scanner.nextDouble();
      date3 = ejercicios.areaTriangulo(date1, date2);
      System.out.println("El area del triangulo: " + date3);

      ////////////////////////////////////////////////////////////////////////////////////////////////////

      // *Sumar dos numeros ingresados
      System.out.println("Ingrese un numero: ");
      date1 = scanner.nextDouble();

      System.out.println("Ingrese un segundo numero:");
      date2 = scanner.nextDouble();
      date3 = ejercicios.sumaNumeros(date1, date2);
      System.out.println("El resultado de los dos numeros sumados es: " + date3);

      ////////////////////////////////////////////////////////////////////////////////////////////////////

      // *Ingresar un numero y mostrarlo elevado al cuadrado:
      System.out.println("Ingresa el numero que quieres elevar al cuadrado");
      date1 = scanner.nextDouble();
      date2 = 2;
      date3 = ejercicios.numeroElevado(date1);
      System.out.println("El resultado del numero elevado al cuadrado es:" + date3);

      ////////////////////////////////////////////////////////////////////////////////////////////////////

      // *Conversion de euro a dolar
      System.out.println("Ingrese el valor de euros que quiere cambiar: ");
      date1 = scanner.nextDouble();
      date2 = 1.08;
      date3 = ejercicios.conversionEuroDolar(date1, date2);
      System.out.println("El valor de euros en dolares es: " + date3);

      ////////////////////////////////////////////////////////////////////////////////////////////////////

      // * Algoritmo que muestre el area y el perimetro de un cuadrado dado un lado
      // del mismo:

      System.out.println("Ingresa el valor de uno de los lados del cuadrado: ");
      date1 = scanner.nextDouble();
      date2 = ejercicios.calcularArea(date1);
      date3 = ejercicios.calcularPerimetro(date1);
      System.out.println("El area del cuadrado es: " + date2 + ", El perimetro del cuadrado es: " + date3);

      ////////////////////////////////////////////////////////////////////////////////////////////////////

      // Area y volumen de un cilindro:
      // Radio
      System.out.println("Ingrese el radio del cilindro a calcular");
      date1 = scanner.nextDouble();

      // Altura
      System.out.println("Introduce la altura del ciliindro a calcular");
      date2 = scanner.nextDouble();
      double areaLateral = ejercicios.areaLateralCilindro(date1);
      double areaTotal = ejercicios.areaTotalCilindro(date1, date2);
      double volumenCilindro = ejercicios.volumenCilindro(date1, date2);

      System.out.println("El area lateral del cilindro es " + areaLateral + ", El area total del cilindro es: "
            + areaTotal + ", El volumen del cilindro es: " + volumenCilindro);

      ////////////////////////////////////////////////////////////////////////////////////////////////////

      // Realizar un algoritmo que lea el radio de una circunferencia y escriba la
      // longitud de la misma del área (pi*r)^2 del círculo inscrito.

      System.out.println("ingrese el radio de la circunferencia ");
      date1 = scanner.nextDouble();
      date4 = ejercicios.longitudCircunferencia(date1);
      date5 = ejercicios.areaCircunferencia(date1); 
      System.out.println("La longitud de la circunferencia dada es: " + date4);
      System.out.println("El area de la circunferencia dada es: " + date5);

      ////////////////////////////////////////////////////////////////////////////////////////////////

      //Promedio tres numeros ingresados por teclado: 

      System.out.println("Ingresa el primer numero");
      date1 = scanner.nextDouble();
      System.out.println("Ingresa el segundo numero");
      date2 = scanner.nextDouble();
      System.out.println("Ingresa el tercer numero");
      date3 = scanner.nextDouble();
      //Instanciar la clase promedioNumeros y asiganarle sus valores por parametros:
      date4 = ejercicios.promedioNumeros(date1, date2, date3);

      //Imprimir el resultado de la operacion: 
      System.out.println("El promedio de los 3 numeros dados es: " + date4);
   }
}
