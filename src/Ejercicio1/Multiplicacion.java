package Ejercicio1;

public class Multiplicacion extends Operacion {
    public  Multiplicacion (double num1, double num2) {
        super(num1, num2);
    }
    @Override
    public double operar() {
        return num1 * num2;

    }

}
