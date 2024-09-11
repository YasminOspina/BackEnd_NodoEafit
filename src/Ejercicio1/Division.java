package Ejercicio1;

public class Division extends Operacion{
    public Division(double num1, double num2) {
        super(num1, num2);
    }
    @Override
    public double operar() {
        if (num2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return num1 / num2;
    }
}
