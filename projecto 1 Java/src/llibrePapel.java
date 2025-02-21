public class llibrePapel extends llibre {
    private int NumPag;
    private String edicio;

    public llibrePapel() {
    }

    public llibrePapel(String nom, String autor, int codi, boolean disponible,String descripcio,int NumPag,String edicio) {
        super(nom, autor, codi,disponible,descripcio);
        this.NumPag = NumPag;
        this.edicio = edicio;
    }
    @Override
    public String toString() {
        return super.toString() +
                ", Número de páginas: " + NumPag +
                ", Edición: " + edicio;
    }

}
