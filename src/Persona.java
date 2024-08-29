
public class Persona {
    private int id;
    private String nombre;
    private String tlf;
    private String email;
    private static int numeroPersonas = 0;

    public Persona() {
        this.id = ++Persona.numeroPersonas;
    }

    public Persona(String nombre, String tlf, String email) {
        this();
        this.nombre = nombre;
        this.tlf = tlf;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tlf='" + tlf + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
