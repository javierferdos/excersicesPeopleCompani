
public class Empleado extends Persona {
    private double remuneracion;
    private int empleadoId;

    // Constructor
    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, int empleadoId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
    }

    // Método para aumentar sueldo
    public void aumentarRemuneracion(int porcentaje){
        this.remuneracion += remuneracion * porcentaje/100;
    }

    // Getter para la remuneracion
    public double getRemuneracion() {
        return remuneracion;
    }


    // Otros métodos y getters...


}
