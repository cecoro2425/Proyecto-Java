public class discoVinil extends Producte{
    private String durada;

    public discoVinil() {
        super();
    }

    public discoVinil(String nom, String autor, int codi, boolean disponible,String durada) {
        super(nom, autor, codi,disponible);
        this.durada = durada;
    }


}
