import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonas {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        List<Persona> personas = new ArrayList<>();

        var salir = false;
        while (!salir) {
            mostrarMenu();
            try {
                salir = ejecutarOperacion(consola, personas);
            }
            catch (Exception e) {
                System.out.println("Error al escoger opción (" + e.getMessage() + ")");
            }
            System.out.println();
        }
    }

    private static void mostrarMenu() {
        System.out.print("""
                ---- Listado Personas ----
                1. Agregar persona
                2. Listar
                3. Salir
                
                --------------------------
                """);
        System.out.print("Introduzca la opción deseada: ");
    }

    private static boolean ejecutarOperacion(Scanner consola, List<Persona> personas) {
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;

        switch (opcion) {
            case 1 -> {
                System.out.print("Introduce el nombre de la persona: ");
                var nombre = consola.nextLine();
                System.out.print("Introduce el teléfono de la persona: ");
                var tlf = consola.nextLine();
                System.out.print("Introduce el email de la persona: ");
                var email = consola.nextLine();

                var persona = new Persona(nombre, tlf, email);
                personas.add(persona);
                System.out.println("La lista tiene: " + personas.size() + " personas.");
            }

            case 2 -> {
                System.out.println("---- Personas: ----");
                personas.forEach(System.out::println);
            }

            case 3 -> {
                salir = true;
                System.out.println("¡Hasta la próxima!");
            }

            default -> System.out.println("Opción errónea (" + opcion + ")");

        }
        return salir;
    }
}
