package meli.bootcamp;

public class ExcepcionNoControlada {

    private Integer a = 0;

    private Integer b = 300;

    public Integer calcularCociente() {
        Integer cociente = 0;

        try {
            cociente = this.b / this.a;
        } catch (ArithmeticException exception) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }

        return cociente;
    }
    
}
