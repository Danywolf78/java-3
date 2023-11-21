import java.time.LocalDate;

public class Persona {
    private Long dni;
    private String nombre;
    private LocalDate fechaDeNacimiento;
    private Vehiculo vehiculo;

    Persona() {
    }

    Persona(Long dni, String nombre, LocalDate fechaDeNacimiento, Vehiculo vehiculo) {
        this.setDni(dni);
        this.setNombre(nombre);
        this.setFechaDeNacimiento(fechaDeNacimiento);
        this.setVehiculo(vehiculo);
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

}
