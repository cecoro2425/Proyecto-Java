public class cliente {
    protected String nom;
    protected String DNI;
    protected String correo;
    protected String num;
    protected Boolean tePrestamo;

    public cliente() {
    }

    public cliente(String nom, String correo, String DNI, String num, Boolean tePrestamo) {
        this.nom = nom;
        this.correo = correo;
        this.DNI = DNI;
        this.num = num;
        this.tePrestamo = tePrestamo;
    }

}
