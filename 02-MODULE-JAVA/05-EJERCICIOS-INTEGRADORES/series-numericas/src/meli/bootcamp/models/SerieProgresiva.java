package meli.bootcamp.models;

public abstract class SerieProgresiva<T extends Number> {

    protected T valorActual;

    protected T valorInicial;

    protected T paso;

    protected SerieProgresiva(T valorInicial, T paso) {
        this.valorActual = valorInicial;
        this.valorInicial = valorInicial;
        this.paso = paso;
    }

    public abstract T valorSiguiente();

    public void reiniciar() {
        this.valorActual = this.valorInicial;
    }

    public void setValorInicial(T valor) {
        this.valorActual = valor;
        this.valorInicial = valor;
    }
    
}
