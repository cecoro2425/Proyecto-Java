
public class llibre extends Producte {

    protected String codi;
    protected String titol;
    protected String autor;
    protected Colores color;

    public llibre() {
    }

    public llibre(String nom, String autor, int codi, boolean disponible,String durada) {
        super(nom, autor, codi,disponible);
        this.durada = durada;
    }
}
