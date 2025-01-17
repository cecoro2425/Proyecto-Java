public class treballador {
    protected String nom;
    protected String DNI;
    protected String codi;
    protected String telefon;
    protected String direccion;

    public treballador() {
    }

    public treballador(String nom, String DNI, String codi, String telefon, String direccion) {
        this.nom = nom;
        this.DNI = DNI;
        this.codi = codi;
        this.telefon = telefon;
        this.direccion = direccion;
    }
}
