public abstract class cliente {
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
        this.tePrestamo = false;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Boolean getTePrestamo() {
        return tePrestamo;
    }

    public void setTePrestamo(Boolean tePrestamo) {
        this.tePrestamo = tePrestamo;
    }

    @Override
    public String toString() {
        return "cliente{" +
                "nom='" + nom + '\'' +
                ", DNI='" + DNI + '\'' +
                ", correo='" + correo + '\'' +
                ", num='" + num + '\'' +
                ", tePrestamo=" + tePrestamo +
                '}';
    }
}
