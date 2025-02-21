import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ClientPrivat extends cliente{

    private int edad;

    public ClientPrivat() {
    }

    public ClientPrivat(String nombre, String DNI, String correo, String telefono,String direccion, int edad) {
        super(nombre,DNI, correo, telefono, direccion);
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ClientPrivat that = (ClientPrivat) o;
        return edad == that.edad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), edad);
    }

    @Override
    public String toString() {
        return "ClientPrivat{" +
                ", nom='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", correo='" + correo + '\'' +
                ", num='" + telefono + '\'' +
                ", dirección='" + direccion + '\'' +
                ", tePrestamo=" + tePrestamo + '\'' +
                ", edad='" + edad  +
                '}';
    }

    public void CrearCliente(ClientPrivat clientPrivat, ArrayList<cliente> listaClientes) {
        System.out.print("Inserte nombre cliente: ");
        Scanner sc1 = new Scanner(System.in);
        clientPrivat.nombre = sc1.nextLine();
        System.out.print("Inserte DNI: ");
        clientPrivat.DNI = sc1.nextLine();
        System.out.print("Inserte Correo: ");
        clientPrivat.correo = sc1.nextLine();
        System.out.print("Inserte Numero: ");
        clientPrivat.telefono =sc1.nextLine();
        System.out.print("Inserte direccion: ");
        clientPrivat.direccion =sc1.nextLine();
        System.out.print("Inserte edad: ");
        clientPrivat.edad =sc1.nextInt();
        clientPrivat.tePrestamo = false;

        if (ComprobarDNI(listaClientes, clientPrivat.DNI)) {
            System.out.println("Ya existe un cliente con este DNI.");
        } else {
            listaClientes.add(clientPrivat);
            System.out.println("Cliente agregado correctamente.");
        }
    }

}

