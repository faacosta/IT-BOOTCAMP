package meli.bootcamp.models;

public class NoPerecedero extends Producto {

    private String tipo;

    public NoPerecedero(String nombre, Double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(super.toString());
        builder.append(" | ").append("Tipo: ").append(this.tipo);

        return builder.toString();
    }
    
}
