public class ClientEscola extends cliente{

    private String Escola;

    public ClientEscola() {
    }

    public ClientEscola(String nom, String correo, String DNI, String num, Boolean tePrestamo, String escola) {
        super(nom, correo, DNI, num, tePrestamo);
        Escola = escola;
    }
}
