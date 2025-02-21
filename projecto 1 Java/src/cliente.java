import java.util.ArrayList;
import java.util.Scanner;

public class cliente extends Persona {

    protected Producte Producte;

    public cliente() {
        super();
    }

    public cliente(String nombre, String DNI,String correo, String telefono,String direccion) {
        super(nombre,correo,DNI,telefono,direccion);

    }

    public cliente(String DNI) {
        this.DNI = DNI;
    }

    public Producte getProducte() {
        return Producte;
    }

    public void setProducte(Producte producte) {
        Producte = producte;
    }


    public cliente insertarProducte(Producte producte) {
        this.Producte = producte;
        return this;
    }

    public String VerificaObjeto() {
        if(Producte != null){
            return "Producte=" + getProducte();
        }
        else {
            return "Sin producte";
        }
    }

    @Override
    public String toString() {
        return "cliente{" +
                "nom='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", correo='" + correo + '\'' +
                ", num='" + telefono + '\''+
                VerificaObjeto()
                 +
                '}';
    }

    public void CrearCliente(cliente cliente,ArrayList<cliente> clientes) {

    }

    public boolean ComprobarDNI(ArrayList<cliente> clientes, String dni) {
        for (cliente cliente : clientes) {
            if (cliente.DNI.equals(dni)) {
                return true;
            }
        }
        return false;
    }

    public cliente encontrarCliente(ArrayList<cliente> clientes, String dni) {
        for (cliente cliente : clientes) {
            if (cliente.DNI.equals(dni)) {
                return cliente;
            }
        }
        return null;
    }

    public void modificarCliente(ArrayList<cliente> listaClientes) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Inserte DNI del cliente a modificar: ");
            String dni = sc.nextLine();
            cliente clienteEncontrado = encontrarCliente(listaClientes, dni);
            if (clienteEncontrado == null) {
                System.out.println("No existe un cliente con este DNI.");
                return;
            }
                System.out.print("Inserte nombre cliente: ");
                String nom = sc.nextLine();
                System.out.print("Inserte Correo: ");
                String correo = sc.nextLine();
                System.out.print("Inserte Numero: ");
                String num =sc.nextLine();
                System.out.print("Inserte dirección: ");
                String direccion =sc.nextLine();
                if (clienteEncontrado instanceof ClientEscola) {
                    System.out.print("Inserte nombre de escuela: ");
                    String escola = sc.nextLine();
                    listaClientes.set(listaClientes.indexOf(clienteEncontrado), new ClientEscola(nom,dni,correo,num,direccion,escola));
                    System.out.println("Cliente modificado correctamente.");
                }
                else if (clienteEncontrado instanceof ClientPrivat) {
                    System.out.print("Inserte direccio: ");
                    int edad = sc.nextInt();
                    listaClientes.set(listaClientes.indexOf(clienteEncontrado), new ClientPrivat(nom,dni,correo,num,direccion,edad));
                    System.out.println("Cliente modificado correctamente.");
                }
    }

    public void eliminarCliente(ArrayList<cliente> listaClientes) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte DNI del cliente a eliminar: ");
        String dni = sc.nextLine();
        cliente clienteEncontrado = encontrarCliente(listaClientes, dni);
        if (clienteEncontrado == null) {
            System.out.println("No existe un cliente con este DNI.");
            return;
        }

        listaClientes.remove(clienteEncontrado);
        System.out.println("Cliente eliminado correctamente.");
    }

    public void buscarCliente(ArrayList<cliente> listaClientes, String dni) {
        for (cliente cliente : listaClientes) {
            if (cliente.DNI.equals(dni)) {
                System.out.println(cliente);

                return;
            }
            System.out.println("No existe un cliente con este DNI.");

        }
    }


}
