package Ejercicio2;

public final class ProfesorInterino extends Profesor {
    @Override
    protected void mostrarDetalles(){
        System.out.println("Información del Profesor Interino");
    }
    @Override
    protected  void calcularBono(){
        System.out.println("Calculando Bono del Profesor Interino");
    }
    @Override
    protected void materiaDesignada(){
        System.out.println("Materia Designada");
    }
}
