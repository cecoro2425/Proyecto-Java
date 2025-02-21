public class audiollibre extends llibre{

    private String durada;

    public audiollibre() {
        super();
    }

    public audiollibre(String nom, String autor, int codi, boolean disponible,String descripcio,String durada) {
        super(nom, autor, codi,disponible,descripcio);
        this.durada = durada;
    }
    @Override
    public String toString() {
        return super.toString() +
                ", DuraciÃ³n: " + durada;
    }

}