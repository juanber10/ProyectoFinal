
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author RJG-SERVER
 */
public class Lista extends javax.swing.JPanel {

    /**
     * Creates new form Lista
     */
    public Lista() {
        initComponents();
        listarEstudiantes();          
    }
    
        public void listarEstudiantes(){
        int cantidadEstu = ControllerEstudiante.listaEstudiantes.size();
        DefaultTableModel modelo = (DefaultTableModel) tblEstudiantes.getModel();        
        String[] datos = new String[6];
        for(int i=0;i<cantidadEstu;i++){
            datos[0]=ControllerEstudiante.listaEstudiantes.get(i).getDni();
            datos[1]=ControllerEstudiante.listaEstudiantes.get(i).getNombre();
            datos[2]=ControllerEstudiante.listaEstudiantes.get(i).getDomicilio();
            datos[3]=ControllerEstudiante.listaEstudiantes.get(i).getFechaNac();
            datos[4]=ControllerEstudiante.listaEstudiantes.get(i).getCarrera();
            datos[5]= String.valueOf(ControllerEstudiante.listaEstudiantes.get(i).getAñoIngreso());
            modelo.addRow(datos);            
        }      
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEstudiantes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(930, 520));
        setPreferredSize(new java.awt.Dimension(930, 520));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tblEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Nombre y Apellido", "Domicilio", "Fecha de Nac", "Carrera", "Año "
            }
        ));
        jScrollPane1.setViewportView(tblEstudiantes);

        jLabel1.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        jLabel1.setText("Listado de Estudiantes registrados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 177, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 850, 530));
    }// </editor-fold>//GEN-END:initComponents

    public JTable getTblEstudiantes() {
        return tblEstudiantes;
    }

    public void setTblEstudiantes(JTable tblEstudiantes) {
        this.tblEstudiantes = tblEstudiantes;
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEstudiantes;
    // End of variables declaration//GEN-END:variables
}
