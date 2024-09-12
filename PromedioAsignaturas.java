import java.util.Scanner;

public class PromedioAsignaturas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear dos arreglos unidimensionales
        String[] asignaturas = new String[5];
        double[] promedios = new double[5];

        // Llenar los arreglos con la entrada del usuario
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.print("Ingrese el nombre de la asignatura " + (i + 1) + ": ");
            asignaturas[i] = scanner.nextLine();

            System.out.print("Ingrese el promedio para " + asignaturas[i] + ": ");
            promedios[i] = scanner.nextDouble();
            scanner.nextLine();  // Limpiar el buffer de entrada
        }

        // Calcular el promedio final
        double suma = 0;
        System.out.println("\nSus notas son las siguientes:");
        for (int i = 0; i < promedios.length; i++) {
            System.out.println(asignaturas[i] + ": " + promedios[i]);
            suma += promedios[i];
        }

        double promedioFinal = suma / promedios.length;
        System.out.println("\nSu Promedio General es: " + promedioFinal);
        
        scanner.close();
    }
}
