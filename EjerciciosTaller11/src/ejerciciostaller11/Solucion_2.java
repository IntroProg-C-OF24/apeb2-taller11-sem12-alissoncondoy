package ejerciciostaller11;
import java.util.Scanner;
public class Solucion_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcNum;
        double lado, baseTri, alturaTri, baseRec, alturaRec;

        System.out.println("Escoga la opcion a calcular:");
        System.out.println("1. Area de un Cuadrado");
        System.out.println("2. Area de un Triangulo");
        System.out.println("3. Area de un Rectangulo");
        opcNum = scanner.nextInt();
        System.out.println("-------------------------------");

        switch (opcNum) {
            case 1 -> {
                System.out.println("Ingrese el lado del cuadrado:");
                lado = scanner.nextDouble();
                System.out.println("El area del cuadrado es: " + areaCuadrado(lado));
            }
            case 2 -> {
                System.out.println("Ingrese la base del triangulo:");
                baseTri = scanner.nextDouble();
                System.out.println("Ingrese la altura del triangulo:");
                alturaTri = scanner.nextDouble();
                System.out.println("El area del triangulo es: " + areaTriangulo(baseTri, alturaTri));
            }
            case 3 -> {
                System.out.println("Ingrese la base del rectangulo:");
                baseRec = scanner.nextDouble();
                System.out.println("Ingrese la altura del rectangulo:");
                alturaRec = scanner.nextDouble();
                System.out.println("El area del rectangulo es: " + areaRectangulo(baseRec, alturaRec));
            }
            default -> System.out.println("El rango de opciones es de 1 al 3. Ingrese nuevamente.");
        }
    }

    static double areaCuadrado(double lado) {
        double areaTotal;
        areaTotal = lado * lado;
        return areaTotal;
    }
    static double areaTriangulo(double baseTri, double alturaTri) {
        double areaTotal;
        areaTotal = (baseTri * alturaTri) / 2;
        return areaTotal;
    }
    static double areaRectangulo(double baseRec, double alturaRec) {
        double areaTotal;
        areaTotal = baseRec * alturaRec;
        return areaTotal;
    }
}

