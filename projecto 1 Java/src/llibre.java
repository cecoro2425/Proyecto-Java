import java.util.ArrayList;

public class llibre extends Producte {

    protected String descripcio;

    public llibre() {
        super();
    }

    public llibre(String nom, String autor, int codi, boolean disponible,String descripcio) {
        super(nom, autor, codi,disponible);
        this.descripcio = descripcio;
    }



    @Override
    public String toString() {
        return "Nombre: " + nom +
                ", Autor: " + autor +
                ", Código: " + codi +
                ", Disponible: " + disponible +
                ", Descripción: " + descripcio;
    }

    public llibre encontrarLibro(ArrayList<llibre> listaLibros, int codi) {
        for (llibre llibre : listaLibros) {
            if (llibre.codi == codi) {
                return llibre;
            }
        }
        return null;
    }
}