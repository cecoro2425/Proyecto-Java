import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String red = "\033[0;31m";
        String green = "\033[0;32m";
        String yellow = "\033[0;33m";
        String reset = "\033[0m";

        ArrayList<cliente> listaClientes = new ArrayList<>();
        ArrayList<treballador> listaTreballador = new ArrayList<>();
        ArrayList<llibre> listaLibros = new ArrayList<>();
        ArrayList<discoVinil> listaDiscos = new ArrayList<>();
        ArrayList<Date> listaFecha = new ArrayList<>();
        ArrayList<Reserva> reservas = new ArrayList<>();

        boolean salir = false;
        while (!salir){

            int opcion,opcion1,opcion2,opcion3;
            System.out.println(green + "\n--------MENÚ--------" +reset);
            System.out.println("1. Gestionar clientes");
            System.out.println("2. Gestionar productos");
            System.out.println("3. Gestionar trabajadores");
            System.out.println("4. Mostrar registro de fechas de pedidos");
            System.out.println("5. Crear reservas");
            System.out.println("6. Borrar reservas");
            System.out.println("7. Mostrar reservas");
            System.out.println(red + "0. Salir" + reset);
            System.out.print("Ingresa una opcion: ");
            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    boolean volver1 = false;
                    while(!volver1){
                        System.out.println(green + "\n--------GESTIÓN CLIENTES--------" +reset);
                        System.out.println("1. Dar de alta");
                        System.out.println("2. Modificar cliente");
                        System.out.println("3. Eliminar cliente");
                        System.out.println("4. Listar cliente");
                        System.out.println("5. Buscar cliente");
                        System.out.println(red + "0. volver" + reset);
                        System.out.print("Ingresa una opcion: ");
                        sc = new Scanner(System.in);
                        opcion1 = sc.nextInt();
                        switch (opcion1){
                            case 1:
                                System.out.println("----Seleccione tipo de cliente----");
                                System.out.println("1. Cliente Escola");
                                System.out.println("2. Cliente Privat");
                                System.out.print("Seleccione una opcion: ");
                                sc = new Scanner(System.in);
                                opcion2 = sc.nextInt();
                                if (opcion2 == 1){
                                    ClientEscola clientEscola = new ClientEscola();
                                    clientEscola.CrearCliente(clientEscola,listaClientes);
                                }
                                else if (opcion2 == 2){
                                    ClientPrivat clientPrivat = new ClientPrivat();
                                    clientPrivat.CrearCliente(clientPrivat,listaClientes);
                                }
                                else{System.out.println("opcion no valida");}

                                break;
                            case 2:
                                    new ClientEscola().modificarCliente(listaClientes);
                                break;
                            case 3:
                                new ClientEscola().eliminarCliente(listaClientes);
                                break;
                            case 4:
                                for(cliente cliente: listaClientes){
                                    System.out.println(cliente.toString());
                                }
                                break;
                            case 5:
                                System.out.print("Inserte el DNI del cliente: ");
                                sc = new Scanner(System.in);
                                String dni = sc.nextLine();
                                new ClientEscola().buscarCliente(listaClientes, dni);
                                break;
                            case 0:
                                System.out.println("Volviendo al menú...");
                                volver1 = true;
                                break;
                            default:
                                System.out.println(red + "Opcion no valida" +reset);
                                break;
                        }
                    }
                break;

                case 2:
                    boolean volver2 = false;
                    while (!volver2){
                        System.out.println(green + "\n--------GESTIÓN PRODUCTOS--------" +reset);
                        System.out.println("1. Gestionar libros");
                        System.out.println("2. Gestionar discos");
                        System.out.println(red + "0. volver al menú" + reset);
                        System.out.print("Selecciona una opcion: ");
                        sc = new Scanner(System.in);
                        opcion2 = sc.nextInt();
                        switch (opcion2){
                            case 1:
                                System.out.println(green + "\n--------GESTIÓN LIBROS--------" +reset);
                                System.out.println("1. Insertar libro");
                                System.out.println("2. Modificar libros");
                                System.out.println("3. Eliminar libros");
                                System.out.println("4. Listar libros");
                                System.out.println("5. Buscar libros");
                                System.out.println("6. Solicitar libro");
                                System.out.println("7. Devolver libro");
                                System.out.println(red + "0. volver" + reset);
                                System.out.print("Ingresa una opcion: ");
                                sc = new Scanner(System.in);
                                opcion3 = sc.nextInt();
                                switch (opcion3){
                                    case 1:
                                        System.out.println("----Seleccione tipo de libro----");
                                        System.out.println("1. Libro de papel");
                                        System.out.println("2. Audio libro");
                                        System.out.print("Seleccione una opcion: ");
                                        sc = new Scanner(System.in);
                                        opcion2 = sc.nextInt();
                                        if (opcion2 == 1){
                                            System.out.println("Inserta los datos del libro de papel:");

                                            System.out.print("Nombre del libro: ");
                                            sc.nextLine();
                                            String nom = sc.nextLine();

                                            System.out.print("Autor: ");
                                            String autor = sc.nextLine();

                                            System.out.print("Código: ");
                                            int codi = sc.nextInt();

                                            System.out.print("¿Está disponible? (true/false): ");
                                            boolean disponible = sc.nextBoolean();

                                            System.out.print("Descripción: ");
                                            sc.nextLine();
                                            String descripcio = sc.nextLine();

                                            System.out.print("Número de páginas: ");
                                            int numPag = sc.nextInt();

                                            System.out.print("Edición: ");
                                            sc.nextLine();
                                            String edicio = sc.nextLine();

                                            llibrePapel libroPapel = new llibrePapel(nom, autor, codi, disponible, descripcio, numPag, edicio);

                                            listaLibros.add(libroPapel);
                                            System.out.println("Libro de papel añadido correctamente.");
                                            break;

                                        }else if (opcion2 == 2) {
                                            System.out.println("Inserta los datos del audio libro:");
                                            System.out.print("Nombre del libro: ");
                                            sc.nextLine();
                                            String nom = sc.nextLine();

                                            System.out.print("Autor: ");
                                            String autor = sc.nextLine();

                                            System.out.print("Código: ");
                                            int codi = sc.nextInt();

                                            System.out.print("¿Está disponible? (true/false): ");
                                            boolean disponible = sc.nextBoolean();

                                            System.out.print("Descripción: ");
                                            sc.nextLine();
                                            String descripcio = sc.nextLine();

                                            System.out.print("Duración: ");
                                            String durada = sc.nextLine();

                                            audiollibre audioLibro = new audiollibre(nom, autor, codi, disponible, descripcio, durada);
                                            listaLibros.add(audioLibro);
                                            System.out.println("Audio libro añadido correctamente.");
                                            break;
                                        }
                                    case 2:
                                        sc.nextLine();
                                        System.out.print("Inserta el código del libro a modificar: ");
                                        int codigoModificar = sc.nextInt();
                                        sc.nextLine();

                                        boolean modificado = false;
                                        for (int i = 0; i < listaLibros.size(); i++) {
                                            llibre libro = listaLibros.get(i);
                                            if (libro.codi == codigoModificar) {
                                                System.out.println("Libro encontrado. Introduce nuevos datos:");

                                                System.out.print("Nuevo nombre: ");
                                                String nuevoNom = sc.nextLine();
                                                System.out.print("Nuevo autor: ");
                                                String nuevoAutor = sc.nextLine();
                                                System.out.print("¿Está disponible? (true/false): ");
                                                boolean nuevoDisponible = sc.nextBoolean();
                                                sc.nextLine();
                                                System.out.print("Nueva descripción: ");
                                                String nuevoDescripcio = sc.nextLine();


                                                if (libro instanceof llibrePapel) {
                                                    System.out.print("Nuevo número de páginas: ");
                                                    int nuevoNumPag = sc.nextInt();
                                                    sc.nextLine();
                                                    System.out.print("Nueva edición: ");
                                                    String nuevoEdicio = sc.nextLine();
                                                    llibrePapel libroModificado = new llibrePapel(nuevoNom, nuevoAutor, codigoModificar, nuevoDisponible, nuevoDescripcio, nuevoNumPag, nuevoEdicio);
                                                    listaLibros.set(i, libroModificado);
                                                } else if (libro instanceof audiollibre) {
                                                    System.out.print("Nueva duración: ");
                                                    String nuevaDurada = sc.nextLine();
                                                    audiollibre libroModificado = new audiollibre(nuevoNom, nuevoAutor, codigoModificar, nuevoDisponible, nuevoDescripcio, nuevaDurada);
                                                    listaLibros.set(i, libroModificado);
                                                }
                                                System.out.println("Libro modificado correctamente.");
                                                modificado = true;
                                                break;
                                            }
                                        }
                                        if (!modificado) {
                                            System.out.println("No se encontró ningún libro con ese código.");
                                        }
                                        break;
                                    case 3:
                                        sc.nextLine();
                                        System.out.print("Inserta el código del libro a eliminar: ");
                                        int codigoEliminar = sc.nextInt();
                                        sc.nextLine();
                                        boolean eliminado = false;
                                        for (int i = 0; i < listaLibros.size(); i++) {
                                            if (listaLibros.get(i).codi == codigoEliminar) {
                                                listaLibros.remove(i);
                                                System.out.println("Libro eliminado correctamente.");
                                                eliminado = true;
                                                break;
                                            }
                                        }
                                        if (!eliminado) {
                                            System.out.println("No se encontró ningún libro con ese código.");
                                        }
                                        break;
                                    case 4:
                                        System.out.println(green + "\n--------LISTADO DE LIBROS--------" + reset);
                                        if (listaLibros.isEmpty()) {
                                            System.out.println("No hay libros almacenados.");
                                        } else {
                                            for (llibre libro : listaLibros) {
                                                System.out.println("Procesando un libro...");
                                                if (libro instanceof llibrePapel) {
                                                    System.out.println("Libro de Papel: " + libro.toString());
                                                } else if (libro instanceof audiollibre) {
                                                    System.out.println("Audio Libro: " + libro.toString());
                                                } else {
                                                    System.out.println("Libro: " + libro.toString());
                                                }
                                            }
                                        }
                                        break;
                                    case 5:
                                        sc.nextLine();
                                        System.out.print("Inserta el código del libro a buscar: ");
                                        int codigoBuscar = sc.nextInt();
                                        sc.nextLine();
                                        boolean encontrado = false;
                                        for (llibre libro : listaLibros) {
                                            if (libro.codi == codigoBuscar) {
                                                System.out.println("Libro encontrado: " + libro.toString());
                                                encontrado = true;
                                                break;
                                            }
                                        }
                                        if (!encontrado) {
                                            System.out.println("No se encontró ningún libro con ese código.");
                                        }
                                        break;
                                    case 6:

                                        System.out.print("Inserte código del disco: ");
                                        int codi = sc.nextInt();
                                        sc.nextLine();

                                        llibre llibreEncontrado = new llibre().encontrarLibro(listaLibros, codi);
                                        if (llibreEncontrado == null) {
                                            System.out.println("Error: Disco no encontrado.");
                                            return;
                                        }
                                        if (!llibreEncontrado.disponible) {
                                            System.out.println("Disco no disponible.");
                                            return;
                                        }

                                        System.out.print("Inserte DNI del cliente: ");
                                        String dni = sc.nextLine();

                                        cliente clienteEncontrado = new cliente().encontrarCliente(listaClientes, dni);
                                        if (clienteEncontrado == null) {
                                            System.out.println("Error: Cliente no encontrado.");
                                            return;
                                        }

                                        if (clienteEncontrado instanceof ClientEscola) {
                                            System.out.println("Error: Cliente no válido.");
                                            return;
                                        }

                                        if (clienteEncontrado.getProducte() != null) {
                                            System.out.println("Error: El cliente no ha devuelto el producto.");
                                            return;
                                        }

                                        llibreEncontrado.disponible = false;

                                        int indexCliente = listaClientes.indexOf(clienteEncontrado);
                                        if (indexCliente != -1) {
                                            listaClientes.get(indexCliente).setProducte(llibreEncontrado);
                                            System.out.println("libro solicitado correctamente.");

                                        }
                                        break;
                                    case 7:
                                        System.out.print("Inserte codi del disco: ");
                                        int codigo = sc.nextInt();
                                        sc.nextLine();

                                        llibre libroEncontrado = new llibre().encontrarLibro(listaLibros, codigo);
                                        if (libroEncontrado == null) {
                                            System.out.println("Error: libro no encontrado.");
                                            return;
                                        }

                                        if (!libroEncontrado.disponible) {
                                            System.out.print("Inserte DNI del cliente: ");
                                            String dni1 = sc.nextLine();

                                            cliente clienteEncontrado1 = new cliente().encontrarCliente(listaClientes, dni1);
                                            if (clienteEncontrado1 == null) {
                                                System.out.println("Error: Cliente no encontrado.");
                                                return;
                                            }

                                            if (clienteEncontrado1 instanceof ClientEscola) {
                                                System.out.println("Error: Cliente no válido.");
                                                return;
                                            }

                                            if (clienteEncontrado1.getProducte() == null) {
                                                System.out.println("Error: El cliente no tiene producto.");
                                                return;
                                            }

                                            libroEncontrado.disponible = true;

                                            int indexCliente1 = listaClientes.indexOf(clienteEncontrado1);
                                            if (indexCliente1 != -1) {
                                                listaClientes.get(indexCliente1).setProducte(null);
                                                System.out.println("Disco devuelto correctamente.");

                                            }
                                        }
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println(green + "\n--------GESTIÓN DISCOS--------" +reset);
                                System.out.println("1. Insertar disco");
                                System.out.println("2. Modificar disco");
                                System.out.println("3. Eliminar disco");
                                System.out.println("4. Listar discos");
                                System.out.println("5. Buscar disco");
                                System.out.println("6. Solicitar disco");
                                System.out.println("7. Devolver disco");
                                System.out.println(red + "0. volver" + reset);
                                System.out.print("Ingresa una opcion: ");
                                sc = new Scanner(System.in);
                                opcion3 = sc.nextInt();
                                switch (opcion3){
                                    case 1:
                                        discoVinil discoVinil = new discoVinil();
                                        discoVinil.CrearDisco(discoVinil,listaDiscos);
                                        break;
                                    case 2:
                                        new discoVinil().modificarDisco(listaDiscos);
                                        break;
                                    case 3:
                                        new discoVinil().eliminarDisco(listaDiscos);
                                        break;
                                    case 4:
                                        for(discoVinil discoVinil1: listaDiscos){
                                            System.out.println(discoVinil1.toString());
                                        }
                                        break;
                                    case 5:
                                        System.out.print("Inserte el codi del disco: ");
                                        sc = new Scanner(System.in);
                                        int codi = sc.nextInt();
                                        new discoVinil().buscarDisco(listaDiscos, codi);
                                        break;
                                    case 6:
                                        new discoVinil().solicitarDisco(listaDiscos,listaClientes);
                                        Date date = new Date();
                                        listaFecha.add(date);
                                        break;
                                    case 7:
                                        new discoVinil().devolverDisco(listaDiscos,listaClientes);

                                }
                                break;
                            case 0:
                                System.out.println("Volviendo al menú...");
                                volver2 = true;
                                break;
                            default:
                                System.out.println(red + "Opcion no valida" +reset);
                                break;
                        }
                    }
                break;

                case 3:
                    boolean volver3 = false;
                    while(!volver3){
                        System.out.println(green + "\n--------GESTIÓN TRABAJADORES--------" +reset);
                        System.out.println("1. Dar de alta");
                        System.out.println("2. Modificar trabajador");
                        System.out.println("3. Eliminar trabajador");
                        System.out.println("4. Listar trabajador");
                        System.out.println("5. Buscar trabajador");
                        System.out.println(red + "0. volver" + reset);
                        System.out.print("Ingresa una opcion: ");
                        sc = new Scanner(System.in);
                        opcion1 = sc.nextInt();
                        switch (opcion1){
                            case 1:
                                treballador treballador = new treballador();
                                treballador.CrearTreballador(treballador,listaTreballador);
                                break;
                            case 2:
                                new treballador().modificarTreballador(listaTreballador);
                                break;
                            case 3:
                                new treballador().eliminarTreballador(listaTreballador);
                                break;
                            case 4:
                                for(treballador treballador1: listaTreballador){
                                    System.out.println(treballador1.toString());
                                }
                                break;
                            case 5:
                                System.out.print("Inserte el codi del trabajador: ");
                                sc = new Scanner(System.in);
                                int codi = sc.nextInt();
                                new treballador().buscarTreballador(listaTreballador, codi);
                                break;
                            case 0:
                                System.out.println("Volviendo al menú...");
                                volver3 = true;
                                break;
                            default:
                                System.out.println(red + "Opcion no valida" +reset);
                                break;
                        }
                    }

                break;
                case 4:
                    System.out.println("\n------- REGISTRO DE FECHAS POR SOLICITUD --------");
                    for(Date fecha : listaFecha){
                        System.out.println(fecha.toString());
                    }
                    break;
                case 5:
                    System.out.print("Inserte tipo [1. Libro | 2. disco]: ");
                    sc = new Scanner(System.in);
                    int tipo = sc.nextInt();
                    if(tipo == 1){
                        new Reserva().crearReservaLibro(reservas,listaLibros,listaClientes);
                    }
                    else if (tipo == 2){
                        new Reserva().crearReservaDisco(reservas,listaDiscos,listaClientes);
                     }

                    break;
                case 6:
                    System.out.print("Inserte el dni del cliente para eliminar su reserva: ");
                    sc = new Scanner(System.in);
                    String dni = sc.nextLine();
                    new Reserva().eliminarReserva(reservas,listaClientes,dni);
                    break;
                case 7:
                    System.out.print("Inserte tipo [1. Libro | 2. disco]: ");
                    sc = new Scanner(System.in);
                    int tipo1 = sc.nextInt();
                    if(tipo1 == 1){
                        for(llibre llibre: listaLibros){
                            System.out.println(llibre.toString());
                        }

                    }
                    if(tipo1 == 2){
                        for(discoVinil disco: listaDiscos){
                            System.out.println(disco.toString());
                        }
                    }
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    salir = true;
                break;
                default:
                    System.out.println(red + "Opcion no valida" +reset);
                break;
            }
        }

    }
}