import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ClientEscola extends cliente{

    private String Escola;

    public ClientEscola() {
    }

    public ClientEscola(String dni) {
        super(dni);
    }

    public ClientEscola(String nom, String correo, String DNI, String num, Boolean tePrestamo, String escola) {
        super(nom, correo, DNI, num, tePrestamo);
        this.Escola = escola;
    }

    public String getEscola() {
        return Escola;
    }

    public void setEscola(String escola) {
        Escola = escola;
    }

    @Override
    public String toString() {
        return "ClientEscola{" +
                " nom='" + nom + '\'' +
                ", DNI='" + DNI + '\'' +
                ", correo='" + correo + '\'' +
                ", num='" + num + '\'' +
                ", tePrestamo=" + tePrestamo + '\''+
                "Escola='" + Escola +
        '}';
    }


    public void CrearCliente(ClientEscola clientEscola, ArrayList<cliente> listaClientes) {
        System.out.print("Inserte nombre cliente: ");
        Scanner sc = new Scanner(System.in);
        clientEscola.nom = sc.nextLine();
        System.out.print("Inserte DNI: ");
        clientEscola.DNI = sc.nextLine();
        System.out.print("Inserte Correo: ");
        clientEscola.correo = sc.nextLine();
        System.out.print("Inserte Numero: ");
        clientEscola.num =sc.nextLine();
        System.out.print("Inserte nombre de escuela: ");
        clientEscola.setEscola(sc.nextLine());
        clientEscola.tePrestamo = false;
        if (ComprobarDNI(listaClientes, clientEscola.DNI)) {
            System.out.println("Ya existe un cliente con este DNI.");
        } else {
            listaClientes.add(clientEscola);
            System.out.println("Cliente agregado correctamente.");
        }

    }


}
