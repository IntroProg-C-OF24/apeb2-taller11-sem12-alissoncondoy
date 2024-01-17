package ejerciciostaller11;
import java.util.Scanner;
public class Solucion_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombCli, cedula;
        double valorKW, numKV, valorInmueb;

        System.out.print("Ingrese el nombre del usuario: ");
        nombCli = scanner.nextLine();
        System.out.print("Ingrese la cedula del cliente: ");
        cedula = scanner.nextLine();

        System.out.println("Ingrese la opcion que desea saber:");
        System.out.println("1. Planilla de luz");
        System.out.println("2. Predio de un bien inmueble");
        int opc = scanner.nextInt();
        System.out.println("-----------------------------------");

        switch (opc) {
            case 1 -> {
                System.out.print("Ingresar el valor del Kilovatio: ");
                valorKW = scanner.nextDouble();
                System.out.print("Ingrese el numero de Kilovatios gastados al mes: ");
                numKV = scanner.nextDouble();
                System.out.println("Reporte");
                System.out.println("Cliente " + nombCli + " con cedula " + cedula +
                        " debe pagar el valor de $" + planillaLuz(valorKW, numKV));
            }
            case 2 -> {
                System.out.print("Ingresar el valor del Inmueble: ");
                valorInmueb = scanner.nextDouble();
                System.out.println("Reporte");
                System.out.println("Cliente " + nombCli + " con cedula " + cedula + " tiene un inmueble valorado en $" + valorInmueb + " y tiene que pagar de predio $" + calcPredio(valorInmueb));
            }
            default -> System.out.println("Opción no válida. Ingrese nuevamente.");
        }
    }

    static double planillaLuz(double valorKW, double numKV) {
        double valorPlanilla;
        valorPlanilla = valorKW * numKV;
        return valorPlanilla;
    }

    static double calcPredio(double valorInmueb) {
        double predio;
        predio = valorInmueb * 0.02;
        return predio;
    }
}
   