package ejerciciostaller11;
import java.util.Scanner;
public class Solucion_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double param1, param2, param3, param4;
        System.out.print("Ingrese la nota del parametro 1: ");
        param1 = scanner.nextDouble();
        System.out.print("Ingrese la nota del parametro 2: ");
        param2 = scanner.nextDouble();
        System.out.print("Ingrese la nota del parametro 3: ");
        param3 = scanner.nextDouble();
        System.out.print("Ingrese la nota del parametro 4: ");
        param4 = scanner.nextDouble();
        System.out.println("El promedio cualitativo es: " + califiCuali(param1, param2, param3, param4));
    }

    static String califiCuali(double param1, double param2, double param3, double param4) {
        double prom = (param1 + param2 + param3 + param4) / 4;
        String cualit;

        if (prom <= 5) {
            cualit = "Regular";
        } else if (prom <= 8) {
            cualit = "Bueno";
        } else if (prom <= 9) {
            cualit = "Muy bueno";
        } else {
            cualit = "Sobresaliente";
        }
        return cualit;
    }
}
    
