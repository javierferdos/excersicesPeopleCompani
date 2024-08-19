public class Main {
    public static void main(String[] args) {

        Empleado empleadoUno = new Empleado("javier", "alba", "123456", "calle 100", 1.600000,123);

        Gerente gerenteUno = new Gerente("oscar", "alba", "123456", "calle", 6.000000, 123456, 6);

        System.out.println(gerenteUno.getRemuneracion());
        gerenteUno.aumentarRemuneracion(6);
        System.out.println(gerenteUno.getRemuneracion());


    }

}
