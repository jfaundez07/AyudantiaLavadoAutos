import java.util.ArrayList;

public class Cliente extends Persona {

    private int id;
    private ArrayList<Auto> autos;

    public int getId() {
        return this.id;
    }

    public ArrayList<Auto> getAutos() {
        return this.autos;
    }

    public void addAuto(Auto auto) {
        this.autos.add(auto);
    }

    /**
     *
     * @param nombre
     * @param apellido
     * @param contacto
     * @param rut
     */
    public Cliente(String nombre, String apellido, String contacto, String rut, int id) {
        super(nombre, apellido, contacto, rut);
        this.autos = new ArrayList<Auto>();
    }

}