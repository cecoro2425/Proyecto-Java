public class ClientEscola extends cliente{

    private String Escola;

    public ClientEscola() {
    }

    public ClientEscola(String nom, String correo, String DNI, String num, Boolean tePrestamo, String escola) {
        super(nom, correo, DNI, num, tePrestamo);
        this.Escola = escola;
    }

    public String getEscola() {
        return Escola;
    }

    public void setEscola(String escola) {
        Escola = escola;
    }

    @Override
    public String toString() {
        return "ClientEscola{" +
                " nom='" + nom + '\'' +
                ", DNI='" + DNI + '\'' +
                ", correo='" + correo + '\'' +
                ", num='" + num + '\'' +
                ", tePrestamo=" + tePrestamo + '\''+
                "Escola='" + Escola +
        '}';
    }
}
