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

    public ClientEscola(String nombre, String DNI, String correo, String telefono,String direccion, String escola) {
        super(nombre,DNI, correo, telefono, direccion);
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
                " nom='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", correo='" + correo + '\'' +
                ", num='" + telefono + '\'' +
                ", dirección='" + direccion + '\'' +
                VerificaObjeto()+
                ", Escola='" + Escola +
        '}';
    }

    public void CrearCliente(ClientEscola clientEscola, ArrayList<cliente> listaClientes) {
        System.out.print("Inserte nombre cliente: ");
        Scanner sc = new Scanner(System.in);
        clientEscola.nombre = sc.nextLine();
        System.out.print("Inserte DNI: ");
        clientEscola.DNI = sc.nextLine();
        System.out.print("Inserte Correo: ");
        clientEscola.correo = sc.nextLine();
        System.out.print("Inserte Numero: ");
        clientEscola.telefono =sc.nextLine();
        System.out.print("Inserte dirección: ");
        clientEscola.direccion =sc.nextLine();
        System.out.print("Inserte nombre de escuela: ");
        clientEscola.setEscola(sc.nextLine());
        if (ComprobarDNI(listaClientes, clientEscola.DNI)) {
            System.out.println("Ya existe un cliente con este DNI.");
        } else {
            listaClientes.add(clientEscola);
            System.out.println("Cliente agregado correctamente.");
        }

    }


}
