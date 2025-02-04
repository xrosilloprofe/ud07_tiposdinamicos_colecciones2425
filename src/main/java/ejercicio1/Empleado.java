package ejercicio1;

import java.time.LocalDate;
import java.util.Comparator;

public class Empleado implements Comparable<Empleado>{
    public static final Comparator<Empleado> BY_AGE =
            new Comparator<Empleado>() {
                @Override
                public int compare(Empleado o1, Empleado o2) {
                    return o1.getFechaNac().compareTo(o2.getFechaNac());
                }
            };
    private String DNI;
    private String nombreCompleto;
    private LocalDate fechaNac;

    public Empleado(String DNI, String nombreCompleto, LocalDate fechaNac){
        this.DNI=DNI;
        this.nombreCompleto=nombreCompleto;
        this.fechaNac=fechaNac;
    }

    public String getDNI() {
        return DNI;
    }
    public String getNombreCompleto() { return nombreCompleto;}
    public LocalDate getFechaNac(){ return fechaNac;}

    @Override
    public String toString(){
        return "DNI: " + DNI + " nombre: " + nombreCompleto +
                " fecha nacimiento: " + fechaNac;
    }

    @Override
    public int compareTo(Empleado empleado){
        return DNI.compareTo(empleado.getDNI());
    }

    @Override
    public boolean equals(Object object){
        if(object == null || !(object instanceof Empleado))
            return false;
        Empleado empleado=(Empleado) object;
        return this.nombreCompleto.equals(empleado.getNombreCompleto())
                && this.DNI.equals(empleado.getDNI());
    }

    @Override
    public int hashCode(){ return nombreCompleto.hashCode()+DNI.hashCode();}
}
