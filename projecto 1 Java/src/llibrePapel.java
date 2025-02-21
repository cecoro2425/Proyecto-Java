public class llibrePapel extends llibre {
    private int NumPag;
    private String edicio;

    public llibrePapel() {
    }

    public llibrePapel(String codi, String titol, String autor, int NumPag, String edicio) {
        super(codi, titol, autor);
        this.NumPag = NumPag;
        this.edicio = edicio;
    }
}
