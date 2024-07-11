public class Orden {
    private int id;
    private boolean estado;
    private Cliente cliente;
    private Auto auto;
    private TipoLavado tipoLavado;

    public boolean getEstado() {
        return this.estado;
    }

    /**
     *
     * @param estado
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Orden(int id, Cliente cliente, Auto auto, TipoLavado tipoLavado) {
        this.id = id;
        this.estado = false;
        this.cliente = cliente;
        this.auto = auto;
        this.tipoLavado = tipoLavado;
    }

}
