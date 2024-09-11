package Ejercicio2;

public final class ProfesorTitular extends Profesor {
    @Override
    protected void mostrarDetalles(){
        System.out.println("Información del Profesor Titular");
    }
    @Override
    protected  void calcularBono(){
        System.out.println("Calculando Bono del Profesor Titular");
    }
    @Override
    protected void materiaDesignada(){
        System.out.println("Materia Designada");
    }
}
