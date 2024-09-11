package Ejercicio1;

public class Resta extends Operacion{
    public Resta (double num1, double num2) {
        super(num1, num2);
    }
    @Override
    public double operar() {
        return num1 - num2;
    }

}
