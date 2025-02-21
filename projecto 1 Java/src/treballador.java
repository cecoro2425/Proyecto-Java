import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class treballador extends Persona {
    private int codi;

    public treballador() {
        super();
    }

    public treballador(String nombre, String DNI,String correo, String telefono,String direccion,int codi) {
        super(nombre, DNI, correo, telefono, direccion);
        this.codi = codi;
    }

    public void buscarTreballador(ArrayList<treballador> listaTreballadors, int codi) {
        for (treballador treballador : listaTreballadors) {
            if (treballador.codi ==codi) {
                System.out.println(treballador);

                return;
            }
            System.out.println("No existe un treballador con este codi.");

        }
    }

    public void CrearTreballador(treballador treballador, ArrayList<treballador> listaTreballadors) {
        System.out.print("Inserte codi de treballador: ");
        Scanner sc = new Scanner(System.in);
        treballador.codi = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Inserte nombre treballador: ");
        treballador.nombre = sc1.nextLine();
        System.out.print("Inserte DNI: ");
        treballador.DNI = sc1.nextLine();
        System.out.print("Inserte Correo: ");
        treballador.correo = sc1.nextLine();
        System.out.print("Inserte Numero: ");
        treballador.telefono =sc1.nextLine();
        System.out.print("Inserte dirección: ");
        treballador.direccion =sc1.nextLine();

        if (ComprobarCodi(listaTreballadors, treballador.codi)) {
            System.out.println("Ya existe un treballador con este codi.");
        } else {
            listaTreballadors.add(treballador);
            System.out.println("Treballador agregado correctamente.");
        }

    }

    public void modificarTreballador(ArrayList<treballador> listaTreballadors) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte codi del treballador a modificar: ");
        int codi = sc.nextInt();
        treballador treballadorEncontrado = encontrarTreballador(listaTreballadors, codi);
        if (treballadorEncontrado == null) {
            System.out.println("No existe un treballador con este codi.");
            return;
        }
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Inserte nombre treballador: ");
        String nom = sc1.nextLine();
        System.out.print("Inserte dni: ");
        String dni = sc1.nextLine();
        System.out.print("Inserte Correo: ");
        String correo = sc1.nextLine();
        System.out.print("Inserte Numero: ");
        String num =sc1.nextLine();
        System.out.print("Inserte dirección: ");
        String direccion =sc1.nextLine();

        listaTreballadors.set(listaTreballadors.indexOf(treballadorEncontrado), new treballador(nom,dni,correo,num,direccion,codi));
        System.out.println("Cliente modificado correctamente.");

    }

    public void eliminarTreballador(ArrayList<treballador> listaTreballadors) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte codi del treballador a eliminar: ");
        int codi = sc.nextInt();
        treballador treballadorEncontrado = encontrarTreballador(listaTreballadors, codi);
        if (treballadorEncontrado == null) {
            System.out.println("No existe un treballador con este codi.");
            return;
        }

        listaTreballadors.remove(treballadorEncontrado);
        System.out.println("Treballador eliminado correctamente.");
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public treballador encontrarTreballador(ArrayList<treballador> treballadors, int codi){
        for(treballador treballador: treballadors){
            if(treballador.codi == codi){
                return treballador;
            }
        }
        return null;
    }

    public boolean ComprobarCodi(ArrayList<treballador> treballadors, int codi) {
        for (treballador t: treballadors) {
            if (t.getCodi() == codi) {
                return true;
            }
        }
        return false;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        treballador that = (treballador) o;
        return codi == that.codi;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), codi);
    }

    @Override
    public String toString() {
        return "treballador{" +
                "codi=" + codi +
                ", nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
