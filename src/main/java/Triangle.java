public class Triangle {
  public static double triangleS(double a, double b, double c){
      double p = (a + b + c) / 2;
      return Math.sqrt(p * (p - a) * (p - b) * (p - c));
  }
}
