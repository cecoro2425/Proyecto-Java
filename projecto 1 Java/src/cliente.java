import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public abstract class cliente {
    protected String nom;
    protected String DNI;
    protected String correo;
    protected String num;
    protected Boolean tePrestamo;

    public cliente() {
    }

    public cliente(String nom, String correo, String DNI, String num, Boolean tePrestamo) {
        this.nom = nom;
        this.correo = correo;
        this.DNI = DNI;
        this.num = num;
        this.tePrestamo = false;
    }



    public cliente(String DNI) {
        this.DNI = DNI;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Boolean getTePrestamo() {
        return tePrestamo;
    }

    public void setTePrestamo(Boolean tePrestamo) {
        this.tePrestamo = tePrestamo;
    }

    @Override
    public String toString() {
        return "cliente{" +
                "nom='" + nom + '\'' +
                ", DNI='" + DNI + '\'' +
                ", correo='" + correo + '\'' +
                ", num='" + num + '\'' +
                ", tePrestamo=" + tePrestamo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        cliente cliente = (cliente) o;
        return Objects.equals(nom, cliente.nom) && Objects.equals(DNI, cliente.DNI) && Objects.equals(correo, cliente.correo) && Objects.equals(num, cliente.num) && Objects.equals(tePrestamo, cliente.tePrestamo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, DNI, correo, num, tePrestamo);
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
                boolean prestamo = clienteEncontrado.tePrestamo;
                if (clienteEncontrado instanceof ClientEscola) {
                    System.out.print("Inserte nombre de escuela: ");
                    String escola = sc.nextLine();
                    listaClientes.set(listaClientes.indexOf(clienteEncontrado), new ClientEscola(nom,correo,dni,num,prestamo,escola));
                    System.out.println("Cliente modificado correctamente.");
                }
                else if (clienteEncontrado instanceof ClientPrivat) {
                    System.out.print("Inserte direccio: ");
                    String direccio = sc.nextLine();
                    listaClientes.set(listaClientes.indexOf(clienteEncontrado), new ClientPrivat(nom,correo,dni,num,prestamo,direccio));
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
