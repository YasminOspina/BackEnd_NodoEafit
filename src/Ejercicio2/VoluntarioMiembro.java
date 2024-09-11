package Ejercicio2;

public final class VoluntarioMiembro extends Voluntario{
    @Override
    protected void mostrarDetalles(){
        System.out.println("Información del Voluntario Miembro");
    }
    @Override
    protected void calcularBono(){
        System.out.println("Cálculo del bono para el Voluntario Miembro");
    }
}
