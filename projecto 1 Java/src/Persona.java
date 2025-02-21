import java.util.Objects;

public abstract class Persona {
    protected String nombre;
    protected String DNI;
    protected String correo;
    protected String telefono;
    protected String direccion;

    Persona(){

    }

    Persona(String nombre, String DNI, String correo, String telefono, String direccion) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre) && Objects.equals(DNI, persona.DNI) && Objects.equals(correo, persona.correo) && Objects.equals(telefono, persona.telefono) && Objects.equals(direccion, persona.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, DNI, correo, telefono, direccion);
    }
}

