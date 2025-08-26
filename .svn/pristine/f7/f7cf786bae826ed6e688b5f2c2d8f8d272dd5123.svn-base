
package PanelForm;

import Conexion.ExeSql;
import java.awt.Color;
import java.awt.Component;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Part;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import org.jespxml.excepciones.AtributoNotFoundException;
import org.jespxml.JespXML;
import org.jespxml.excepciones.TagHijoNotFoundException;
import org.jespxml.modelo.Tag;
import org.json.JSONObject;
import org.json.JSONException;
import org.json.XML;
import org.xml.sax.SAXException;


/**
 *
 * @author Roberto Lopez
 */
public class pfFacturasACEPTA extends javax.swing.JPanel {
    
   DefaultTableModel TModelo;
    
    public pfFacturasACEPTA() {          
        
        initComponents();
         TModelo = (DefaultTableModel) Grilla.getModel();
        
     }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Grilla = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1233, 660));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1233, 660));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos22/Cargar.png"))); // NOI18N
        jButton1.setText("Cargar Documentos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Grilla.setAutoCreateRowSorter(true);
        Grilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "RUT", "Provedor", "Tipo Doc.", "Num Doc.", "Fec. Emision", "Total Exento", "Total Afecto", "Total IVA", "Total Dcto.", "Correlativo", "Total CtaPrv.", "Documento", "Diferencia"
            }
        ));
        jScrollPane1.setViewportView(Grilla);
        if (Grilla.getColumnModel().getColumnCount() > 0) {
            Grilla.getColumnModel().getColumn(0).setMinWidth(70);
            Grilla.getColumnModel().getColumn(0).setPreferredWidth(70);
            Grilla.getColumnModel().getColumn(0).setMaxWidth(70);
            Grilla.getColumnModel().getColumn(1).setMinWidth(400);
            Grilla.getColumnModel().getColumn(1).setPreferredWidth(400);
            Grilla.getColumnModel().getColumn(1).setMaxWidth(400);
            Grilla.getColumnModel().getColumn(2).setMinWidth(70);
            Grilla.getColumnModel().getColumn(2).setPreferredWidth(70);
            Grilla.getColumnModel().getColumn(2).setMaxWidth(70);
            Grilla.getColumnModel().getColumn(3).setMinWidth(75);
            Grilla.getColumnModel().getColumn(3).setPreferredWidth(75);
            Grilla.getColumnModel().getColumn(3).setMaxWidth(75);
            Grilla.getColumnModel().getColumn(4).setMinWidth(80);
            Grilla.getColumnModel().getColumn(4).setPreferredWidth(80);
            Grilla.getColumnModel().getColumn(4).setMaxWidth(80);
            Grilla.getColumnModel().getColumn(5).setMinWidth(85);
            Grilla.getColumnModel().getColumn(5).setPreferredWidth(85);
            Grilla.getColumnModel().getColumn(5).setMaxWidth(85);
            Grilla.getColumnModel().getColumn(6).setMinWidth(85);
            Grilla.getColumnModel().getColumn(6).setPreferredWidth(85);
            Grilla.getColumnModel().getColumn(6).setMaxWidth(85);
            Grilla.getColumnModel().getColumn(7).setMinWidth(80);
            Grilla.getColumnModel().getColumn(7).setPreferredWidth(80);
            Grilla.getColumnModel().getColumn(7).setMaxWidth(80);
            Grilla.getColumnModel().getColumn(8).setMinWidth(85);
            Grilla.getColumnModel().getColumn(8).setPreferredWidth(85);
            Grilla.getColumnModel().getColumn(8).setMaxWidth(85);
            Grilla.getColumnModel().getColumn(9).setMinWidth(0);
            Grilla.getColumnModel().getColumn(9).setPreferredWidth(0);
            Grilla.getColumnModel().getColumn(9).setMaxWidth(0);
            Grilla.getColumnModel().getColumn(10).setMinWidth(85);
            Grilla.getColumnModel().getColumn(10).setPreferredWidth(85);
            Grilla.getColumnModel().getColumn(10).setMaxWidth(85);
            Grilla.getColumnModel().getColumn(11).setMinWidth(0);
            Grilla.getColumnModel().getColumn(11).setPreferredWidth(0);
            Grilla.getColumnModel().getColumn(11).setMaxWidth(0);
            Grilla.getColumnModel().getColumn(12).setMinWidth(70);
            Grilla.getColumnModel().getColumn(12).setPreferredWidth(70);
            Grilla.getColumnModel().getColumn(12).setMaxWidth(70);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Documentos Ingresados");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Documentos No Ingresados");

        jPanel5.setBackground(new java.awt.Color(255, 255, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(24, 16));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("0");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("0");
        jLabel2.setToolTipText("");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jButton1)
                        .addGap(374, 374, 374)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
       try {
           ExeSql Sql  = new ExeSql();
           ResultSet Rs;
           String total = "";
           String documento = "";
           int ingresadas = 0;
           int noingresadas = 0;
           double diferencia = 0;
           
           while(TModelo.getRowCount()>0){
               
               TModelo.removeRow(0);
           }
           
//           String Query = "SELECT * FROM doc_mail ORDER BY correlativo DESC";
           
           
           String Query = "SELECT p.nombre AS proveedor,dm.*, cp.rut AS rutemp,cp.nrodocto AS documento, cp.totaldocto AS Total \n"+
                          "FROM doc_mail dm \n"+
                          "LEFT JOIN ctacteprv cp ON dm.rut = cp.rut AND dm.nrodocto = cp.nrodocto \n"+
                          "LEFT JOIN proveedor p ON dm.rut = p.rut \n"+
                          "WHERE dm.tipdocto <> '0' \n"+
                          "AND dm.tipdocto IN ('FAP','NCP') \n"+
                          "ORDER BY dm.correlativo DESC";
           
           
           
           
           Rs = Sql.Select(Query);
           
           while(Rs.next()){
            
                if (Rs.getString("Total") == null){
                
                   total = "0"; 
                   diferencia = 0;
                
                }else {
                
                  total = Rs.getString("Total");
                  diferencia = Rs.getDouble("totaldocto") - Rs.getDouble("Total");
                
                }
                
                
                if (Rs.getString("documento") == null){
                
                   documento = ""; 
                   noingresadas++;
                
                }else {
                
                  documento = Rs.getString("documento");
                  ingresadas++;
                
                }
                
             
            
                TModelo.addRow(new Object[]{Rs.getString("rut"), 
                                   Rs.getString("proveedor"), 
                                   Rs.getString("tipdocto"),  
                                   Rs.getString("nrodocto"),     
                                   Rs.getString("femision"),
                                   Rs.getString("totalexento"),
                                   Rs.getString("totalafecto"),
                                   Rs.getString("totaliva"),
                                   Rs.getString("totaldocto"),
                                   Rs.getString("correlativo"),
                                   total,
                                   documento,
                                   diferencia
                                   
             
                }); 
               
               
               
            
            
            
            }
           Grilla.setDefaultRenderer(Object.class, new TableCellRendererFacturas());
           Grilla.repaint();
           
           jLabel1.setText(""+ingresadas);
           jLabel2.setText(""+noingresadas);
          
       } catch (SQLException ex) {
           Logger.getLogger(pfFacturasACEPTA.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public class TableCellRendererFacturas extends DefaultTableCellRenderer {
    
    private Component c;
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                
        c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //Para cambiar la fila 
        
        
        
        String documento = table.getValueAt(row, 11).toString();
        
        if(!documento.equals("")){
        
            c.setBackground(Color.green);
            c.setForeground(Color.black);
        
        }else if(documento.equals("")){
            c.setBackground(Color.yellow);
            c.setForeground(Color.black);
        }
        
        return c;
        
    }

}
   
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Grilla;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
