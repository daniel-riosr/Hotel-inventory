/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegisterCustomer {
    private static List<Customer> customer = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Mostrar clientes registrados");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de nextInt()

            switch (opcion) {
                case 1:
                    registrarCliente(scanner);
                    break;
                case 2:
                    mostrarClientes();
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione nuevamente.");
            }
        }
    }

    private static void registrarCliente(Scanner scanner) {
        System.out.println("Ingrese el nombre del cliente:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el apellido del cliente:");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese la identificación del cliente:");
        String identificacion = scanner.nextLine();
        System.out.println("Ingrese el teléfono del cliente:");
        String telefono = scanner.nextLine();
        System.out.println("Ingrese el correo electrónico del cliente:");
        String email = scanner.nextLine();

        Customer cliente = new Customer(nombre, apellido, identificacion, telefono, email);
        addCliente(cliente);

        System.out.println("Cliente registrado exitosamente.\n");
    }
    
     private static void addCliente(Customer cliente) {
        customer.add(cliente);
    }

    private static void mostrarClientes() {
        if (customer.isEmpty()) {
            System.out.println("No hay clientes registrados.\n");
        } else {
            System.out.println("Clientes registrados:\n");
            for (Customer customer : customer) {
                System.out.println(customer);
            }
        }
    }
}