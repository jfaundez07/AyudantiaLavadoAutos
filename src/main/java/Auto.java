public class Auto {
    private String patente;
    private String modelo;

    public String getPatente() {
        return this.patente;
    }

    public String getModelo() {
        return this.modelo;
    }

    /**
     *
     * @param patente
     * @param modelo
     */
    public Auto(String patente, String modelo) {
        this.patente = patente;
        this.modelo = modelo;
    }
}
