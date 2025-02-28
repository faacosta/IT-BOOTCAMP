package meli.bootcamp.models;

public abstract class Animal {

    private String nombre;

    protected Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void emitirSonido();

    public abstract void comer();
    
}
