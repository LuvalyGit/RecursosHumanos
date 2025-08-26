
package Dialogos;

import Conexion.ExeSql;
import Formularios.fmMain;
import static Formularios.fmMain.intNivelUsuario;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Cdiaz  / Roberto Lopez
 */
public class jdCierreSueldos extends javax.swing.JDialog {
    //boolean cerrado=false;
    
    public jdCierreSueldos(java.awt.Frame parent, boolean modal) {
    
        super(parent, modal);
        initComponents();
        Calendar c = Calendar.getInstance();
        cbAgnoCierre.setSelectedItem(Integer.toString(c.get(Calendar.YEAR))); 
        cbMesCierre.setSelectedIndex((c.get(Calendar.MONTH))); 
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCancelar = new javax.swing.JButton();
        btCerrarPeriodo = new javax.swing.JButton();
        cbAgnoCierre = new javax.swing.JComboBox<String>();
        cbMesCierre = new javax.swing.JComboBox<String>();
        btReabrir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(null);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Exit.png"))); // NOI18N
        btCancelar.setText("Salir");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btCerrarPeriodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lock.png"))); // NOI18N
        btCerrarPeriodo.setText("Cerrar Periodo");
        btCerrarPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrarPeriodoActionPerformed(evt);
            }
        });

        cbAgnoCierre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        cbAgnoCierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAgnoCierreActionPerformed(evt);
            }
        });

        cbMesCierre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cbMesCierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMesCierreActionPerformed(evt);
            }
        });

        btReabrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/unlock.png"))); // NOI18N
        btReabrir.setText("Reabrir Periodo");
        btReabrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReabrirActionPerformed(evt);
            }
        });

        jLabel1.setText("SELECCIONE AÑO");

        jLabel2.setText("SELECCIONE MES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbMesCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbAgnoCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btReabrir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                        .addComponent(btCerrarPeriodo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbAgnoCierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMesCierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addComponent(btCerrarPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btReabrir, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCerrarPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarPeriodoActionPerformed
        
        ExeSql  Sql = new ExeSql();
//        ExeSql  Sql2 = new ExeSql();
        
        if(fmMain.OkCancel("¿Desea cerrar las remuneraciones de "+cbMesCierre.getSelectedItem()+" de "+cbAgnoCierre.getSelectedItem()+"?")== JOptionPane.OK_OPTION){
            
            try{
          
                Sql.ExeSql("UPDATE psueldosdet SET estado="+false+"\n" +
                           "WHERE agno="+cbAgnoCierre.getSelectedItem().toString().trim()+ "\n"+
                           "AND mes=" +(cbMesCierre.getSelectedIndex()+1));
                                  
                Sql.Commit();
               
                Sql.ExeSql("UPDATE bono_comision SET estado='cerrado' \n" +
                           "WHERE agno="+cbAgnoCierre.getSelectedItem().toString().trim()+ "\n"+
                           "AND mes=" +(cbMesCierre.getSelectedIndex()+1));
                                  
                Sql.Commit();
               
                JOptionPane.showMessageDialog(null, "Periodo cerrado con exito");
            
                //Esta
                
            }catch (SQLException | HeadlessException e) {
            
                Sql.Rollback();
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            
            }finally{
            
                Sql.Close();
                // RevisaMes();
           }
        }
    }//GEN-LAST:event_btCerrarPeriodoActionPerformed
    
    private void cbAgnoCierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAgnoCierreActionPerformed
            //RevisaMes();
    }//GEN-LAST:event_cbAgnoCierreActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //RevisaMes();
    }//GEN-LAST:event_formWindowActivated

    private void cbMesCierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMesCierreActionPerformed
       // RevisaMes();
    }//GEN-LAST:event_cbMesCierreActionPerformed

    private void btReabrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReabrirActionPerformed
        
        ExeSql  Sql = new ExeSql();
                       
        intNivelUsuario = fmMain.trae_nivel(fmMain.GetUsuario());
        
        //if (( intNivelUsuario < 100) || (intNivelUsuario<=80 )){
        if (( intNivelUsuario < 100)){    
           
           fmMain.Mensaje("Usuario: " + fmMain.GetUsuario() + " no está autorizado") ;
           return;
        
        }
        
        if(fmMain.OkCancel("¿Desea Reabrir las remuneraciones de "+cbMesCierre.getSelectedItem()+" de "+cbAgnoCierre.getSelectedItem()+"?")== JOptionPane.OK_OPTION){
           
           try{
               Sql.ExeSql("UPDATE psueldosdet SET estado="+true+" \n" +
                          "WHERE agno="+cbAgnoCierre.getSelectedItem().toString().trim()+ " \n"+
                          "AND mes=" +(cbMesCierre.getSelectedIndex()+1));
                                  
               Sql.Commit();
               JOptionPane.showMessageDialog(null, "Periodo Reabierto con exito");
            
           }catch (SQLException | HeadlessException e) {
                
                Sql.Rollback();
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
           
           }finally{
           
               Sql.Close();
                // RevisaMes();
           }
        }
    }//GEN-LAST:event_btReabrirActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(jdCierreSueldos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jdCierreSueldos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jdCierreSueldos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jdCierreSueldos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                jdCierreSueldos dialog = new jdCierreSueldos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btCerrarPeriodo;
    private javax.swing.JButton btReabrir;
    private javax.swing.JComboBox<String> cbAgnoCierre;
    private javax.swing.JComboBox<String> cbMesCierre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
