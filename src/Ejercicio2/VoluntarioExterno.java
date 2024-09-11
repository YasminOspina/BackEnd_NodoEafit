package Ejercicio2;

public final class VoluntarioExterno extends Voluntario {
    @Override
    protected void mostrarDetalles(){
        System.out.println("Información del Voluntario Externo");
    }
    @Override
    protected void calcularBono(){
        System.out.println("Cálculo del bono para el Voluntario Externo");
    }
}
