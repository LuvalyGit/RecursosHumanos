package Dialogos;

import Conexion.ExeSql;
import PanelForm.pfGastosSueldos;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import org.jsoup.nodes.Document; 
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.logging.Logger;
import org.apache.commons.math3.util.Precision;


/**
 *
 * @author informatica (Roberto Lopez)
 */
public class jdCargaIndicadores extends javax.swing.JDialog {
   private static final Logger LOGGER = null;
   
   public static String atramo = "D";
   public static double afpcap, afpcup, afphab, afpplan, afpprov, afpmod, afpuno = 0.0; 
   public static double por, por1, por2, por3, por4, por5, por6 = 0.0;
   public static double uf, utm = 0.0;
   public static double topeImp, topeApvM, sminimo, topegratif, topeCesantia = 0.0;
   public static long   topeApvA = 0;
   public static double tramo1, tramo2, tramo3,tramo4 = 0.0;
   public static double renta1, renta21, renta22, renta31, renta32, renta4 = 0.0;
   
   
   public static int cont = 1;
   public static int cont2 = 1;
   public static int cont3 = 1;
   public static int cont4 = 1;
   
   public static String codigo = "";
  
   
   public jdCargaIndicadores() throws IOException{
      

       ExeSql Sql = new ExeSql();
       ResultSet Rs = null;
        
        
        try {
            
            Rs = Sql.Select("SELECT * FROM indicadores WHERE nombre IN ('VALOR_UF','VALOR_UTM','TOPE_IMPONIBLE','TOPE_CESANTIA','TOPE_GRATIFICACION',\n"+
                            "'SUELDO_MINIMO','TOPE_APV_MENSUAL','TOPE_APV_ANUAL','AFP', \n"+
                            "'ASIGNACION_FAMILIAR_TRAMO','ASIGNACION_FAMILIAR_RENTA')");
            
            if(Sql.GetRowCount()>0){
                
                while (Rs.next()){
                    
                    codigo = Rs.getString("codigo").trim();
                    
                    
                    if (codigo.equals("UF_1")){
                        
                        uf = Rs.getDouble("valor");
                    
                    }
                    
                    if (codigo.equals("UTM_1")){
                        
                        utm = Rs.getDouble("valor");
                    
                    }
                    
                    
                    if (codigo.equals("TIMP_1")){
                        
                        topeImp = Rs.getLong("valor");
                    
                    }
                    
                    
                    if (codigo.equals("TCES_1")){
                        
                        topeCesantia = Rs.getLong("valor");
                    
                    }
                    
                    
                    if (codigo.equals("TGRAT_1")){
                        
                        topegratif = Rs.getDouble("valor");
                    
                    }
                    
                    
                    if (codigo.equals("SMIN_1")){
                        
                        sminimo = Rs.getDouble("valor");
                    
                    }
                    
                    if (codigo.equals("TAPVM_1")){
                        
                        topeApvM = Rs.getDouble("valor");
                    
                    }
                    
                    
                    if (codigo.equals("TAPVA_1")){
                        
                        topeApvA = Rs.getLong("valor");
                    
                    }
                    
            //*****************************************************************************************//        
                    
                    if (codigo.equals("AFP_CAP_1")){
                        
                        afpcap = Rs.getDouble("valor");
                    
                    }
                    
                    
                    if (codigo.equals("AFP_CUP_1")){
                        
                        afpcup = Rs.getDouble("valor");
                    
                    }
                    
                    if (codigo.equals("AFP_HAB_1")){
                        
                        afphab = Rs.getDouble("valor");
                    
                    }
                    
                    
                    if (codigo.equals("AFP_PLAN_1")){
                        
                        afpplan = Rs.getDouble("valor");
                    
                    }
                    
                    if (codigo.equals("AFP_PROV_1")){
                        
                        afpprov = Rs.getDouble("valor");
                    
                    }
                    
                    if (codigo.equals("AFP_MOD_1")){
                        
                        afpmod = Rs.getDouble("valor");
                    
                    }
                    
                    
                    if (codigo.equals("AFP_UNO_1")){
                        
                        afpuno = Rs.getDouble("valor");
                    
                    }
            //*************************************************************************//
                    
                    if (codigo.equals("ATRAM_1")){
                        
                        tramo1 = Rs.getDouble("valor");
                    
                    }
                    
                    
                    if (codigo.equals("ATRAM_2")){
                        
                        tramo2 = Rs.getDouble("valor");
                    
                    }
                    
                    if (codigo.equals("ATRAM_3")){
                        
                        tramo3 = Rs.getDouble("valor");
                    
                    }
                                        
                    if (codigo.equals("ATRAM_4")){
                        
                        tramo4 = Rs.getDouble("valor");
                    
                    }
                    
                    if (codigo.equals("ARENT_1")){
                        
                        renta1 = Rs.getDouble("valor");
                    
                    }
                    
                    if (codigo.equals("ARENT_21")){
                        
                        renta21 = Rs.getDouble("valor");
                    
                    }
                    
                    if (codigo.equals("ARENT_22")){
                        
                        renta22 = Rs.getDouble("valor");
                    
                    }
                    
                    if (codigo.equals("ARENT_31")){
                        
                        renta31 = Rs.getDouble("valor");
                    
                    }
                    
                    if (codigo.equals("ARENT_32")){
                        
                        renta32 = Rs.getDouble("valor");
                    
                    }
                    
                    if (codigo.equals("ARENT_4")){
                        
                        renta4 = Rs.getDouble("valor");
                    
                    }
                    
                    
                    
                }////////////////////////////////
            
           
                
            }
            
        
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(jdValores.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
       
       
       
       
        
        System.out.println("VALOR UTM : "+utm);
        System.out.println("TOPE IMPONIBLE (AFP, SALUD) : "+topeImp);
        System.out.println("TOPE SEGURO CESANTIA (PESOS) : "+topeCesantia);
        System.out.println("Sueldo Minimo (Trabajadores Dependientes e Independientes:) : "+sminimo);
        System.out.println("TOPE APV MENSUAL : "+topeApvM);
        System.out.println("TOPE APV ANUAL : "+topeApvA);
        System.out.println("TOPE GRATIFICACION : "+topegratif);
       
//        System.out.println(ufIsapre); 
//        System.out.println(dufIsapre); 
//        
      
        
   }
        
    public Double GetCapital(){
       return afpcap;
        
    }
    public Double GetCuprum(){
       return afpcup;
        
    }
     public Double GetHabitat(){
         
       return afphab;
        
    }
     
     public Double GetPlanVital(){
       return afpplan;
        
    }
     
     public Double GetProVida(){
       return afpprov;
        
    }
    
    public Double GetModelo(){
       return afpmod;
        
    }
    
    public Double GetUno(){
       return afpuno;
        
    }
    
    
    public Double GetGratif(){    // TOPE GRATIFICACION
       return topegratif;
        
    }
    
     public Double GetMaximp(){     //TOPE IMPONIBLE
       return topeImp;
    }

     
     public Double GetUfIsapre(){         //VALOR UF DEL ULTIMO DIA MES ANTERIOR
       return uf;
        
    } 
   
    public Double GetUtm(){         // VALOR UTM
       return utm;
        
    }
   
    public Double GetTopeApvM(){    //TOPE APV MENSUAL
       return topeApvM;
        
    }
     
    public Long GetTopeApvA(){
       return topeApvA;            //TOPE APV ANUAL
        
    }
    
    public Double GetTopeCesantia(){
       return topeCesantia;      //TOPE CESANTIA
        
    }
    
    public Double GetSueldoMinimo(){
       return sminimo;      //SUELDO MINIMO
        
    }
    
    
    
    
    
    public Double GetMonto1(){
       return tramo1;
        
    }
    public Double GetMonto2(){
       return tramo2;
        
    }
    
    public Double GetMonto3(){
       return tramo3;
        
    }
    
    public Double GetRango1(){
       return renta1;
        
    }
    
    public Double GetRango21(){
       return renta21;
        
    }
    
    public Double GetRango22(){
       return renta22;
        
    }
    
    public Double GetRango31(){
       return renta31;
        
    }
    
    public Double GetRango32(){
       return renta32;
        
    }
    
    public Double GetRango4(){
       return renta4;
        
    }
    
    public String GetTramo(){
       return atramo;
        
    }
    
    
    public Double compara(double monto){
         
        double asignacion = 0;
              
        if (monto <= renta1){
           
           asignacion = tramo1;
           atramo = "A";
       
        }else if(monto > renta21 && monto <= renta22){
             
           asignacion = tramo2;
           atramo = "B";
             
        }else if(monto > renta31 && monto <= renta32){
            
           asignacion = tramo3;
           atramo = "C";
             
        }else if(monto > tramo4){
        
           asignacion = 0;
           atramo = "D";
        
        }
        
       return asignacion;
        
    } 
    
    
    
    
    
    
    
    
     

   public static void main(String[] args)  {
       
       try {                                                                                                  //Para ejecutarlo
           @SuppressWarnings("LocalVariableHidesMemberVariable")
           jdCargaIndicadores afp = new jdCargaIndicadores();                                                   // como aplicación independienmte
       } catch (IOException ex) {                                                                               // desde el main()
           Logger.getLogger(jdCargaIndicadores.class.getName()).log(Level.SEVERE, null, ex);                    // 
       }
    }
} 
