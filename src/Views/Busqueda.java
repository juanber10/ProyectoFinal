

import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author RJG-SERVER
 */
public class Busqueda extends javax.swing.JPanel {

    /**
     * Creates new form Busqueda
     */
    public Busqueda() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtNomyApe = new javax.swing.JTextField();
        txtFechaNac = new javax.swing.JTextField();
        txtLugNac = new javax.swing.JTextField();
        txtDom = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDpto = new javax.swing.JTextField();
        txtAño = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        txtProvincia = new javax.swing.JTextField();
        txtCarrera = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnConsultar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(930, 520));
        setPreferredSize(new java.awt.Dimension(930, 520));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(930, 520));

        jLabel1.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        jLabel1.setText("Consulta de Estudiantes");

        txtDni.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingrese el DNI (solo numeros)"));

        txtNomyApe.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre y Apellido"));

        txtFechaNac.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha de Nacimiento"));

        txtLugNac.setBorder(javax.swing.BorderFactory.createTitledBorder("Lugar de Nacimiento"));

        txtDom.setBorder(javax.swing.BorderFactory.createTitledBorder("Domicilio Actual"));

        txtTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefono"));

        txtDpto.setBorder(javax.swing.BorderFactory.createTitledBorder("Departamento"));

        txtAño.setBorder(javax.swing.BorderFactory.createTitledBorder("Año"));

        txtSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo"));

        txtProvincia.setBorder(javax.swing.BorderFactory.createTitledBorder("Provincia"));

        txtCarrera.setBorder(javax.swing.BorderFactory.createTitledBorder("Carrera"));

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Edit.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(txtDni, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConsultar)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtProvincia)
                                    .addComponent(txtDom)
                                    .addComponent(txtLugNac)
                                    .addComponent(txtNomyApe)
                                    .addComponent(txtCarrera))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFechaNac)
                                    .addComponent(txtTelefono)
                                    .addComponent(txtSexo)
                                    .addComponent(txtDpto)
                                    .addComponent(txtAño))))))
                .addGap(210, 210, 210))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(btnModificar)
                .addGap(212, 212, 212)
                .addComponent(btnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar))
                .addGap(17, 17, 17)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomyApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLugNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDpto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addGap(44, 44, 44))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    public void settearAtrtributos(){
        txtDni.setText("");
        txtNomyApe.setText("");
        txtDom.setText("");
        txtFechaNac.setText("");
        txtLugNac.setText("");
        txtProvincia.setText("");
        txtDpto.setText("");
        txtSexo.setText("");
        txtTelefono.setText("");
        txtCarrera.setText("");
        txtAño.setText("");
    
    };   
    
    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        txtNomyApe.setText("");
        txtDom.setText("");
        txtFechaNac.setText("");
        txtLugNac.setText("");
        txtProvincia.setText("");
        txtDpto.setText("");
        txtSexo.setText("");
        txtTelefono.setText("");
        txtCarrera.setText("");
        txtAño.setText("");

        if (!txtDni.getText().isEmpty()) {
            try {
                String dniCosulta = txtDni.getText();
                Estudiante estudiante = ControllerEstudiante.obtenerAlumnoPorDni(dniCosulta);
                if (estudiante != null) {
                    txtNomyApe.setText(estudiante.getNombre());
                    txtDom.setText(estudiante.getDomicilio());
                    txtFechaNac.setText(estudiante.getFechaNac());
                    txtLugNac.setText(estudiante.getLugarNac());
                    txtProvincia.setText(estudiante.getProvincia());
                    txtDpto.setText(estudiante.getDepartamento());
                    txtSexo.setText(estudiante.getSexo());
                    txtTelefono.setText(String.valueOf(estudiante.getTelefono()));
                    txtCarrera.setText(estudiante.getCarrera());
                    txtAño.setText(String.valueOf(estudiante.getAñoIngreso()));                    
                    
                } else {
                    JOptionPane.showMessageDialog(null, "No existe el Estudiante con ese Dni");
                }
            } catch (NumberFormatException | HeadlessException ex) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número válido");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe Ingresar el DNI del Estudiante a Consultar");
        }
         
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       
    ControllerEstudiante.evnBaja(txtDni.getText());       
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
       
       
         String dni = txtDni.getText();
         String nombre = txtNomyApe.getText();       
         String domicilio = txtDom.getText();
         String fechaNac = txtFechaNac.getText();
         String lugarNac = txtLugNac.getText();
         String provincia = txtProvincia.getText();
         String departamento = txtDpto.getText();
         String telefono = txtTelefono.getText();
         String carrera = txtCarrera.getText();
         String año = txtAño.getText() ;
         String sexoselect = txtSexo.getText();

         System.out.println("el nombre es: "+nombre);
         
        Estudiante estudianteView = new Estudiante();              
        
        estudianteView.setNombre(nombre);
        estudianteView.setDni(dni);
        estudianteView.setDomicilio(domicilio);
        estudianteView.setFechaNac(fechaNac);
        estudianteView.setLugarNac(lugarNac);
        estudianteView.setProvincia(provincia);
        estudianteView.setDepartamento(departamento);
        estudianteView.setTelefono(telefono);
        estudianteView.setCarrera(carrera);
        estudianteView.setAñoIngreso(año);
        estudianteView.setSexo(sexoselect);
       
       ControllerEstudiante.evnModificacion(estudianteView);
       
       
       
    }//GEN-LAST:event_btnModificarActionPerformed

    public JTextField getTxtAño() {
        return txtAño;
    }

    public void setTxtAño(JTextField txtAño) {
        this.txtAño = txtAño;
    }

    public JTextField getTxtCarrera() {
        return txtCarrera;
    }

    public void setTxtCarrera(JTextField txtCarrera) {
        this.txtCarrera = txtCarrera;
    }

    public JTextField getTxtDni() {
        return txtDni;
    }

    public void setTxtDni(JTextField txtDni) {
        this.txtDni = txtDni;
    }

    public JTextField getTxtDom() {
        return txtDom;
    }

    public void setTxtDom(JTextField txtDom) {
        this.txtDom = txtDom;
    }

    public JTextField getTxtDpto() {
        return txtDpto;
    }

    public void setTxtDpto(JTextField txtDpto) {
        this.txtDpto = txtDpto;
    }

    public JTextField getTxtFechaNac() {
        return txtFechaNac;
    }

    public void setTxtFechaNac(JTextField txtFechaNac) {
        this.txtFechaNac = txtFechaNac;
    }

    public JTextField getTxtLugNac() {
        return txtLugNac;
    }

    public void setTxtLugNac(JTextField txtLugNac) {
        this.txtLugNac = txtLugNac;
    }

    public JTextField getTxtNomyApe() {
        return txtNomyApe;
    }

    public void setTxtNomyApe(JTextField txtNomyApe) {
        this.txtNomyApe = txtNomyApe;
    }

    public JTextField getTxtProvincia() {
        return txtProvincia;
    }

    public void setTxtProvincia(JTextField txtProvincia) {
        this.txtProvincia = txtProvincia;
    }

    public JTextField getTxtSexo() {
        return txtSexo;
    }

    public void setTxtSexo(JTextField txtSexo) {
        this.txtSexo = txtSexo;
    }

    public JTextField getTxtTelefono() {
        return txtTelefono;
    }

    public void setTxtTelefono(JTextField txtTelefono) {
        this.txtTelefono = txtTelefono;
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtCarrera;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtDom;
    private javax.swing.JTextField txtDpto;
    private javax.swing.JTextField txtFechaNac;
    private javax.swing.JTextField txtLugNac;
    private javax.swing.JTextField txtNomyApe;
    private javax.swing.JTextField txtProvincia;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
