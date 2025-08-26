package Dialogos;

import Conexion.ExeSql;
import Formularios.fmMain;
import PanelForm.pfGastosSueldos;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author informatica (Roberto Lopez)
 */
public class jdBuscaSii extends javax.swing.JDialog {
   
    public static String rango1,rango21,rango22,rango31,rango32,rango41,rango42,rango51,rango52,rango61,rango62,rango71,rango72,rango81 = "";
    public static String srango1,srango21,srango22,srango31,srango32,srango41,srango42,srango51,srango52,srango61,srango62,srango71,srango72,srango81 = "";
    public static double drango1,drango21,drango22,drango31,drango32,drango41,drango42,drango51,drango52,drango61,drango62,drango71,drango72,drango81 = 0.0;
    public static String fact2,fact3,fact4,fact5,fact6,fact7,fact8 = "";
    public static String sfact2,sfact3,sfact4,sfact5,sfact6,sfact7,sfact8 = "";
    public static double dfact2,dfact3,dfact4,dfact5,dfact6,dfact7,dfact8 = 0.0;
    public static String dif2,dif3,dif4,dif5,dif6,dif7,dif8 = "";
    public static String sdif2,sdif3,sdif4,sdif5,sdif6,sdif7,sdif8 = "";
    public static double ddif2,ddif3,ddif4,ddif5,ddif6,ddif7,ddif8 = 0.0;
    
    public static int iagno2 = 0;
    public static int imes2 = 0;
    public static int cont = 1;
    
    public static double valor = 0;
    public static String nombre, codigo = "";
   
    public jdBuscaSii() throws IOException{
   
        ExeSql Sql = new ExeSql();
        ResultSet Rs = null;
        
        
        try {
            
            Rs = Sql.Select("SELECT * FROM indicadores WHERE nombre IN ('IMPUESTO_FACTOR','IMPUESTO_RANGO','IMPUESTO_REBAJA')");
            
            if(Sql.GetRowCount()>0){
                
                while (Rs.next()){
                    
                    codigo = Rs.getString("codigo");
                    nombre = Rs.getString("nombre");
                   
                    String monto = Rs.getString("valor").trim();
              
                    
                    if (codigo.equals("IMP_1_1")){
                        
                        rango1 = monto;
                    
                    }
                    
                    if (codigo.equals("IMP_2_0")){
                        
                        rango21 = monto;
                    
                    }
                    
                    if (codigo.equals("IMP_2_1")){
                    
                        rango22 = monto;
                    
                    }
                    
                    if (codigo.equals("FAC_2")){
                    
                        fact2 = monto;
                    
                    }
                    
                    if (codigo.equals("REB_2")){
                    
                        dif2 = monto;
                    
                    }
                    
                    if (codigo.equals("IMP_3_0")){
                    
                       rango31 = monto;
           
                    }
                    
                    
                    if (codigo.equals("IMP_3_1")){
                    
                        rango32 = monto;
                    
                    }
                    
                    
                    if (codigo.equals("FAC_3")){
                    
                        fact3 = monto;
                    
                    }
                    
                    if (codigo.equals("REB_3")){
                    
                       dif3 = monto;
                      
                    }
                    
                    if (codigo.equals("IMP_4_0")){
                    
                        rango41 = monto;
                    
                    }
                    
                    if (codigo.equals("IMP_4_1")){
                    
                        rango42 = monto;
                    
                    }
                    
                    if (codigo.equals("FAC_4")){
                    
                       fact4 = monto;
                    
                    }
                    
                    if (codigo.equals("REB_4")){
                    
                       dif4 = monto;
                    
                    }
                    
                    if (codigo.equals("IMP_5_0")){
                    
                        rango51 = monto;
                    
                    }
                    
                    
                    if (codigo.equals("IMP_5_1")){
                        
                        rango52 = monto;
                    }
                    
                    if (codigo.equals("FAC_5")){
                    
                        fact5 = monto;
                    
                    }
                    
                    if (codigo.equals("REB_5")){
                    
                        dif5 = monto;
                    
                    }
                    
                    if (codigo.equals("IMP_6_0")){
                    
                         rango61 = monto;
                    
                    }
                    
                    
                    if (codigo.equals("IMP_6_1")){
                    
                       rango62 = monto;
                    
                    }
                    
                    
                    if (codigo.equals("FAC_6")){
                    
                       fact6 = monto;
                    
                    }
                    
                    if (codigo.equals("REB_6")){
                    
                       dif6 = monto;
                    
                    }
                    
                    
                    if (codigo.equals("IMP_7_0")){
                    
                        rango71 = monto;
                    
                    }
                    
                    
                    if (codigo.equals("IMP_7_1")){
                     
                       rango72 = monto;
                    
                    }
                    
                    
                    if (codigo.equals("FAC_7")){
                    
                          fact7 = monto;
                    
                    }
                    if (codigo.equals("REB_7")){
                    
                        dif7 = monto;
                    
                    }
                    
                    
                    if (codigo.equals("IMP_8_0")){
                    
                      rango81 = monto;
                      
                    
                    }
                    
                    
                    if (codigo.equals("FAC_8")){
                    
                      fact8 = monto;
                       
                    
                    }
                    
                    if (codigo.equals("REB_8")){
                        
                        dif8 = monto;
                    
                    }
                
                }
            
           
                
            }
            
           
        drango1 = Double.parseDouble(rango1);
        drango21 = Double.parseDouble(rango21);
        drango22 = Double.parseDouble(rango22);
        drango31 = Double.parseDouble(rango31);
        drango32 = Double.parseDouble(rango32);
        drango41 = Double.parseDouble(rango41);
        drango42 = Double.parseDouble(rango42);
        drango51 = Double.parseDouble(rango51);
        drango52 = Double.parseDouble(rango52);
        drango61 = Double.parseDouble(rango61);
        drango62 = Double.parseDouble(rango62);
        drango71 = Double.parseDouble(rango71);
        drango72 = Double.parseDouble(rango72);
        drango81 = Double.parseDouble(rango81);
        
        
       
        ddif2 = Double.parseDouble(dif2);
        ddif3 = Double.parseDouble(dif3);
        ddif4 = Double.parseDouble(dif4);
        ddif5 = Double.parseDouble(dif5);
        ddif6 = Double.parseDouble(dif6);
        ddif7 = Double.parseDouble(dif7);    
        ddif8 = Double.parseDouble(dif8);    
      
        dfact2 = Double.parseDouble(fact2);
        dfact3 = Double.parseDouble(fact3);
        dfact4 = Double.parseDouble(fact4);
        dfact5 = Double.parseDouble(fact5);
        dfact6 = Double.parseDouble(fact6);
        dfact7 = Double.parseDouble(fact7);
        dfact8 = Double.parseDouble(fact8);
        
        
        System.out.print(""+drango1+"\n");
        
        System.out.print(""+drango21+"\n");
        System.out.print(""+drango22+"\n");
        System.out.print(""+dfact2+"\n");
        System.out.print(""+ddif2+"\n\n\n");
//        
        System.out.print(""+drango31+"\n");
        System.out.print(""+drango32+"\n");
        System.out.print(""+dfact3+"\n");
        System.out.print(""+ddif3+"\n\n\n");
       
        System.out.print(""+drango41+"\n");
        System.out.print(""+drango42+"\n");
        System.out.print(""+dfact4+"\n");
        System.out.print(""+ddif4+"\n\n\n");
        
        System.out.print(""+drango51+"\n");
        System.out.print(""+drango52+"\n");
        System.out.print(""+dfact5+"\n");
        System.out.print(""+ddif5+"\n\n\n");
        
        System.out.print(""+drango61+"\n");
        System.out.print(""+drango62+"\n");
        System.out.print(""+dfact6+"\n");
        System.out.print(""+ddif6+"\n\n\n");
        
        System.out.print(""+drango71+"\n");
        System.out.print(""+dfact7+"\n");
        System.out.print(""+ddif7+"\n");    
        
        
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(jdValores.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }
    
    
    public Double Getrango1(){
       return drango1;
        
    }
    
    public Double Getrango21(){
       return drango21;
        
    }
    
    public Double Getrango22(){
       return drango22;
        
    }
     
    public Double Getfact2(){
       return dfact2;
        
    }
     
    public Double Getdif2(){
       return ddif2;
        
    }
    
    public Double Getrango31(){
       return drango31;
        
    }
    
    public Double Getrango32(){
       return drango32;
        
    }
    
    public Double Getfact3(){
       return dfact3;
    
    }
     
    public Double Getdif3(){
       return ddif3;
        
    } 
     
    public Double Getrango41(){
       return drango41;
        
    }
    
    public Double Getrango42(){
       return drango42;
        
    }
    
    public Double Getfact4(){
       return dfact4;
    
    }
     
    public Double Getdif4(){
       return ddif4;
        
    }  
     
    public Double Getrango51(){
       return drango51;
        
    }
    
    public Double Getrango52(){
       return drango52;
        
    }
    
    public Double Getfact5(){
       return dfact5;
    
    }
     
    public Double Getdif5(){
       return ddif5;
        
    } 
    
    public Double Getrango61(){
       return drango61;
        
    }
    
    public Double Getrango62(){
       return drango62;
        
    }
    
    public Double Getfact6(){
       return dfact6;
    
    }
     
    public Double Getdif6(){
       return ddif6;
        
    } 
    
    public Double Getrango71(){
       return drango71;
        
    }
    
    public Double Getfact7(){
       return dfact7;
    
    }
     
    public Double Getdif7(){
       return ddif7;
        
    } 
    
    public Double Getrango81(){
       return drango81;
        
    }
    
    public Double Getfact8(){
       return dfact8;
    
    }
     
    public Double Getdif8(){
       return ddif8;
        
    } 
    
    
    
    
    
    public Double compara(double monto){
       double impuesto = 0; 
       @SuppressWarnings("UnusedAssignment")
       double factor = 0;
       
       if(monto <= drango1){
         
           impuesto = 0;
       
       }else if(monto >= drango21 && monto <= drango22){
           
             factor = monto * dfact2;
             impuesto = factor - ddif2;
       
       }else if(monto >= drango31 && monto <= drango32){
       
             factor = monto * dfact3;
             impuesto = factor - ddif3;
       
       }else if(monto >= drango41 && monto <= drango42){
       
             factor = monto * dfact4;
             impuesto = factor - ddif4;
       
       }else if(monto >= drango51 && monto <= drango52){
       
             factor = monto * dfact5;
             impuesto = factor - ddif5;
       
       }else if(monto >= drango61 && monto <= drango62){
       
             factor = monto * dfact6;
             impuesto = factor - ddif6;
       
       }else if(monto >= drango71 && monto <= drango72){
       
             factor = monto * dfact7;
             impuesto = factor - ddif7;
       
       }else if(monto >= drango81){
       
             factor = monto * dfact8;
             impuesto = factor - ddif8;
       
       }
        
       return impuesto;                    
        
    } 

    public static void main(String[] args)  {
       
       try {                                                                                                  //Para ejecutarlo
           jdBuscaSii sii = new jdBuscaSii();                                                   // como aplicación independienmte
          
       } catch (IOException ex) {                                                                               // desde el main()
//           Logger.getLogger(jdBuscaSii.class.getName()).log(Level.SEVERE, null, ex);                    // 
       }
    }
} 
