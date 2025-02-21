import java.util.ArrayList;
import java.util.Scanner;

public class Reserva {
    private cliente cliente;
    private llibre llibre;
    private discoVinil discoVinil;


    public Reserva(cliente cliente, llibre llibre) {
        this.cliente = cliente;
        this.llibre = llibre;
    }

    public Reserva(cliente cliente, discoVinil discoVinil) {
        this.cliente = cliente;
        this.discoVinil = discoVinil;
    }

    public Reserva() {}

    public cliente getCliente() {
        return cliente;
    }

    public void setCliente(cliente cliente) {
        this.cliente = cliente;
    }

    public llibre getLlibre() {
        return llibre;
    }

    public void setLlibre(llibre llibre) {
        this.llibre = llibre;
    }

    public discoVinil getDiscoVinil() {
        return discoVinil;
    }

    public void setDiscoVinil(discoVinil discoVinil) {
        this.discoVinil = discoVinil;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "cliente=" + cliente +
                ", llibre=" + llibre +
                ", discoVinil=" + discoVinil +
                '}';
    }

    public void crearReservaLibro(ArrayList<Reserva> reservas, ArrayList<llibre> llibres, ArrayList<cliente> clientes) {
        System.out.print("Inserte el codi del libro a reservar: ");
        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();
        llibre llibre = new llibre().encontrarLibro(llibres, codigo);


        Scanner sc1 = new Scanner(System.in);
        System.out.print("Inserte el DNI del cliente: ");
        String dni = sc1.nextLine();
        cliente clienteEncontrado = encontrarCliente(clientes, dni);
        reservas.add(new Reserva(clienteEncontrado, llibre));

    }

    public void crearReservaDisco(ArrayList<Reserva> reservas, ArrayList<discoVinil> discoVinils, ArrayList<cliente> clientes) {
        System.out.print("Inserte el codi del libro a reservar: ");
        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();
        discoVinil productoEncontrado =  new discoVinil().encontrarDisco(discoVinils, codigo);


        Scanner sc1 = new Scanner(System.in);
        System.out.print("Inserte el DNI del cliente: ");
        String dni = sc1.nextLine();
        cliente clienteEncontrado = encontrarCliente(clientes, dni);
        reservas.add(new Reserva(clienteEncontrado, productoEncontrado));

    }

    public Producte encontrarProducte(ArrayList<discoVinil> productes, int codi) {
        for (Producte producto : productes) {
            if (producto.codi == codi) {
                return producto;
            }
        }
        return null;
    }

    public cliente encontrarCliente(ArrayList<cliente> clientes, String dni) {
        for (cliente cliente : clientes) {
            if (cliente.DNI.equals(dni)) {
                return cliente;
            }
        }
        return null;
    }

    public void eliminarReserva(ArrayList<Reserva> reservas, ArrayList<cliente> clientes, String dni) {
        for(Reserva reserva:reservas ) {
            if(reserva.encontrarCliente(clientes, dni) != null) {
                reservas.remove(reserva);
                System.out.println("Reserva eliminada");
                break;
            }

        }

    }




}
