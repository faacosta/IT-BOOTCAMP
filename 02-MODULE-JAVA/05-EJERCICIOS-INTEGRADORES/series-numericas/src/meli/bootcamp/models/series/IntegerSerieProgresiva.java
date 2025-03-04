package meli.bootcamp.models.series;

import meli.bootcamp.models.SerieProgresiva;

public class IntegerSerieProgresiva extends SerieProgresiva<Integer> {

    public IntegerSerieProgresiva(Integer valorInicial, Integer paso) {
        super(valorInicial, paso);
    }

    @Override
    public Integer valorSiguiente() {
        Integer valorRetorno = this.valorActual;
        this.valorActual += this.paso;
        return valorRetorno;
    }
    
}
