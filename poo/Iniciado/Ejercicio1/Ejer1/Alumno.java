package Ejercicio1.Ejer1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Alumno {

         String nombre;
         String apellido;
         LocalDate fechaDeNacimiento;
         Integer edad;

        public Alumno() {

        }

        public Alumno(String nombre, String apellido, LocalDate fechaDeNaciemiento, Integer edad) {
                this.nombre = nombre;
                this.apellido = apellido;
                this.fechaDeNacimiento = fechaDeNaciemiento;
                this.edad = edad;
        }

        public static void main(String[] args) {
            Alumno persona1 = new Alumno("Miguel", "Gonzalez", LocalDate.of(2000, 02, 12), 23);
            Alumno persona2 = new Alumno("Daniel", "Gutierrez", LocalDate.of(2001, 6, 23), 22);
            Alumno persona3 = new Alumno("Martin", "Meza", LocalDate.of(2001, 10, 22), 22);
            System.out.println(persona1.nombre + " " + persona1.apellido + " tiene " + persona1.edad);
            System.out.println(persona2.nombre + " " + persona2.apellido + " tiene " + persona2.edad);
            System.out.println(persona3.nombre + " " + persona3.apellido + " tiene " + persona3.edad);


            List<Alumno> alumnos = new ArrayList<>();
            alumnos.add(persona2);
            alumnos.add(persona1);
            alumnos.add(persona3);


            Curso curso1 = new Curso("Matematica 1", true, "Curso de Algebra 1", alumnos);
            Curso curso2 = new Curso("Lengua y Literatura", true, "Curso de Literatura Inglesa", alumnos);
            Curso curso3 = new Curso("Computacion", true, "Curso Basico de Excel", alumnos);

            System.out.println(curso1.getNombreCurso() + " " + curso1.getDescripcion() + " Alumnos inscriptos:");

            for (Alumno alumno : curso1.getAlumnos()) {
                System.out.println(alumno.nombre + " " + alumno.apellido);
            }

            System.out.println(curso2.getNombreCurso() + " " + curso2.getDescripcion() + " Alumnos inscriptos:");

            for (Alumno alumno : curso2.getAlumnos()) {
                System.out.println(alumno.nombre + " " + alumno.apellido);
            }
        }
}

