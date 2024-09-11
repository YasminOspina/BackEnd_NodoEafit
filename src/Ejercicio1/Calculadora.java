package Ejercicio1;

public class Calculadora {

    public static double ejecutarOperacion(Operacion operacion) {
        return operacion.operar();
    }

    public static void main(String[] args) {
        double num1 = 20;
        double num2 = 5;

        Operacion suma = new Suma(num1,num2);
        Operacion resta = new Resta(num1,num2);
        Operacion multiplicacion = new Multiplicacion(num1,num2);
        Operacion dividir = new Division(num1,num2);

        System.out.println("El resultado de la Suma: " + ejecutarOperacion(suma));
        System.out.println("El resultado de la Resta: " + ejecutarOperacion(resta));
        System.out.println("El resultado de la Multiplicación: " + ejecutarOperacion(multiplicacion));
        System.out.println("El resultado de la División: " + ejecutarOperacion(dividir));
    }
}
