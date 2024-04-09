package Permisos_municipales;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Ciudadano> ciudadanos = new ArrayList<>();
    private static List<PermisoMunicipal> permisos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            try {
                System.out.println("\nSeleccione una opción:");
                System.out.println("1. Registrar ciudadano");
                System.out.println("2. Registrar permiso");
                System.out.println("3. Buscar permisos por tipo");
                System.out.println("4. Buscar permisos por fecha de emisión");
                System.out.println("5. Buscar permisos por fecha de vencimiento");
                System.out.println("6. Salir");

                int opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                switch (opcion) {
                    case 1:
                        registrarCiudadano(scanner);
                        break;
                    case 2:
                        registrarPermiso(scanner);
                        break;
                    case 3:
                        buscarPermisosPorTipo(scanner);
                        break;
                    case 4:
                        buscarPermisosPorFechaEmision(scanner);
                        break;
                    case 5:
                        buscarPermisosPorFechaVencimiento(scanner);
                        break;
                    case 6:
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opción inválida. Inténtelo de nuevo.");
                }
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error: " + e.getMessage());
                scanner.nextLine(); // Limpiar el buffer de entrada
            }
        }
        scanner.close();
    }

    // Método para registrar ciudadanos
    public static void registrarCiudadano(Scanner scanner) {
        System.out.println("Ingrese el ID del ciudadano:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.println("Ingrese el nombre del ciudadano:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la dirección del ciudadano:");
        String direccion = scanner.nextLine();

        System.out.println("Ingrese el teléfono del ciudadano:");
        String telefono = scanner.nextLine();

        ciudadanos.add(new Ciudadano(id, nombre, direccion, telefono));
        System.out.println("Ciudadano registrado correctamente.");
    }

    // Método para registrar permisos
    public static void registrarPermiso(Scanner scanner) {
        System.out.println("Seleccione el tipo de permiso:");
        System.out.println("1. Negocio");
        System.out.println("2. Construcción");
        System.out.println("3. Evento Especial");

        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.println("Ingrese el ID del permiso:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.println("Ingrese la fecha de emisión del permiso (formato dd/MM/yyyy):");
        String fechaEmisionStr = scanner.nextLine();
        Date fechaEmision = null;
        try {
            fechaEmision = new SimpleDateFormat("dd/MM/yyyy").parse(fechaEmisionStr);
        } catch (ParseException e) {
            System.out.println("Formato de fecha inválido.");
            return;
        }

        System.out.println("Ingrese la fecha de vencimiento del permiso (formato dd/MM/yyyy):");
        String fechaVencimientoStr = scanner.nextLine();
        Date fechaVencimiento = null;
        try {
            fechaVencimiento = new SimpleDateFormat("dd/MM/yyyy").parse(fechaVencimientoStr);
        } catch (ParseException e) {
            System.out.println("Formato de fecha inválido.");
            return;
        }

        double costoBase = 0;
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el tipo de negocio:");
                String tipoNegocio = scanner.nextLine();

                System.out.println("Ingrese el tamaño del local:");
                double tamanoLocal = scanner.nextDouble();

                System.out.println("Ingrese la cantidad de empleados:");
                int cantidadEmpleados = scanner.nextInt();

                permisos.add(new NegocioPermiso(id, "Negocio", fechaEmision, fechaVencimiento, costoBase,
                        tipoNegocio, tamanoLocal, cantidadEmpleados));
                break;
            case 2:
                System.out.println("Ingrese el tipo de construcción:");
                String tipoConstruccion = scanner.nextLine();

                System.out.println("Ingrese los metros cuadrados a construir:");
                double metrosCuadrados = scanner.nextDouble();

                permisos.add(new ConstruccionPermiso(id, "Construcción", fechaEmision, fechaVencimiento,
                        costoBase, tipoConstruccion, metrosCuadrados));
                break;
            case 3:
                System.out.println("Ingrese el tipo de evento especial:");
                String tipoEvento = scanner.nextLine();

                System.out.println("Ingrese la cantidad esperada de asistentes:");
                int cantidadAsistentes = scanner.nextInt();

                System.out.println("Ingrese las medidas de seguridad:");
                String medidasSeguridad = scanner.nextLine();

                permisos.add(new EventoEspecialPermiso(id, "Evento Especial", fechaEmision, fechaVencimiento,
                        costoBase, tipoEvento, cantidadAsistentes, medidasSeguridad));
                break;
            default:
                System.out.println("Opción inválida.");
        }
        System.out.println("Permiso registrado correctamente.");
    }

    // Método para buscar permisos por tipo
    public static void buscarPermisosPorTipo(Scanner scanner) {
        System.out.println("Ingrese el tipo de permiso a buscar:");
        String tipo = scanner.nextLine();

        for (PermisoMunicipal permiso : permisos) {
            if (permiso.getTipo().equalsIgnoreCase(tipo)) {
                System.out.println(permiso.getTipo());
            }
        }
    }

    // Método para buscar permisos por fecha de emisión
    public static void buscarPermisosPorFechaEmision(Scanner scanner) {
        System.out.println("Ingrese la fecha de emisión a buscar (formato dd/MM/yyyy):");
        String fechaEmisionStr = scanner.nextLine();
        Date fechaEmision = null;
        try {
            fechaEmision = new SimpleDateFormat("dd/MM/yyyy").parse(fechaEmisionStr);
        } catch (ParseException e) {
            System.out.println("Formato de fecha inválido.");
            return;
        }

        for (PermisoMunicipal permiso : permisos) {
            if (permiso.getFechaEmision().equals(fechaEmision)) {
                System.out.println(permiso.getTipo() + " - Fecha de emisión: " + fechaEmision);
            }
        }
    }

    // Método para buscar permisos por fecha de vencimiento
    public static void buscarPermisosPorFechaVencimiento(Scanner scanner) {
        System.out.println("Ingrese la fecha de vencimiento a buscar (formato dd/MM/yyyy):");
        String fechaVencimientoStr = scanner.nextLine();
        Date fechaVencimiento = null;
        try {
            fechaVencimiento = new SimpleDateFormat("dd/MM/yyyy").parse(fechaVencimientoStr);
        } catch (ParseException e) {
            System.out.println("Formato de fecha inválido.");
            return;
        }

        for (PermisoMunicipal permiso : permisos) {
            if (permiso.getFechaVencimiento().equals(fechaVencimiento)) {
                System.out.println(permiso.getTipo() + " - Fecha de vencimiento: " + fechaVencimiento);
            }
        }
    }
}
