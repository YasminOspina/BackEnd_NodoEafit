package Ejercicio2;

public final class PersonalAdmvo extends Asalariado {
    @Override
    protected void  mostrarDetalles(){
        System.out.println("Nombre y/o detalles del personal admvo");
    }

    @Override
    protected void calcularBono(){
        System.out.println("Cálculo de Bono del personal admvo");
    }
}
