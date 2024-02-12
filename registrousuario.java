package co.edu.uniminuto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author acosta
 */

public class registrousuario extends javax.swing.JFrame {
    
    String usu,pas;
        int sal,doc,idu;
        public static Nodo primero;
    public static Nodo ultimo;
    public static Nodo2 primero2;
    public static Nodo2 ultimo2;
    public static int tamano;
     public static int tamano2;
     
     static String t,m,c,p;
     String print;
     //double saldoinicial=0;
    //double saldofinal=0;
    //double saldoactual=0;
    //double saldonuevo=0;
    int cupostotal=15;
    double ingreso,descuento,cantcupos;
    double tarifa=4000;
    Date objDate = new Date(); 
    
        String contrasenaValida,contrasena,usuariovalido,usuario ;
        int cc=0;
	int id_uniminuto=0;
	String placa,color,marca;
	String placam,colorm,marcam;
	String valores,tipo;	
        String us,co;
        int ced,idum;        
     
        public static boolean ListaVacia() {
        return (primero == null);
    }
        public static boolean ListaVacia2() {
        return (primero2 == null);
    }
    public registrousuario() {
       
        
        
        initComponents();
        this.getContentPane().setBackground(Color.BLUE);
    }
       public void ingresousuario(String usuario, String contrasena,int cc, int id_uniminuto){
               
                usuario =txtusuario.getText();
		contrasena=String.valueOf(txtpass.getPassword());
		cc=Integer.parseInt(txtcc.getText());
		id_uniminuto=Integer.parseInt(txtid_unim.getText());
		
		
		JOptionPane.showMessageDialog(null,usuario ," ha sido Registrado",JOptionPane.INFORMATION_MESSAGE);
		
		contrasenaValida=contrasena;
		usuariovalido=usuario;
		
	    	 
	    	 if (ListaVacia2()) {
	             Nodo2 nuevo2 = new Nodo2(usuario, contrasena,cc,id_uniminuto);
	             primero2 = nuevo2;
	             ultimo2 = nuevo2;
	             nuevo2.siguiente2 = null;
	             nuevo2.anterior2 = null;

	         } else {
	             Nodo2 nuevo2 = new Nodo2(usuario, contrasena,cc,id_uniminuto);
	             ultimo2.siguiente2 = nuevo2;
	             nuevo2.anterior2 = ultimo2;
	             ultimo2 = nuevo2;
	             ultimo2.siguiente2 = null;
	         }
	         tamano2++;
                 bloquearregusua();
        }
       
    public void mostrarusua() {
                 
	    	        if (tamano2 != 0) {
	    	            Nodo2 temp = primero2;
	    	            String str2 = "";
	    	            while (temp != null) { 
	    	                str2 = "DATOS REGISTRADOS\n" +"USUARIO: : "+temp.usuario +"\nDOCUMENTO: "+temp.cc +"\nID UNIMINUTO: "+temp.id_uniminuto+"\n";
	    	                temp = temp.siguiente2;
	    	            }
                           jTextArea1.append("\n"+str2);                           
        
	    	        }
	    	    
	   	     }    
       public void verificausua () {
           usuario = JOptionPane.showInputDialog  (null,"USUARIO" );
           
           JPasswordField contrasena1 = new JPasswordField();
if(JOptionPane.showConfirmDialog(null, contrasena1, "Ingrese contraseña", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION){
               String contrasena = new String(contrasena1.getPassword());
               /*usuario = JOptionPane.showInputDialog  (null,"USUARIO" );
               contrasena = JOptionPane.showInputDialog  (null,"PASWORD" );*/
                    
					
	 if(usuariovalido.equals(usuario) && contrasenaValida.equals(contrasena))
		{
		 JOptionPane.showMessageDialog(null,"INGRESO CORRECTO ",usuario,JOptionPane.INFORMATION_MESSAGE);
                          
                 IngresoVehiculos R = new IngresoVehiculos();
                          R.setVisible(true);
                          this.dispose();
                          R.bloqueocupo();
	    	        }else{
             JOptionPane.showMessageDialog(null,"! Datos incorrectos !");
         }}
       }
       void bloquear(){           
           jBtnregistrar_vehi.setEnabled(false);
       }
       void desbloquearu(){           
           jBtnregistrar_us.setEnabled(true);
       }
       void desbloquear(){           
           jBtnregistrar_vehi.setEnabled(true);
       }
       void bloquearregusua(){           
           jBtnregistrar_us.setEnabled(false);
       }
        private void limpiar() {
        txtusuario.setText("");
        txtpass.setText("");
        txtcc.setText("");
        txtid_unim.setText("");
        txtusuario.requestFocus();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtusuario = new javax.swing.JTextField();
        txtcc = new javax.swing.JTextField();
        txtid_unim = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBtnregistrar_us = new javax.swing.JButton();
        jBtnregresar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jBtnregistrar_vehi = new javax.swing.JButton();
        txtpass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel1.setText("Usuario");

        jLabel2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel2.setText("PASSWORD");

        jLabel3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel3.setText("DOCUMENTO DE IDENTIDAD");

        jLabel4.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel4.setText("ID UNIMINUTO");

        jBtnregistrar_us.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jBtnregistrar_us.setText("REGISTRAR USUARIO");
        jBtnregistrar_us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnregistrar_usActionPerformed(evt);
            }
        });

        jBtnregresar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jBtnregresar.setText("REGRESAR");
        jBtnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnregresarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("REGISTRO DE USUARIO");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jBtnregistrar_vehi.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jBtnregistrar_vehi.setText("REGISTRAR VEHICULO");
        jBtnregistrar_vehi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnregistrar_vehiActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jButton1.setText("LIMPIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnregresar)
                        .addGap(94, 94, 94)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtusuario, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                    .addComponent(txtid_unim)
                                    .addComponent(txtcc)
                                    .addComponent(txtpass)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(jButton1)))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnregistrar_us)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnregistrar_vehi))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnregresar)
                    .addComponent(jLabel7))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(52, 52, 52))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnregistrar_vehi, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnregistrar_us)
                        .addGap(4, 4, 4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtid_unim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnregistrar_usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnregistrar_usActionPerformed
        /*String s=" ";
        s="\nUSUARIO: "+txtusuario.getText()+"\nDOCUMENTO: "+txtcc.getText()+"\nID UNIMINUTO: "+txtid_unim.getText();
        jTextArea1.append(s);*/ 
        ingresousuario(us,co,ced,idum);
        desbloquear();
        mostrarusua();
       
        
        
    }//GEN-LAST:event_jBtnregistrar_usActionPerformed

    private void jBtnregistrar_vehiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnregistrar_vehiActionPerformed
                 verificausua();
        
    }//GEN-LAST:event_jBtnregistrar_vehiActionPerformed

    private void jBtnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnregresarActionPerformed
        Parqueadero Regresar = new Parqueadero();
        Regresar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBtnregresarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         limpiar();
         bloquear();
         desbloquearu();
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_formPropertyChange

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(registrousuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrousuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrousuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrousuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrousuario().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnregistrar_us;
    private javax.swing.JButton jBtnregistrar_vehi;
    private javax.swing.JButton jBtnregresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtcc;
    private javax.swing.JTextField txtid_unim;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}

