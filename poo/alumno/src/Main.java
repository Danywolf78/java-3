import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo= new Vehiculo("Marca 1",4,Boolean.FALSE,Boolean.TRUE,"100","0");
        Persona persona= new Persona(123456789L,"Ian", LocalDate.of(1999,8,19),
                vehiculo );
        System.out.println("Nombre : "+ persona.getNombre());
        System.out.println("Dni :" + persona.getDni());
        System.out.println("fecha de Nacimiento :" + persona.getFechaDeNacimiento());
        System.out.println("Vehiculo :"+ persona.getVehiculo().getMarca());
        System.out.println(" ");

        //Arrancamos el vahiculo
        persona.getVehiculo().arrancarVehiculo();
        System.out.println(" ");
        //Quitamos la alarma
        persona.getVehiculo().setEstaLaAlarmaEncendida(Boolean.FALSE);
        System.out.println(" ");

        //Arrancamos el vahiculo
        persona.getVehiculo().arrancarVehiculo();

    }
}