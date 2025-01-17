public class ClientPrivat extends cliente{

    private String direccio;
    private llibrePapel llibrePapel;

    public ClientPrivat() {
    }

    public ClientPrivat(String nom, String correo, String DNI, String num, Boolean tePrestamo, String direccio) {
        super(nom, correo, DNI, num, tePrestamo);
        this.direccio = direccio;
    }

    public String getDireccio() {
        return direccio;
    }

    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }

    @Override
    public String toString() {
        return "ClientPrivat{" +
                ", nom='" + nom + '\'' +
                ", DNI='" + DNI + '\'' +
                ", correo='" + correo + '\'' +
                ", num='" + num + '\'' +
                ", tePrestamo=" + tePrestamo + '\'' +
                ", direccio='" + direccio  +
                '}';
    }
}

