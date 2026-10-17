import java.util.Scanner;
public class PruebaFrecuenciasCardiacas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese su primer nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido = entrada.nextLine();
        System.out.print("Ingrese el mes de nacimiento (1-12): ");
        int mes = entrada.nextInt();
        System.out.print("Ingrese el día de nacimiento (1-31): ");
        int dia = entrada.nextInt();
        System.out.print("Ingrese el año de nacimiento (ej. 20XX): ");
        int año = entrada.nextInt();
        FrecuenciasCardiacas persona =
                new FrecuenciasCardiacas(nombre, apellido, mes, dia, año);
        System.out.println("\nInformación de la persona");
        System.out.println("Nombre: " + persona.getPrimerNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Fecha de nacimiento: " + persona.getDiaNacimiento() + "/"
                + persona.getMesNacimiento() + "/" + persona.getAñoNacimiento());
        System.out.println("\nResultados");
        System.out.println("Edad: " + persona.obtenerEdad() + " años");
        System.out.println("Frecuencia cardiaca máxima: "
                + persona.obtenerFrecuenciaMaxima() + " latidos por minuto");
        System.out.printf("Rango de frecuencia cardiaca esperada: %.1f - %.1f latidos por minuto%n",
                persona.obtenerFrecuenciaEsperadaMinima(),
                persona.obtenerFrecuenciaEsperadaMaxima());
        entrada.close();
    }
}