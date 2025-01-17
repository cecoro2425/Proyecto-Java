public class audiollibre extends llibre{

    private String durada;

    public audiollibre() {
    }

    public audiollibre(String codi, String titol, String autor, String durada) {
        super(codi, titol, autor);
        this.durada = durada;
    }
}
