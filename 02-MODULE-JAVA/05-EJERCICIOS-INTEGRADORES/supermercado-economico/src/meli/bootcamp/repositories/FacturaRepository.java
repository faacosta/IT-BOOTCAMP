package meli.bootcamp.repositories;

import java.util.HashMap;
import java.util.Map;
import meli.bootcamp.core.Repository;
import meli.bootcamp.models.Factura;

public class FacturaRepository implements Repository<Integer, Factura> {

    private Integer numeracion = 0;
    
    private Map<Integer, Factura> facturas;

    public FacturaRepository() {
        this.facturas = new HashMap<>();
    }

    @Override
    public void save(Factura factura) {
        factura.setCodigo(++numeracion);
        this.facturas.computeIfAbsent(factura.getCodigo(), key -> factura);
    }
    
}
