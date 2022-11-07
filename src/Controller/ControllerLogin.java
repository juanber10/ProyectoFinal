
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RJG-SERVER
 */
public class ControllerLogin {
    
    static Login view = new Login();

    static public void presentar() {
        view.setVisible(true);
    }

    static public void ocultar() {
        view.setVisible(false);
    }
    
    
    
    static public void evnSalir() {

        ocultar();
        System.exit(0);
    }
    
    
    static public void evnIngresar(){
        
        String user= "ADMIN"; //USUARIO DEFAULT
        String pass= "PASS";//PASSWORD DEFAULT
        
//        System.out.println(view.getTxtPass().getPassword());
        
        //COMPROBAMOS INGRESO 
        if (view.getTxtUsuario().getText().equals(user) 
                && view.getTxtPass().getText().equals(pass)) {
           ocultar();  
           Principal principal = new Principal();
        
            principal.setExtendedState(principal.MAXIMIZED_BOTH);
        
            principal.setVisible(true); 
            
        } else {
            JOptionPane.showMessageDialog(view,"Los datos ingresados son Incorrectos" 
                    ,"Acceso Denegado"
                    ,JOptionPane.ERROR_MESSAGE);
            
            System.out.println("Los datos ingresados son Incorrectos");
        }      
   
    };
    
    
}
