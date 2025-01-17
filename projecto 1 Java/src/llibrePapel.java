public class llibrePapel extends llibre {
    private Integer NumPag;
    private String edicio;

    public llibrePapel() {
    }

    public llibrePapel(String codi, String titol, String autor, Integer NumPag, String edicio) {
        super(codi, titol, autor);
        this.NumPag = NumPag;
        this.edicio = edicio;
    }
}
