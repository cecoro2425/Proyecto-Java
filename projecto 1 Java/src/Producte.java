public abstract class Producte {
    protected String nom;
    protected String autor;
    protected int codi;
    protected boolean disponible;

    public Producte(String nom, String autor, int codi, boolean disponible) {
        this.nom = nom;
        this.autor = autor;
        this.codi = codi;
        this.disponible = disponible;
    }

    public Producte() {

    }


}
