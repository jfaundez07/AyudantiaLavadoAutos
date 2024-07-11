public class Persona {

    private String nombre;
    private String apellido;
    private String contacto;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    private String rut;

    public String getContacto() {
        return this.contacto;
    }

    public String getRut() {
        return this.rut;
    }

    /**
     *
     * @param nombre
     * @param apellido
     * @param contacto
     * @param rut
     */
    public Persona(String nombre, String apellido, String contacto, String rut) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contacto = contacto;
        this.rut = rut;
    }

}