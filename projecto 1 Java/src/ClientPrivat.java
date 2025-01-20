import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ClientPrivat extends cliente{

    private String direccio;


    public ClientPrivat() {
    }

    public ClientPrivat(String nom, String correo, String DNI, String num, Boolean tePrestamo, String direccio) {
        super(nom, correo, DNI, num, tePrestamo);
        this.direccio = direccio;
    }

    public String getDireccio() {
        return direccio;
    }

    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }

    @Override
    public String toString() {
        return "ClientPrivat{" +
                ", nom='" + nom + '\'' +
                ", DNI='" + DNI + '\'' +
                ", correo='" + correo + '\'' +
                ", num='" + num + '\'' +
                ", tePrestamo=" + tePrestamo + '\'' +
                ", direccio='" + direccio  +
                '}';
    }

    public void CrearCliente(ClientPrivat clientPrivat, ArrayList<cliente> listaClientes) {
        System.out.print("Inserte nombre cliente: ");
        Scanner sc1 = new Scanner(System.in);
        clientPrivat.nom = sc1.nextLine();
        System.out.print("Inserte DNI: ");
        clientPrivat.DNI = sc1.nextLine();
        System.out.print("Inserte Correo: ");
        clientPrivat.correo = sc1.nextLine();
        System.out.print("Inserte Numero: ");
        clientPrivat.num =sc1.nextLine();
        System.out.print("Inserte direccion: ");
        clientPrivat.setDireccio(sc1.nextLine());
        clientPrivat.tePrestamo = false;

        if (ComprobarDNI(listaClientes, clientPrivat.DNI)) {
            System.out.println("Ya existe un cliente con este DNI.");
        } else {

            listaClientes.add(clientPrivat);
            System.out.println("Cliente agregado correctamente.");
        }
    }

}

