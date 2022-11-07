/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author RJG-SERVER
 */
public class Estudiante extends Persona {
    
    private String carrera;
    
    private String anioIngreso;

    public Estudiante() {
    }


    public Estudiante(String carrera, String añoIngreso, String nombre, String Dni, 
            String sexo, String domicilio, String provincia, String departamento, String fechaNac,
            String lugarNac, String telefono) {
        super(nombre, Dni, sexo, domicilio, provincia, departamento, fechaNac, lugarNac, telefono);
        this.carrera = carrera;
        this.anioIngreso = añoIngreso;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getAñoIngreso() {
        return anioIngreso;
    }

    public void setAñoIngreso(String añoIngreso) {
        this.anioIngreso = añoIngreso;
    }

    @Override
    public String toString() {
        return "Estudiante{"+ super.toString() + "carrera= " + carrera + ", añoIngreso= " + anioIngreso + '}';
    }



    
    
    
    
    
}
