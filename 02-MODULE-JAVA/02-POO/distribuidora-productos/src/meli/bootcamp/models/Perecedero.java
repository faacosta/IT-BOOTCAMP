package meli.bootcamp.models;

public class Perecedero extends Producto {
    
    private Integer diasPorCaducar;

    public Perecedero(String nombre, Double precio, Integer diasPorCaducar) {
        super(nombre, precio);
        this.diasPorCaducar = diasPorCaducar;
    }

    public Integer getDiasPorCaducar() {
        return diasPorCaducar;
    }

    public void setDiasPorCaducar(Integer diasPorCaducar) {
        this.diasPorCaducar = diasPorCaducar;
    }

    @Override
    public Double calcular(Integer cantidadProductos) {
        switch (this.diasPorCaducar) {
            case 1:
                return super.calcular(cantidadProductos) - (this.precio / 4);

            case 2:
                return super.calcular(cantidadProductos) - (this.precio / 3);

            case 3:
                return super.calcular(cantidadProductos) - (this.precio / 2);

            default:
                return super.calcular(cantidadProductos);
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(super.toString());
        builder.append(" | ").append("Dias por Caducar: ").append(this.diasPorCaducar);

        return builder.toString();
    }

}
