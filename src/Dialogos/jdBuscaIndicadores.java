package Dialogos;

import PanelForm.pfGastosSueldos;
import java.io.IOException;
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
public class jdBuscaIndicadores extends javax.swing.JDialog {
   private static final Logger LOGGER = null;
   public static String afp, afp1, afp2, afp3, afp4, afp5, afp6, safp, safp1, safp2, safp3,safp4,safp5,safp6,MaxImp = "";
   public static String nafp, nafp1,nafp2,nafp3,nafp4,nafp5,nafp6,nMaxImp = "";
   public static String Smin, sSmin, sMaxImp = "";
   public static double dSmin, tSmin, tGratif  = 0.0;
   public static double dafp, dafp1, dafp2, dafp3, dafp4, dafp5, dafp6 = 0.0; 
   public static double por, por1, por2, por3, por4, por5, por6 = 0.0;
   
   public static String uf, utm, ufIsapre = "";
   public static String suf,sutm, sufIsapre = "";
   public static double duf, dutm, dufIsapre = 0;

   public static String topeApvM, topeApvA, topeCesantia = "";
   public static String stopeApvM, stopeApvA, stopeCesantia = "";
   public static double dtopeApvM, dtopeCesantia, tTopeCesantia, tMaxImp  = 0;
   public static long   dtopeApvA = 0;
   public static long dMaxImp = 0;
   
   public static int cont = 1;
   public static int cont2 = 1;
   public static int cont3 = 1;
   public static int cont4 = 1;
   
   
   
   public jdBuscaIndicadores() throws IOException{
    

    Document doc = org.jsoup.Jsoup.connect("https://www.previred.com/indicadores-previsionales").get();
   
       Elements filas = doc.select("tr");
         
        for(Element fila :filas)
        {
            Elements columnas = fila.select("td");
            
            for (Element columna:columnas)
            {
                switch (columna.text()){
                 
                    case "Capital":    
                         nafp = columna.text();                                      // 
                         afp = columna.nextElementSibling().text();                  //  
                        System.out.println("afp ES : "+nafp);
                    case "Cuprum":                                                   //                            
                         nafp1 = columna.text();                                     // 
                         afp1 = columna.nextElementSibling().text();                 //   Captura porcentaje de comision de las AFp desde PreviRed
                    case "Habitat":                                                  //
                         nafp2 = columna.text();                                     //        
                         afp2 = columna.nextElementSibling().text();                 //
                    case "PlanVital":                                                //
                         nafp3 = columna.text();                                     //
                         afp3 = columna.nextElementSibling().text();                 // 
                    case "ProVida":                                                  // 
                         nafp4 = columna.text();                                     // 
                         afp4 = columna.nextElementSibling().text();                 // 
                    case "Modelo":                                                   //
                         nafp5 = columna.text();                                     //
                         afp5 = columna.nextElementSibling().text();                 //  
                    case "Uno":                                                   //
                         nafp6 = columna.text();                                     //
                         afp6 = columna.nextElementSibling().text();                 //          
                } 
                
            }
                
        }
        
          System.out.println("afp ES : "+nafp);
        
        
        safp = afp.replaceAll("\\%", "");
        dafp = Double.parseDouble(safp.replaceAll("\\,", "."));
        
        safp1 = afp1.replaceAll("\\%", "");
        dafp1 = Double.parseDouble(safp1.replaceAll("\\,", "."));
        
        safp2 = afp2.replaceAll("\\%", "");
        dafp2 = Double.parseDouble(safp2.replaceAll("\\,", "."));
        
        safp3 = afp3.replaceAll("\\%", "");
        dafp3 = Double.parseDouble(safp3.replaceAll("\\,", "."));
        
        safp4 = afp4.replaceAll("\\%", "");
        dafp4 = Double.parseDouble(safp4.replaceAll("\\,", "."));
        
        safp5 = afp5.replaceAll("\\%", "");
        dafp5 = Double.parseDouble(safp5.replaceAll("\\,", "."));
                 
        safp6 = afp6.replaceAll("\\%", "");
        dafp6 = Double.parseDouble(safp6.replaceAll("\\,", "."));
        
        
        por  = Precision.round((dafp-10)/100,4);
        por1 = Precision.round((dafp1-10)/100,4);
        por2 = Precision.round((dafp2-10)/100,4);
        por3 = Precision.round((dafp3-10)/100,4);
        por4 = Precision.round((dafp4-10)/100,4);
        por5 = Precision.round((dafp5-10)/100,4);
        por6 = Precision.round((dafp6-10)/100,4);
            
        
        System.out.print(nafp+" "+por+"\n");
        System.out.print(nafp1+" "+por1+"\n");
        System.out.print(nafp2+" "+por2+"\n");
        System.out.print(nafp3+" "+por3+"\n");
        System.out.print(nafp4+" "+por4+"\n");
        System.out.print(nafp5+" "+por5+"\n");
        System.out.print(nafp6+" "+por6+"\n");
        
        
  //*************************************** VALOR U F *********************************************//      
        
        
//       Document doc3 = org.jsoup.Jsoup.connect("https://valoruf.cl/").get();
//   
//       Elements filas3 = doc3.select("tr");
//         
//        for(Element fila3 :filas3)
//        {
//            Elements columnas3 = fila3.select("td");
//            
//            for (Element columna3 : columnas3)
//            {
//                if (cont3 == 2){
//                   
//                    uf = columna3.text();
//                }
//                cont3++;
//            }
//                 
//        }
//        
//        
//        suf = uf.replaceAll("\\.","");
//        duf = Double.parseDouble(suf.replaceAll("\\,", "."));
//        
    //    System.out.println(""+duf+"\n");
        
               
  //***************************** SUELDO MINIMO, TOPE GRATIFICACION, TOPE IMPONIBLE, VALOR U T M, TOPE APV (ANUAL Y MENSUAL), TOPE CESANTIA *****************************//      
        
        
       Document doc4 = org.jsoup.Jsoup.connect("https://www.previred.com/indicadores-previsionales").get();
   
       Elements filas4 = doc4.select("tr");
         
        for(Element fila4 :filas4)
        {
            Elements columnas4 = fila4.select("td");
            
            for (Element columna4:columnas4){
                
                
                if (cont4 == 5){
                   
                    //System.out.println(columna4.text());
                    ufIsapre = columna4.text().substring(1,11);
                    
                }
                
                
                if (cont4 == 13){
                   
                   
                    utm = columna4.text().substring(1,9);
                
                }
                
                if (cont4 == 16){
                   
                    
                   
                    MaxImp = columna4.text().substring(2,11);
                
                }
                
                if (cont4 == 20){
                    
                   topeCesantia = columna4.text().substring(1, 11);            
                
                }if (cont4 == 23){
                 
                   Smin = columna4.text().substring(1,9);            
                
                }if (cont4 == 32){
                  
                    topeApvM = columna4.text().substring(1,11);
                
                }if (cont4 == 34){
                  
                    topeApvA = columna4.text().substring(2,12);
                
                }
                
               //System.out.println(columna4.text()+"....................."+cont4);
                cont4++;
            }
                 
        }
        
        sufIsapre = ufIsapre.replaceAll("\\.","");
        dufIsapre = Double.parseDouble(sufIsapre.replaceAll("\\,", "."));           //UF del último día del Mes anterior
        dutm = Double.parseDouble(utm.replaceAll("\\.", ""));                       //VALOR UTM 

        
        tMaxImp = Double.parseDouble(MaxImp.replaceAll("\\.",""));                 //TOPE IMPONIBLE (AFP, SALUD)

        tTopeCesantia = Double.parseDouble(topeCesantia.replaceAll("\\.", ""));    //TOPE SEGURO CESANTIA (PESOS)
        
        dSmin = Double.parseDouble(Smin.replaceAll("\\.", ""));                     //Sueldo Minimo (Trabajadores Dependientes e Independientes:)

        dtopeApvM = Double.parseDouble(topeApvM.replaceAll("\\.", ""));                                   //TOPE APV MENSUAL

        dtopeApvA = Long.parseLong(topeApvA.replaceAll("\\.", ""));                                   //TOPE APV ANUAL
        tGratif = Math.round((dSmin*4.75)/12);                                      //TOPE DE GRATIFICACION
     
      
        
        
        System.out.println("VALOR UTM : "+dutm);
        System.out.println("TOPE IMPONIBLE (AFP, SALUD) : "+tMaxImp);
       // System.out.println("TOPE SEGURO CESANTIA (U.F) : "+dtopeCesantia);
         System.out.println("TOPE SEGURO CESANTIA (PESOS) : "+tTopeCesantia);
        System.out.println("Sueldo Minimo (Trabajadores Dependientes e Independientes:) : "+dSmin);
        System.out.println("TOPE APV MENSUAL : "+dtopeApvM);
        System.out.println("TOPE APV ANUAL : "+dtopeApvA);
        System.out.println("TOPE GRATIFICACION : "+tGratif);
       
        System.out.println(ufIsapre); 
        System.out.println(dufIsapre); 
        
      
        
   }
        
    public Double GetCapital(){
       return por;
        
    }
    public Double GetCuprum(){
       return por1;
        
    }
     public Double GetHabitat(){
         
       return por2;
        
    }
     
     public Double GetPlanVital(){
       return por3;
        
    }
     
     public Double GetProVida(){
       return por4;
        
    }
    
    public Double GetModelo(){
       return por5;
        
    }
    
    public Double GetUno(){
       return por6;
        
    }
    
    
    public Double GetGratif(){    // TOPE GRATIFICACION
       return tGratif;
        
    }
    
     public Double GetMaximp(){     //TOPE IMPONIBLE
       return tMaxImp;
    }
    
    
//     public Double GetUf(){         //VALOR UF
//       return duf;
//        
//    }
     
     public Double GetUfIsapre(){         //VALOR UF DEL ULTIMO DIA MES ANTERIOR
       return dufIsapre;
        
    } 
   
    public Double GetUtm(){         // VALOR UTM
       return dutm;
        
    }
   
    public Double GetTopeApvM(){    //TOPE APV MENSUAL
       return dtopeApvM;
        
    }
     
    public Long GetTopeApvA(){
       return dtopeApvA;            //TOPE APV ANUAL
        
    }
    
    public Double GetTopeCesantia(){
       return tTopeCesantia;      //TOPE CESANTIA
        
    }
    
    public Double GetSueldoMinimo(){
       return dSmin;      //SUELDO MINIMO
        
    }
    
    
     
    
    public Integer Asigna_cod_bono(String rut,String codigo){
     
      int cod_bono = 0;  
    
      if (codigo.equals("38")){            //BONO CUMPLIMIENTO FACTURACION
      
          if (rut.equals("13118519") || rut.equals("15656644") || rut.equals("21104992") ||
              rut.equals("15242185") || rut.equals("16632715") || rut.equals("19196156")){
              
              cod_bono = 2;   
          
          }else{
          
              cod_bono = 1;
          
          }
      
      
      }else if (codigo.equals("28")){                           //COMISION POR VENTAS
      
          if (rut.equals("15242185")){                 //DAVID
              
              cod_bono = 3;   
          
          }else if (rut.equals("15986675")){          //ALEJANDRO
          
              cod_bono = 4;
          
          }else if (rut.equals("13516883")){          //LEONARDO
          
              cod_bono = 9;
          
          }
          
          
          
      
      
      }else if (codigo.equals("37")){                       //BONO CUMPLIMIENTO PRESUPUESTO
      
          if (rut.equals("13118519") || rut.equals("16632715")){           //JOSE LUIS  Y CHRISTIAN
              
              cod_bono = 5;   
          
          }else  if (rut.equals("15656644")){                       //LUIS LLANOS
          
              cod_bono = 6;
          
          }
      
      }else if (codigo.equals("11")){                   //COMISION GESTION COBRANZA
      
          if (rut.equals("21104992")){                      //TAMARA
              
              cod_bono = 7;   
          
          }else if (rut.equals("19196156")){                //YOSELINE
          
              cod_bono = 8;
          
          }
      
      }
      
      return cod_bono;
       
     
    }
    
    
     

   public static void main(String[] args)  {
       
       try {                                                                                                  //Para ejecutarlo
           @SuppressWarnings("LocalVariableHidesMemberVariable")
           jdBuscaIndicadores afp = new jdBuscaIndicadores();                                                   // como aplicación independienmte
       } catch (IOException ex) {                                                                               // desde el main()
           Logger.getLogger(jdBuscaIndicadores.class.getName()).log(Level.SEVERE, null, ex);                    // 
       }
    }
} 
