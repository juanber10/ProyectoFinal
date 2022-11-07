/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RJG-SERVER
 */
public class Persona {
    
    private String nombre;
    private String Dni;
    private String sexo;
    private String domicilio;
    private String provincia;
    private String departamento;
    private String fechaNac;
    private String lugarNac;
    private String telefono;

    public Persona() {
    }

    public Persona(String nombre, String Dni, String sexo, String domicilio,
            String provincia, String departamento, String fechaNac,
            String lugarNac, String telefono) {
        this.nombre = nombre;
        this.Dni = Dni;
        this.sexo = sexo;
        this.domicilio = domicilio;
        this.provincia = provincia;
        this.departamento = departamento;
        this.fechaNac = fechaNac;
        this.lugarNac = lugarNac;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getLugarNac() {
        return lugarNac;
    }

    public void setLugarNac(String lugarNac) {
        this.lugarNac = lugarNac;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", Dni=" + Dni + ", sexo=" + sexo 
                + ", domicilio=" + domicilio + ", provincia=" + provincia + ","
                + " departamento=" + departamento + ", fechaNac=" + fechaNac + ","
                + " lugarNac=" + lugarNac + ", telefono=" + telefono + '}';
    }
    
    
    
    
    
    
}
