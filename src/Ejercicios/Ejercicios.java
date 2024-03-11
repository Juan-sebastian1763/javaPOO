package Ejercicios;

public class Ejercicios {

   // Clases para ejercicios:

   public double areaTriangulo(double d1, double d2) {
      return (d1 * d2) / 2;
   }

   public double sumaNumeros(double date1, double date2) {
      return (date1 + date2);
   }

   public double conversionEuroDolar(double date1, double date2) {
      double date4 = date1 * (date2);
      return date4;

   }

   public double numeroElevado(double date1) {
      double date3 = (double) Math.pow(date1, 2);
      return (double) date3;
   }

   public double calcularArea(double date1) {
      double date4 = date1 * date1;
      return date4;
   }

   public double calcularPerimetro(double date1) {
      double date5 = 4 * date1;
      return date5;
   }

   public double areaLateralCilindro(double date1) {
      double date3 = (2 * Math.PI * date1);
      return date3;
   }

   public double areaTotalCilindro(double date1, double date2) {
      double date4 = (2 * Math.PI * date1 * (date1 * date2));
      return date4;
   }

   public double volumenCilindro(double date1, double date2) {
      double date5 = (Math.PI * date1 * date1 * date2);
      return date5;
   }

   public double longitudCircunferencia(double date1) {
      // Longitud de la circunferencia
      double date2 = (2 * Math.PI * date1);
      return date2;
   }

   public double areaCircunferencia(double date1) {
      double date3 = Math.PI * Math.pow(date1, 2);
      return date3;
   }

   public double promedioNumeros(double date1, double date2, double date3) {
      double date5 = (date1 + date2 + date3) / 3;
      return date5;
   }
}