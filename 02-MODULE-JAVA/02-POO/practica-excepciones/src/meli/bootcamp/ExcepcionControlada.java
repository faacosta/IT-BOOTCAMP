package meli.bootcamp;

public class ExcepcionControlada {

    private Integer a = 0;

    private Integer b = 300;

    public Integer calcularCociente() {
        Integer cociente = 0;

        try {
            cociente = this.b / this.a;
        } catch (ArithmeticException exception) {
            System.out.println("Se ha producido un error");
        } finally {
            System.out.println("Programa finalizado");
        }

        return cociente;
    }
    
}
