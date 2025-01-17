public class ClientPrivat extends cliente{

    private String direccio;

    public ClientPrivat() {
    }

    public ClientPrivat(String nom, String correo, String DNI, String num, Boolean tePrestamo, String direccio) {
        super(nom, correo, DNI, num, tePrestamo);
        this.direccio = direccio;
    }
}

