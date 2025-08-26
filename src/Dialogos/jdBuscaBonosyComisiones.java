package Dialogos;

import Conexion.ExeSql;
import PanelForm.pfGastosSueldos;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author informatica (Roberto Lopez)
 */
public class jdBuscaBonosyComisiones extends javax.swing.JDialog {
  
    public static double subtotal_com = 0.0;
    public static double total_com = 0.0;
    public static double total_sem = 0.0;
   
    DecimalFormat formateador = new DecimalFormat("###,###");
   
   
    public jdBuscaBonosyComisiones(int codigo, int codigo_bono, String elagno, int elmes, int dtrab, int dfer) throws IOException{
        
        int cod_com = 0;
        subtotal_com = 0;
       
        if (elagno.equals("AÑO")){
   
          elagno = "0"; 
       
        }else if (elmes == 0){
       
          int agno2 = Integer.parseInt(elagno)-1;
           
          elmes = 12;   
          elagno = String.valueOf(agno2);
        }
            
        try {
            
            subtotal_com = pfGastosSueldos.bmonto2; 
            
            
            if(subtotal_com > 0){   
          
                total_sem = Math.round((subtotal_com / dtrab) * dfer);                   //Se calcula el valor semana corrida del Bono o Comision
        
                total_com = Math.round(subtotal_com);
            
            }else{
       
                total_sem = 0;
                total_com = 0;
       
            }
         
        }catch (Exception ex) {
        
            Logger.getLogger(jdBuscaBonosyComisiones.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
        
    public Double GetCom(){
       return total_com;
        
    }
    
     public Double GetSem(){
       return total_sem;
        
    }
   
     

   public static void main(String[] args)  {
       
       /*try {                                                                                                  //Para ejecutarlo
           @SuppressWarnings("LocalVariableHidesMemberVariable")
           jdBuscaIndicadores afp = new jdBuscaIndicadores();                                                   // como aplicación independienmte
       } catch (IOException ex) {                                                                               // desde el main()
           Logger.getLogger(jdBuscaIndicadores.class.getName()).log(Level.SEVERE, null, ex);                    // 
       }*/
    }
} 
