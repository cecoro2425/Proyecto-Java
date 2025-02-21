import java.util.ArrayList;
import java.util.Scanner;

public class discoVinil extends Producte{
    private String durada;

    public discoVinil() {
        super();
    }

    public discoVinil(String nom, String autor, int codi, boolean disponible,String durada) {
        super(nom, autor, codi , disponible);
        this.durada = durada;
    }

    public void CrearDisco(discoVinil discoVinil, ArrayList<discoVinil> listaDiscos) {
        System.out.print("Inserte nombre de disco: ");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        discoVinil.nom = sc1.nextLine();
        System.out.print("Inserte autor: ");
        discoVinil.autor = sc1.nextLine();
        System.out.print("Inserte codi: ");
        discoVinil.codi = sc2.nextInt();
        discoVinil.disponible = true;
        System.out.print("Inserte duración: ");
        discoVinil.durada =sc1.nextLine();


        if (ComprobarCodi(listaDiscos, discoVinil.codi)) {
            System.out.println("Ya existe un disco con este codigo.");
        } else {
            listaDiscos.add(discoVinil);
            System.out.println("Disco agregado correctamente.");
        }
    }

    public void modificarDisco(ArrayList<discoVinil> listaDiscos) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte codi del Disco a modificar: ");
        int codi = sc.nextInt();
        discoVinil discoEncontrado = encontrarDisco(listaDiscos, codi);
        if (discoEncontrado == null) {
            System.out.println("No existe un disco con este codi.");
            return;
        }
        System.out.print("Inserte nombre de disco: ");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String nom = sc1.nextLine();
        System.out.print("Inserte autor: ");
        String autor = sc1.nextLine();

        System.out.print("Inserte duración: ");
        String durada =sc1.nextLine();
            listaDiscos.set(listaDiscos.indexOf(discoEncontrado), new discoVinil(nom,autor,codi,disponible,durada));
            System.out.println("Disco modificado correctamente.");
    }

    public void eliminarDisco(ArrayList<discoVinil> listaDiscos) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte codi del disco a eliminar: ");
        int codi = sc.nextInt();
        discoVinil discoEncontrado = encontrarDisco(listaDiscos, codi);
        if (discoEncontrado == null) {
            System.out.println("No existe un disco con este codi.");
            return;
        }

        listaDiscos.remove(discoEncontrado);
        System.out.println("disco eliminado correctamente.");
    }

    public discoVinil encontrarDisco(ArrayList<discoVinil> discos, int codi) {
        for (discoVinil disco : discos) {
            if (disco.codi == codi) {
                return disco;
            }
        }
        return null;
    }

    public void solicitarDisco(ArrayList<discoVinil> listaDiscos, ArrayList<cliente> clientes) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inserte código del disco: ");
        int codi = sc.nextInt();
        sc.nextLine();

        discoVinil discoEncontrado = encontrarDisco(listaDiscos, codi);
        if (discoEncontrado == null) {
            System.out.println("Error: Disco no encontrado.");
            return;
        }
        if (!discoEncontrado.disponible) {
            System.out.println("Disco no disponible.");
            return;
        }

        System.out.print("Inserte DNI del cliente: ");
        String dni = sc.nextLine();

        cliente clienteEncontrado = new cliente().encontrarCliente(clientes, dni);
        if (clienteEncontrado == null) {
            System.out.println("Error: Cliente no encontrado.");
            return;
        }

        if (clienteEncontrado instanceof ClientPrivat) {
            System.out.println("Error: Cliente no válido.");
            return;
        }

        if (clienteEncontrado.getProducte() != null) {
            System.out.println("Error: El cliente no ha devuelto el producto.");
            return;
        }

        discoEncontrado.disponible = false;

        int indexCliente = clientes.indexOf(clienteEncontrado);
        if (indexCliente != -1) {
            clientes.get(indexCliente).setProducte(discoEncontrado);
            System.out.println("Disco solicitado correctamente.");

        }
    }

    public void devolverDisco(ArrayList<discoVinil> listaDiscos,ArrayList<cliente> clientes) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte codi del disco: ");
        int codi = sc.nextInt();
        sc.nextLine();

        discoVinil discoEncontrado = encontrarDisco(listaDiscos, codi);
        if (discoEncontrado == null) {
            System.out.println("Error: Disco no encontrado.");
            return;
        }

        if (!discoEncontrado.disponible) {
            System.out.print("Inserte DNI del cliente: ");
            String dni = sc.nextLine();

            cliente clienteEncontrado = new cliente().encontrarCliente(clientes, dni);
            if (clienteEncontrado == null) {
                System.out.println("Error: Cliente no encontrado.");
                return;
            }

            if (clienteEncontrado instanceof ClientPrivat) {
                System.out.println("Error: Cliente no válido.");
                return;
            }

            if (clienteEncontrado.getProducte() == null) {
                System.out.println("Error: El cliente no tiene producto.");
                return;
            }

            discoEncontrado.disponible = true;

            int indexCliente = clientes.indexOf(clienteEncontrado);
            if (indexCliente != -1) {
                clientes.get(indexCliente).setProducte(null);
                System.out.println("Disco devuelto correctamente.");

            }
        }
    }


    public boolean ComprobarCodi(ArrayList<discoVinil> discos, int codi) {
        for (discoVinil disco : discos) {
            if (disco.codi == codi) {
                return true;
            }
        }
        return false;
    }

    public void buscarDisco(ArrayList<discoVinil> listaDiscos, int codi) {
        for (discoVinil discoVinil : listaDiscos) {
            if (discoVinil.codi == codi) {
                System.out.println(discoVinil);

                return;
            }
            System.out.println("No existe un disco con este codi.");

        }
    }

    @Override
    public String toString() {
        return "discoVinil{" +
                "durada='" + durada + '\'' +
                ", nom='" + nom + '\'' +
                ", autor='" + autor + '\'' +
                ", codi=" + codi +
                ", disponible=" + disponible +
                '}';
    }
}
