/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dialogos;

import Conexion.ExeSql;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
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
import javax.swing.JDialog;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
//import jcifs.smb.NtlmPasswordAuthentication;
//import jcifs.smb.SmbFile;
//import jcifs.smb.SmbFileOutputStream;
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
 * @author informatica
 */
public class jdDescargaDocumentos extends javax.swing.JDialog {

   
    int puntero = 0;
    Date hoy = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    
    
    public jdDescargaDocumentos() {
        
       initComponents();
       
//        ExeSql Sql  = new ExeSql();
//        ResultSet Rs = null;
//        String Query = "SELECT correlativo FROM doc_mail ORDER BY correlativo DESC LIMIT 1";
//        try {
//            
//            Rs = Sql.Select(Query);
//             Rs.next();
//            puntero = Rs.getInt("correlativo");
//            System.out.println("EL CORRELATIVO ES : " +puntero);
//            
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(jdDescargaDocumentos.class.getName()).log(Level.SEVERE, null, ex);
//        }
//       
//        
//        
//        
//        Properties prop = new Properties();
//        prop.setProperty("mail.pop3.starttls.enable", "false");
//        prop.setProperty("mail.pop3.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//        prop.setProperty("mail.pop3.socketFactory.fallback", "true");
//        prop.setProperty("mail.pop3.port", "995");
//        prop.setProperty("mail.pop3.socketFactory.port", "995");
//        Session sesion = Session.getInstance(prop);
//        try
//        {
//            Store store = sesion.getStore("pop3");
//            store.connect("outlook.office365.com", "facturacion@luvaly.cl", "3Logica.");
//            
//            Folder carpeta = store.getFolder("Inbox");
//            carpeta.open(Folder.READ_ONLY);
//            
//            // Se obtienen los mensajes.
//            Message[] mensajes = carpeta.getMessages();
//            int numero = carpeta.getMessageCount();
//            System.out.println("LOS MENSAJES SON : " + numero);
//            
//            // Se escribe from y subject de cada mensaje
//            for (int i = 1; i < mensajes.length; i++)
//            {
//                
//                if(i > puntero){
//                    
//                    
//                    Date fecha2 = mensajes[i].getSentDate();
//                    
//                    String fecha3 = dateFormat.format(fecha2);
//                    String fecha1 = dateFormat.format(hoy);
//                    Date fec3 = dateFormat.parse(fecha3);
//                    Date fec1 = dateFormat.parse(fecha1);
//                    
//                    if (fec3.compareTo(fec1) == 0){
//                        
//                        System.out.println("CORREO N° " + i);
//                        System.out.println("From:" + mensajes[i].getFrom()[0].toString());
//                        System.out.println("Subject:" + mensajes[i].getSubject());
//                        System.out.println("Fecha envio:" + fecha2);
//                        System.out.println("Fecha de hoy:" + hoy+"\n");
//                        
//                        
//                        // Se visualiza el contenido de cada mensaje
//                        analizaMensaje(mensajes[i], fecha2,i);
//                        
//                    }
//                }
//                
//            }
//            
//            carpeta.close(false);
//            store.close();
//            
//         
//            System.out.println("Hecho!!");
//            jButton1.doClick();
//       
//            
//        }catch (Exception e){
//            
//            e.printStackTrace();
//            
//        }
//        
        
      
        
    }

    
    private void analizaMensaje(Part unaParte, Date fecha_msg,int num_msg)
    {
        try
        {
          // Si es multipart, se analiza cada una de sus partes recursivamente.
            if (unaParte.isMimeType("multipart/*"))
            {
                Multipart multi;
                multi = (Multipart) unaParte.getContent();

                for (int j = 0; j < multi.getCount(); j++)
                {
                    analizaMensaje(multi.getBodyPart(j),fecha_msg, num_msg);
                }
            }
            else
            {
              // Si no es texto, se solicita guardar archivo.
                if (!unaParte.isMimeType("text/*"))
                {
                    String parte = unaParte.getFileName().toString();
                    int numext = parte.length()-3;
                    String extension = parte.substring(numext);
                    
                    if (extension.equals("xml") || extension.equals("XML")){
                       
                        descargaXML(unaParte,num_msg);
                        
                        leeXML(parte,num_msg);
                       
                    }
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    
    private void descargaXML(Part unaParte,int numero) throws FileNotFoundException, MessagingException, IOException{
        
       //FileOutputStream fichero = new FileOutputStream("c:/temp/" + numero+"-"+unaParte.getFileName());
       FileOutputStream fichero = new FileOutputStream("http:////192.168.0.130:8012//FacturasACEPTA//adjuntos//" + numero+"-"+unaParte.getFileName());
  
        InputStream imagen = unaParte.getInputStream();
        byte[] bytes = new byte[1000];
        int leidos = 0;

        while ((leidos = imagen.read(bytes)) > 0)
        {
            fichero.write(bytes, 0, leidos);
        }
    }
    
    
    private void leeXML(String xFile, int numero){
    
       
        try {
            
            String mexnto = "";
            String mneto = "";
            String miva = "";
            
            String archivo = xFile;
            JespXML raiz = new JespXML("C://temp//"+numero+"-"+archivo);

            
            Tag tTag1 = raiz.leerXML();
            
            Tag tSetDTE = tTag1.getTagHijoByName("SetDTE");
            Tag tCaratula = tSetDTE.getTagHijoByName("Caratula");
            Tag tRutEmisor = tCaratula.getTagHijoByName("RutEmisor");
            
            Tag tDTE = tSetDTE.getTagHijoByName("DTE");
            Tag tDocumento = tDTE.getTagHijoByName("Documento");
            Tag tEncabezado = tDocumento.getTagHijoByName("Encabezado");
            
            Tag tIdDoc = tEncabezado.getTagHijoByName("IdDoc");
            Tag tTipoDTE = tIdDoc.getTagHijoByName("TipoDTE");
            Tag tFolio = tIdDoc.getTagHijoByName("Folio");
            Tag tFchEmis = tIdDoc.getTagHijoByName("FchEmis");
            
            
            Tag tTotales = tEncabezado.getTagHijoByName("Totales");
            
            
              
            System.out.println("\n"+"RUT EMISOR: "+tRutEmisor.getContenido());
            System.out.println("TIPO DOCUMENTO: "+tTipoDTE.getContenido());
            System.out.println("FOLIO : "+tFolio.getContenido());   
            System.out.println("FECHA EMISION : "+tFchEmis.getContenido());   
            
            if (tTipoDTE.getContenido().equals("33") || tTipoDTE.getContenido().equals("61")){
                
                Tag tMntNeto = tTotales.getTagHijoByName("MntNeto");
                Tag tIVA = tTotales.getTagHijoByName("IVA");
                
                mexnto = "0";
                mneto = tMntNeto.getContenido();
                miva = tIVA.getContenido();
                
                
                System.out.println("MONTO NETO   : "+tMntNeto.getContenido());   
                System.out.println("MONTO IVA   : "+tIVA.getContenido());   
            
            }else if(tTipoDTE.getContenido().equals("34")){
            
                Tag tMntExe = tTotales.getTagHijoByName("MntExe");
                
                mexnto = tMntExe.getContenido();
                mneto = "";
                miva = "";
                
                System.out.println("MONTO EXENTO   : "+tMntExe.getContenido());   
            
            }else{
            
               return;
            
            }
            
            Tag tMntTotal = tTotales.getTagHijoByName("MntTotal");
            System.out.println("MONTO TOTAL   : "+tMntTotal.getContenido()+"\n");   
            
            guardaDatos(tRutEmisor.getContenido(),tTipoDTE.getContenido(),tFolio.getContenido(),
                        tFchEmis.getContenido(),mexnto,mneto,miva,tMntTotal.getContenido(),numero);
            
            
            
            
        } catch (ParserConfigurationException | SAXException | IOException | TagHijoNotFoundException ex) {
            Logger.getLogger(jdDescargaDocumentos.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
    
    
    private void guardaDatos(String rut, String tipodoc, String numdoc,String fechaem,
                                    String exento, String neto, String iva, String total, int contador){
        
        
         ExeSql Sql  = new ExeSql();
        
        
        
          if (tipodoc == "33" || tipodoc == "34"){                 //Factura Proovedor afecta y exenta
               
                tipodoc = "FAP";          
 
            } else if (tipodoc == "61") {          //Nota de Crédito Proveedor

                tipodoc =  "NCP"; 
            }

            if (tipodoc == "FAP" || tipodoc == "NCP"){

                if (!rut.equals("76231391-K")){
   
                    try {
                        
                        Sql.ExeSql("INSERT INTO doc_mail(rut,tipdocto,nrodocto,femision,totalexento,totalafecto,totaliva,totaldocto,correlativo) \n"+
                                   "VALUES("+rut+","+tipodoc+","+numdoc+","+fechaem+","+exento+","+neto+","+iva+","+total+","+contador);
                        
                        
                        Sql.Commit();
                    
                    
                    
                    }catch (SQLException ex) {
                        Logger.getLogger(jdDescargaDocumentos.class.getName()).log(Level.SEVERE, null, ex);
                        Sql.Rollback();
                    }


                   
                } 


            }
        
    }
    
    
    //*******************************************************************************************************************************//
       public void subirXML(final String userName,final String password, final String sourcePath, final String destinationPath) throws IOException {
//
//            final String user = userName + ":" + password;
//            final NtlmPasswordAuthentication auth = new NtlmPasswordAuthentication(
//                    user);
//            final SmbFile sFile = new SmbFile(destinationPath, auth);
//            final SmbFileOutputStream smbFileOutputStream = new SmbFileOutputStream(
//                    sFile);
//            final FileInputStream fileInputStream = new FileInputStream(new File(
//                    sourcePath));
//
//            final byte[] buf = new byte[16 * 1024 * 1024];
//            int len;
//            while ((len = fileInputStream.read(buf)) > 0) {
//                smbFileOutputStream.write(buf, 0, len);
//            }
//            fileInputStream.close();
//            smbFileOutputStream.close();
        }
    


    
    
    
    //*************************************************************************************************************************
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Carga.gif"))); // NOI18N

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jButton1)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        System.out.println("Proceso Terminado!!");
        
        super.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(jdDescargaDocumentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jdDescargaDocumentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jdDescargaDocumentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jdDescargaDocumentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                jdDescargaDocumentos dialog = new jdDescargaDocumentos(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
                
                new jdDescargaDocumentos().setVisible(true);
                                  
                
            }
        });
        
           
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private void runOnUiThread(Runnable runnable) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
