/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PanelForm;

import Conexion.ExeSql;
import Formularios.fmMain;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.logging.Level; 
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.write.WritableCellFormat;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.format.Alignment;


/**
 *
 * @author informatica
 */
public class pfPruebas extends javax.swing.JPanel {
    
    int Registros = 0;
    
    DefaultTableModel TableModel;
    public pfPruebas() {
        
        initComponents();
        
         TableModel = (DefaultTableModel) GrillaDet.getModel();
          
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btCargar = new javax.swing.JButton();
        RbParciales = new javax.swing.JRadioButton();
        RbPendientes = new javax.swing.JRadioButton();
        lbOrdenes = new javax.swing.JLabel();
        lbOCParciales = new javax.swing.JLabel();
        lbOCPendientes = new javax.swing.JLabel();
        btCargar1 = new javax.swing.JButton();
        lbRegistros = new javax.swing.JLabel();
        lbPOParciales = new javax.swing.JLabel();
        lbPOPendientes = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        GrillaDet = new javax.swing.JTable();

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos22/Cargar.png"))); // NOI18N
        btCargar.setText("CARGAR");
        btCargar.setEnabled(false);
        btCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCargarActionPerformed(evt);
            }
        });

        RbParciales.setText("Parciales");
        RbParciales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbParcialesActionPerformed(evt);
            }
        });

        RbPendientes.setText("Pendientes");
        RbPendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbPendientesActionPerformed(evt);
            }
        });

        lbOrdenes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbOrdenes.setText("Ordenes: 0");

        lbOCParciales.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbOCParciales.setText("Ordenes Parciales: 0");

        lbOCPendientes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbOCPendientes.setText("Ordenes Pendientes: 0");

        btCargar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos22/Cargar.png"))); // NOI18N
        btCargar1.setText("CARGAR1");
        btCargar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCargar1ActionPerformed(evt);
            }
        });

        lbRegistros.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbRegistros.setText("Total Productos : 0");

        lbPOParciales.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbPOParciales.setText("Productos Parciales    : 0");

        lbPOPendientes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbPOPendientes.setText("Productos Pendientes: 0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RbParciales)
                    .addComponent(RbPendientes))
                .addGap(410, 410, 410)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbOrdenes)
                    .addComponent(lbOCParciales)
                    .addComponent(lbOCPendientes))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbPOParciales, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(lbPOPendientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(btCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btCargar1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RbParciales)
                            .addComponent(lbOrdenes)
                            .addComponent(lbRegistros))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RbPendientes)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbOCParciales)
                                    .addComponent(lbPOParciales))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbOCPendientes)
                                    .addComponent(lbPOPendientes)))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btCargar)
                        .addComponent(btCargar1)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("RESUMEN PAGOS");

        GrillaDet.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        GrillaDet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Sku", "Nombre", "Orden", "Solicitado", "Separado", "Despachado", "Diferencia", "OC Cliente", "Stock", "OC Proveedor", "Fecha OCP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(GrillaDet);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void btCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCargarActionPerformed
        
        try {
            ExeSql Sql = new ExeSql();
            
            ResultSet Rs;
            
            String Query;
            
            String rut = "";
            String codigo_oc = "";
            String orden = "";
            
            Registros = 0;
            int Completa=0;
            int ContCompleta=0; 
            int cont_parcial = 0;
            int cont_pend = 0;
            
            int fila = 0;
            
            while(TableModel.getRowCount()>0){
            
               TableModel.removeRow(0);
            }
            
            Query = "select o.rut,trim(c.nombre) as nombre,CAST(o.codigo_oc as varchar) || '-' || o.orden as orden, cast(o.femision as date) as femision, EXTRACT( day from current_date-o.femision) as dias,\n"
                    + "case o.estado when 0 then 'Pendiente' when 1 then 'Parcial' else 'Completo' end as Despacho,\n"
                    + "case o.estadodespacho when 0 then 'Pendiente' when 1 then 'Separando' else 'Cerrado' end as Bodega,\n"
                    + "sum(d.cantidad) = sum(d.separado + d.despachado) as EsCompleta, \n"
                    + "sum(d.cantidad) as solicitado,sum(d.separado) as separado,sum(d.despachado) as despachado,sum(d.facturado) as facturado,o.codigo_oc,o.orden as ordenreal, o.ubicacion, o.es_transporte\n"
                    + "\n"
                    + "from occh o\n"
                    + "left join occhdet d on o.rut=d.rut and o.codigo_oc=d.codigo_oc and o.orden=d.orden\n"
                    + "left join cliente c on c.rut=o.rut\n"
                    + "where o.estado in (0,1)\n"
                    + "group by o.rut,o.codigo_oc,o.orden, o.femision, o.femision, c.nombre\n"
                    + "order by dias desc";
            
            
            
            Rs = Sql.Select(Query);
                      
            
            while(Rs.next()){
                
                if(Rs.getDouble("solicitado")==Rs.getDouble("separado")+ Rs.getDouble("despachado")){
            
                  Completa=2;
                    
                }else if(Rs.getDouble("separado")>0){
                    
                   Completa=1;
                    
                }else{
                 
                  Completa = 0;
                    
                }
                
                if (Completa == 0 || Completa==1){
                    
                    
                    if (Completa == 0){
                    
                       cont_pend++; 
                    
                    }else if (Completa == 1){
                    
                       cont_parcial++; 
                    
                    }
                  
                   ContCompleta++;
              
                   rut = Rs.getString("rut");
                   codigo_oc = Rs.getString("codigo_oc");
                   orden = Rs.getString("ordenreal");
               
                   System.out.println(rut+" - "+codigo_oc+" - "+orden+" = "+fila);
               
                   CargaDetalle(rut,codigo_oc,orden);  
               
                    fila++;
            
               }
               
               
          } 
           
          
            
          lbOrdenes.setText("Total Ordenes: " +  ContCompleta);  
          lbOCParciales.setText("Ordenes Parciales: " + cont_parcial); 
          lbOCPendientes.setText("Ordenes Pendientes: " + cont_pend);   
          lbRegistros.setText("Total Registros : " + Registros);   
            
        } catch (SQLException ex) {
            Logger.getLogger(pfPruebas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_btCargarActionPerformed

    
    private void CargaDetalle(String rut, String oc, String orden){
        
          ExeSql Sql = new ExeSql();
          ResultSet Rs;
          

          try {
             
              
              Rs = Sql.Select("SELECT d.sku,p.nombre, d.codigo_oc,d.orden,d.cantidad, d.separado, d.despachado,d.facturado\n" +
                              "FROM occhdet d \n"+
                              "left join producto p on d.sku=p.sku\n" +
                              "where d.rut="+ rut +" \n" +
                              "and d.codigo_oc="+ oc +" \n" +
                              "and d.orden='" + orden + "'");
                     
              
              while(Rs.next()){
                
                
                TableModel.addRow(new Object[]{
                    Rs.getString("sku"),
                    Rs.getString("nombre"),
                    Rs.getString("codigo_oc")+"-"+Rs.getString("orden"),
                    fmMain.FormatoNumero(Rs.getDouble("cantidad")),
                    fmMain.FormatoNumero(Rs.getDouble("separado")),
                    fmMain.FormatoNumero(Rs.getDouble("despachado"))
                    
                    });
                
                    Registros++;
                
                    
            }
              
          } catch (Exception e) {
              System.out.println(e);
          } finally{
              Sql.Close();
          }
                  
        
    }
    
    
    
    
    private void RbParcialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbParcialesActionPerformed
       if(RbParciales.isSelected()){
            
          RbPendientes.setSelected(false);
        }        
    }//GEN-LAST:event_RbParcialesActionPerformed

    private void RbPendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbPendientesActionPerformed
        if(RbPendientes.isSelected()){
            
          RbParciales.setSelected(false);
        }        
    }//GEN-LAST:event_RbPendientesActionPerformed

    private void btCargar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCargar1ActionPerformed
       
        try {
            ExeSql Sql = new ExeSql();
            
            ResultSet Rs;
            
            String Query;
            String nueva_orden = "";
            
            String rut = "";
            String codigo_oc = "";
            String orden = "";
            
            int Completa=0;
            int ContCompleta=0;
            int ord_parcial = 0;
            int ord_pend = 0;
            
            int cont_parcial = 0;
            int cont_pend = 0;
                  
            while(TableModel.getRowCount()>0){
            
               TableModel.removeRow(0);
            }
            
            Query = "select \n"
                  + "d.rut,"
                  + "d.sku,"
                  + "p.nombre,"
                  + "d.codigo_oc,"
                  + "d.orden,\n"
                  + "d.cantidad as solicitado,"
                  + "d.separado,"
                  + "d.despachado,"
                  + "d.facturado \n"
                  + "from occhdet d\n"
                  + "left join occh o on d.rut=o.rut and d.codigo_oc=o.codigo_oc and d.orden=o.orden\n"
                  + "left join cliente c on c.rut=d.rut\n"
                  + "left join producto p on p.sku=d.sku\n"
                  + "where o.estado in (0,1)\n"
                  + "order by d.codigo_oc, d.orden desc";
      
            
            Rs = Sql.Select(Query);
                      
            
            while(Rs.next()){
                
               
                if(Rs.getDouble("solicitado")==Rs.getDouble("separado")+ Rs.getDouble("despachado")){
            
                  Completa=2;
                    
                }else if(Rs.getDouble("separado")>0){
                    
                   Completa=1;
                    
                 
                }else{
                  
                    Completa = 0;
                    
                }
                
//                if (Completa == 0 || Completa==1){
                    
                    
                if (Completa == 0){
                    
                    cont_pend++; 
                    
                }else if (Completa == 1){
                    
                    cont_parcial++; 
                    
                }
                  
                  
                if (Completa != 2){ 
                   
                    rut = Rs.getString("rut");
                    codigo_oc = Rs.getString("codigo_oc");
                    orden = Rs.getString("orden");
               
                    if (!nueva_orden.equals(Rs.getString("codigo_oc")+"-"+Rs.getString("orden"))) {
                   
                        nueva_orden = Rs.getString("codigo_oc")+"-"+Rs.getString("orden");
                          
                        if (Completa == 0){
                    
                           ord_pend++; 
                    
                        }else if (Completa == 1){
                    
                          ord_parcial++; 
                    
                        }
                          
                        ContCompleta++;
//                      System.out.println(rut+" - "+nueva_orden+" - "+ContCompleta);
                   
                    }
                   
//                  System.out.println(rut+" - "+nueva_orden+" - "+Rs.getString("sku"));
                   
                   
                    TableModel.addRow(new Object[]{
                        Rs.getString("sku"),
                        Rs.getString("nombre"),
                        Rs.getString("codigo_oc")+"-"+Rs.getString("orden"),
                        fmMain.FormatoNumero(Rs.getDouble("solicitado")),
                        fmMain.FormatoNumero(Rs.getDouble("separado")),
                        fmMain.FormatoNumero(Rs.getDouble("despachado"))
                    
                    });
                    
                   
                    Registros++;
                 }   
               
//                   CargaDetalle(rut,codigo_oc,orden);  
          
//            
//               }
               
                
          } 
           
          
            
          lbOrdenes.setText("Total Ordenes: " +  ContCompleta);  
          lbOCParciales.setText("Ordenes Parciales: " + ord_parcial); 
          lbOCPendientes.setText("Ordenes Pendientes: " + ord_pend);   
          lbRegistros.setText("Total Productos : " + Registros);   
          lbPOParciales.setText("Productos Parciales: " + cont_parcial); 
          lbPOPendientes.setText("Productos Pendientes: " + cont_pend);   
          
          
          
            
        } catch (SQLException ex) {
            Logger.getLogger(pfPruebas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btCargar1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable GrillaDet;
    private javax.swing.JRadioButton RbParciales;
    private javax.swing.JRadioButton RbPendientes;
    public javax.swing.JButton btCargar;
    public javax.swing.JButton btCargar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbOCParciales;
    private javax.swing.JLabel lbOCPendientes;
    private javax.swing.JLabel lbOrdenes;
    private javax.swing.JLabel lbPOParciales;
    private javax.swing.JLabel lbPOPendientes;
    private javax.swing.JLabel lbRegistros;
    // End of variables declaration//GEN-END:variables
}
