
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RJG-SERVER
 */
public class ControllerEstudiante {
    
    public static ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    
    static Busqueda viewBusqueda = new Busqueda();
     
     static Lista viewLista = new Lista();
    
    public static void registrarEstduiante(Estudiante estudiante) {
        listaEstudiantes.add(estudiante);
        
        System.out.println(listaEstudiantes);
    }
    public static boolean existeEstudiante(String Dni){
        boolean existe=false;
        int tamaLista = listaEstudiantes.size();
        for (int i=0;i<tamaLista;i++){
            if (listaEstudiantes.get(i).getDni().equals(Dni)){
                existe=true;
                break;
            }
        }
        return existe;
    }   
    public static Estudiante obtenerAlumnoPorDni(String dniConsulta){
        Estudiante estudiante=null;
        for (int i=0;i<listaEstudiantes.size();i++){
            if (listaEstudiantes.get(i).getDni().equals(dniConsulta)){
               estudiante=listaEstudiantes.get(i);
               break;
            }
        }
        return estudiante;
    }    

    static public void evnBaja(String dni) {
       System.out.println("evento baja");

        int n = listaEstudiantes.size();
        for (int i = 0; i < n; i++) {
            Estudiante estudiante = listaEstudiantes.get(i);
            if (dni.equals(estudiante.getDni())) {
                int confirmado = JOptionPane.showConfirmDialog(null,
                        "Está seguro que desea Eliminar el Estudiante seleccionado"
                        ,"Acceso Denegado",JOptionPane.ERROR_MESSAGE);
                if (JOptionPane.OK_OPTION == confirmado) {
                     listaEstudiantes.remove(i);
                     viewBusqueda.settearAtrtributos();
                      break;
                     }    
            }      
            
        }
        
        System.out.println(listaEstudiantes);

  }        
        
     static public void evnModificacion(String dniConsulta) {
        System.out.println("evento Modificar");

        
        String nombre = viewBusqueda.getTxtNomyApe().getText();       
        String domicilio = viewBusqueda.getTxtDom().getText();
         String fechaNac = viewBusqueda.getTxtFechaNac().getText();
         String lugarNac = viewBusqueda.getTxtLugNac().getText();
         String provincia = viewBusqueda.getTxtProvincia().getText();
         String departamento = viewBusqueda.getTxtDpto().getText();
         String telefono = viewBusqueda.getTxtTelefono().getText();
         String carrera = viewBusqueda.getTxtCarrera().getText();
         String año = viewBusqueda.getTxtAño().getText() ;
         String sexoselect = viewBusqueda.getTxtSexo().getText();

        Estudiante estudianteView = new Estudiante();
              
        
        estudianteView.setNombre(nombre);
        estudianteView.setDni(dniConsulta);
        estudianteView.setDomicilio(domicilio);
        estudianteView.setFechaNac(fechaNac);
        estudianteView.setLugarNac(lugarNac);
        estudianteView.setProvincia(provincia);
        estudianteView.setDepartamento(departamento);
        estudianteView.setTelefono(telefono);
        estudianteView.setCarrera(carrera);
        estudianteView.setAñoIngreso(año);
        estudianteView.setSexo(sexoselect);

        int n = listaEstudiantes.size();
        for (int i = 0; i < n; i++) {
            Estudiante estudiante = listaEstudiantes.get(i);
            if (estudianteView.getDni().equals(estudiante.getDni())) {
                listaEstudiantes.set(i, estudianteView);
                break;
            }
        }
        
    }    
    
    
}
