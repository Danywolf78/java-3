package Ejercicio1.Ejer1;

import java.util.List;

public class Curso {

    private String nombreCurso;
    private  Boolean aceptado;
    private String descripcion;
    private List<Alumno> alumnos;
    public Curso() {

    }

    public Curso(String nombreCurso, Boolean aceptado, String descripcion, List<Alumno> alumnos) {
        this.nombreCurso = nombreCurso;
        this.aceptado = aceptado;
        this.descripcion = descripcion;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public Boolean getAceptado() {
        return aceptado;
    }

    public void setAceptado(Boolean aceptado) {
        this.aceptado = aceptado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
}

