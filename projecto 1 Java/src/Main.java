import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String red = "\033[0;31m";
        String green = "\033[0;32m";
        String yellow = "\033[0;33m";
        String reset = "\033[0m";

        ArrayList<cliente> listaClientes = new ArrayList<>();
        ArrayList<treballador> listaTreballador = new ArrayList<>();

        boolean salir = false;
        while (!salir){

            int opcion,opcion1,opcion2,opcion3;
            System.out.println(green + "\n--------MENÚ--------" +reset);
            System.out.println("1. Gestionar clientes");
            System.out.println("2. Gestionar productos");
            System.out.println("3. Gestionar trabajadores");
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
                                System.out.println("1. Dar de alta");
                                System.out.println("2. Modificar libros");
                                System.out.println("3. Eliminar libros");
                                System.out.println("4. Listar libros");
                                System.out.println("5. Buscar libros");
                                System.out.println(red + "0. volver" + reset);
                                System.out.print("Ingresa una opcion: ");
                                sc = new Scanner(System.in);
                                opcion3 = sc.nextInt();
                                switch (opcion3){
                                    case 1:
                                        System.out.println("Inserte nombre libro: ");
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("Estoy gestionando discos!");
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
                                System.out.println("Di de alta al trabajador!");
                                break;
                            case 2:
                                System.out.println("Modifiqué trabajador!");
                                break;
                            case 3:
                                System.out.println("Eliminar trabajador!");
                                break;
                            case 4:
                                System.out.println("Listar trabajadores!");
                                break;
                            case 5:
                                System.out.println("Buscar trabajador");
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