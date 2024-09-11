package Ejercicio2;

public class Jerarquia {
    public static void main(String[] args) {

        PersonalAdmvo admin = new PersonalAdmvo();
        ProfesorTitular titular = new ProfesorTitular();
        ProfesorInterino interino = new ProfesorInterino();
        VoluntarioMiembro miembro = new VoluntarioMiembro();
        VoluntarioExterno externo = new VoluntarioExterno();

        admin.mostrarDetalles();
        admin.calcularBono();

        titular.mostrarDetalles();
        titular.calcularBono();
        titular.materiaDesignada();

        interino.mostrarDetalles();
        interino.calcularBono();
        titular.materiaDesignada();

        miembro.mostrarDetalles();
        miembro.calcularBono();

        externo.mostrarDetalles();
        externo.calcularBono();
    }
}
