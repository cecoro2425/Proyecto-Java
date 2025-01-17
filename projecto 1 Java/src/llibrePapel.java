public class llibrePapel extends llibre {
    private Integer NumPag;
    private String edicio;

    public llibrePapel() {
    }

    public llibrePapel(String codi, String titol, String autor, Integer numPag, String edicio) {
        super(codi, titol, autor);
        NumPag = numPag;
        this.edicio = edicio;
    }
}
