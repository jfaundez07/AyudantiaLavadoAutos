public enum TipoLavado {
    LAVADO_BASICO("Lavado Básico", 10000),
    LAVADO_FULL("Lavado Detallado", 15000),
    LAVADO_INTERIOR("Lavado Interior", 12000);

    private String nombre;
    private int precio;

    TipoLavado(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}
