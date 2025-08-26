
package Utilidades;

import Conexion.ExeSql;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;

/**
 *
 * @author Roberto Lopez
 */
public class utBarraProgreso extends SwingWorker<Integer,String> {

    
    private final JProgressBar pb1;
    private final JButton jb1;
        
    double totalcob = 0;
    double totalcob2 = 0;
    double totalv = 0;
    double totalfac = 0;
    double totalfec = 0;
    double totalncc = 0;
    double subtotalncc = 0;
    
    Calendar cal = Calendar.getInstance();

    int year  = cal.get(Calendar.YEAR);
    int month = cal.get(Calendar.MONTH)+1;
    
    ExeSql Sql = new ExeSql();
    ExeSql Sql2 = new ExeSql();
    ResultSet Rs;
    ResultSet Rs2;
        
    String logrado = "no";
    String estado = "";
    int nmonth = 0;
    int nmonth2 = 0;
    
    int nyear = 0;
    int nyear2 = 0;
    
    double valor1 = 0;
    double valor2 = 0;
    double resultado = 0;
    
    
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    
    public utBarraProgreso(JProgressBar jpbar1, JButton boton) {
     
       pb1 = jpbar1;
       jb1 = boton;
       
       if (month == 1){
       
          nmonth = 12; 
          
       }
    }
 
    @Override
    protected Integer doInBackground() throws Exception {
             
        pb1.setValue(0);
        
        for (int item = 1;item <=13;item++){
            
            resultado = 0;
            valor2 = 0;
            
            if (month == 1){
       
                nmonth2 = 12; 
                nyear2 = year - 1; 
          
            }else if (month > 1) {
            
                nmonth2 = month - 1;
                nyear2 = year;   
            
            }
            
            
            if(item == 1){                                 //COMISION POR VENTAS, BONOS FACTURACION Y PRESUPUESTO GENERAL
               
                try {
                    
                    if (month == 1){
                    
                        Rs = Sql.Select("SELECT * FROM bono_comision \n"+
                                        "WHERE codigo = "+item+"\n" +
                                        "AND agno IN ("+(nyear2)+","+year+") \n" +
                                        "AND mes  IN ("+nmonth2+","+month+") \n" +
                                        "ORDER BY mes ASC");
                    }else if (month > 1) {
                    
                        
                        Rs = Sql.Select("SELECT * FROM bono_comision \n"+
                                        "WHERE codigo = "+item+"\n" +
                                        "AND agno = "+nyear2+"\n" +
                                        "AND mes IN ("+(nmonth2)+","+month+") \n" +
                                        "ORDER BY mes ASC");
                    
                    }
                    
                    if (Sql.GetRowCount() > 0){
                
                        while (Rs.next()){
                       
                            if (Rs.getInt("mes") == nmonth2){      //MES ANTERIOR                       
                                    
                                    nmonth = nmonth2;
                                    nyear = nyear2;
                                    
                                    Calculo_Ventas(nyear,nmonth,1);     
                                    resultado = totalv;                                
                                    estado = "cerrado";   
                                    valor2 = Rs.getDouble("valor_metamin");
                                     
                                    if (resultado >= valor2){                    //Si el Monto Facturado es Mayor o igual a la Meta Mínima
          
                                        logrado = "si";                             //Se cumplió la meta
       
                                    }else{
       
                                        logrado = "no";
                                    }
                            
                            
                            
                            }else if(Rs.getInt("mes") == month){                //MES ACTUAL
                                  
                                  nmonth = month; 
                                  nyear = year;
                                  
                                  Calculo_Ventas(nyear,nmonth,1);     
                                  resultado = totalv;                                
                                  estado = "abierto";   
                                  double metam = Rs.getDouble("valor_metamin");
                                     
                                  if (resultado >= metam){                    //Si el Monto Facturado es Mayor o igual a la Meta Mínima
          
                                     logrado = "si";                             //Se cumplió la meta
       
                                  }else{
       
                                     logrado = "no";
                                  }
                            
                            }                        
                        
                                                    
                        
                            Sql2.ExeSql("UPDATE bono_comision SET valor_resultado = " + Math.round(resultado) + ", \n"+
                                        "logrado ='"+logrado+"', \n"+
                                        "estado ='"+estado+"' \n"+
                                        "WHERE mes = "+nmonth + "\n"+
                                        "AND codigo = "+item + "\n"+
                                        "AND agno = "+nyear);    
                            
                           
                    
                        }
                      
                        pb1.setValue(pb1.getValue()+10);  
                    }
                
                }catch (SQLException ex) {
            
                    Logger.getLogger(utBarraProgreso.class.getName()).log(Level.SEVERE, null, ex);
                }
        
            }else if(item == 2 || item == 7 || item == 8 || item == 9) {          //BONO CUMPLIMIENTO PRESUPUESTO   (LLANOS)
            
                int codigo = item;
                int cod_conv = 0;
              
            
                if (codigo == 2){
             
                    cod_conv = 4;
            
                }else if (codigo == 7){
             
                    cod_conv = 5;
             
                }else if (codigo == 8){
             
                    cod_conv = 8;
             
                }else if (codigo == 9){
             
                    cod_conv = 10;
                
                }
            
                try {
                    
                    if (month == 1){
                    
                        Rs = Sql.Select("SELECT * FROM bono_comision \n"+
                                        "WHERE codigo = "+item+"\n" +
                                        "AND agno IN ("+(nyear2)+","+year+") \n" +
                                        "AND mes  IN ("+nmonth2+","+month+") \n" +
                                        "ORDER BY mes ASC");
                    }else if (month > 1) {
                    
                        
                        Rs = Sql.Select("SELECT * FROM bono_comision \n"+
                                        "WHERE codigo = "+item+"\n" +
                                        "AND agno = "+nyear2+"\n" +
                                        "AND mes IN ("+(nmonth2)+","+month+") \n" +
                                        "ORDER BY mes ASC");
                    
                    }
                    
                
                    if (Sql.GetRowCount() > 0){
                    
                        while (Rs.next()){
                            
                            resultado = 0;
                            valor2 = 0;
                            if (Rs.getInt("mes") == nmonth2){                   //MES ANTERIOR
                                
                                estado = "cerrado";
                                nmonth = nmonth2;
                                nyear = nyear2;
                                
                                
                            }else if (Rs.getInt("mes") == month){               //MES ACTUAL
                                
                                estado = "abierto";
                                nmonth = month;        
                                nyear = nyear2;
                                
                            }    
                                                            
                            Rs2 = Sql2.Select("select convenio, sum(totventa) as total from (select c.femision, p.convenio as codcon, conv.convenio as convenio, sum(d.cantidad), p.nombre, p.valultcompra,  p.costopromedio,round(d.valorunitario), round(CAST((sum(round(d.cantidad))*d.valorunitario) as numeric)) as totventa\n" +
                            "from occh c\n" +
                            "left join occhdet d on c.rut=d.rut and c.orden=d.orden and c.codigo_oc=d.codigo_oc \n" +
                            "left join producto p on d.sku=p.sku \n" +
                            "left join par_convenio conv on conv.codigo=p.convenio \n" +
                            "right join occh_portal op on c.codigo_oc = op.codigo_oc and c.orden = lower(op.orden) \n" +
                            "where extract(year from cast(c.femision as date))="+year+" \n" +
                            "and extract(month from cast(c.femision as date))="+nmonth+" \n" +
                            "AND p.convenio IN ('"+cod_conv+"') \n" +
                            "group by c.femision, p.convenio, conv.convenio, nombre, p.valultcompra,  p.costopromedio,d.valorunitario) as sel group by convenio");
                            
                            
                            
                            while (Rs2.next()){
                            
                                 resultado = Rs2.getDouble("total");
                                
                            
                            }
                            
                            valor2 = resultado - Rs.getDouble("valor_meta");
                                
                            //****************************************************************************************************************//    
                                
                                
                            if (valor2 >= 0){                    //Si el Monto Facturado es Mayor o igual a la Meta Mínima
          
                                logrado = "si";                             //Se cumplió la meta
       
                            }else{
       
                                logrado = "no";
                            }
                            
                             Sql2.ExeSql("UPDATE bono_comision SET valor_metamin = " + Math.round(resultado) + ", \n"+
                                        "valor_resultado ="+Math.round(valor2)+", \n"+
                                        "logrado ='"+logrado+"', \n"+
                                        "estado ='"+estado+"' \n"+
                                        "WHERE mes = "+nmonth + "\n"+
                                        "AND codigo = "+item + "\n"+
                                        "AND agno = "+year);    
                       
                        }   
                       
                        pb1.setValue(pb1.getValue()+10);
                   }
                
                } catch (SQLException ex) {
                    Logger.getLogger(utBarraProgreso.class.getName()).log(Level.SEVERE, null, ex);
                }
               
            }else if(item == 3 || item == 4 || item == 5) {    //COMISION COBRANZA
            
                try {
                
                    resultado = 0;
                    valor2 = 0;
                         
                    Rs = Sql.Select("SELECT * FROM bono_comision \n"+
                                    "WHERE codigo = "+item+"\n" +
                                    "AND agno = "+year+"\n" +
//                                    "AND mes IN ("+month+") \n" +
                                    "ORDER BY mes ASC");
                    
                
                    if (Sql.GetRowCount() > 0){
                        
                        while (Rs.next()){
                        
                            
                            if (Rs.getInt("agno") == year){
                            
                                if (Rs.getInt("mes") == month){
                                      
                                    nmonth = month;
                                
                                    Calculo_Cobranza(year,nmonth,item);
                                
                                    resultado = totalcob;
                                    valor2 = resultado - Rs.getDouble("valor_meta");
                                
                                    if (resultado >= Rs.getDouble("valor_meta")){                    //Si el Monto Facturado es Mayor o igual a la Meta Mínima
          
                                        logrado = "si";                             //Se cumplió la meta
       
                                    }else{
                        
                                        logrado = "no";
                        
                                    }
                                
                                    estado = "abierto"; 
                                    
                                    Sql2.ExeSql("UPDATE bono_comision SET valor_metamin = " + Math.round(resultado) + ", \n"+
                                                "valor_resultado ="+Math.round(valor2)+", \n"+
                                                "logrado ='"+logrado+"', \n"+
                                                "estado ='"+estado+"' \n"+
                                                "WHERE mes = "+nmonth + "\n"+
                                                "AND codigo = "+item + "\n"+
                                                "AND agno = "+year);    
                                
                                }else if (Rs.getInt("mes") == month-1){
                            
                                    estado = "cerrado";   
                                    nmonth = month;
                            
                                    Calculo_Cobranza(year,nmonth,item);
                              
                                    if (resultado >= Rs.getDouble("valor_meta")){                    //Si el Monto Facturado es Mayor o igual a la Meta Mínima
          
                                        logrado = "si";                             //Se cumplió la meta
       
                                    }else{
                        
                                        logrado = "no";
                        
                                    }
                              
                                    Sql2.ExeSql("UPDATE bono_comision SET valor_metamin = " + Math.round(resultado) + ", \n"+
                                                "valor_resultado ="+Math.round(valor2)+", \n"+
                                                "logrado ='"+logrado+"', \n"+
                                                "estado ='"+estado+"' \n"+
                                                "WHERE mes = "+nmonth + "\n"+
                                                "AND codigo = "+item + "\n"+
                                                "AND agno = "+year);    
                              
                                }
                            
                            }  
                        }
                        
                        pb1.setValue(pb1.getValue()+10);
                    }
                    
                }catch (SQLException ex) {
                    
                    Logger.getLogger(utBarraProgreso.class.getName()).log(Level.SEVERE, null, ex);
                }
                     
            }
            
            
            else if(item == 6) {                                                    //COMISION POR VENTAS (ALEJANDRO)
            
                try {
                    
                    
                    if (month == 1){
                    
                        Rs = Sql.Select("SELECT * FROM bono_comision \n"+
                                        "WHERE codigo = "+item+"\n" +
                                        "AND agno IN ("+(nyear2)+","+year+") \n" +
                                        "AND mes  IN ("+nmonth2+","+month+") \n" +
                                        "ORDER BY mes ASC");
                    }else if (month > 1) {
                    
                        
                        Rs = Sql.Select("SELECT * FROM bono_comision \n"+
                                        "WHERE codigo = "+item+"\n" +
                                        "AND agno = "+nyear2+"\n" +
                                        "AND mes IN ("+(nmonth2)+","+month+") \n" +
                                        "ORDER BY mes ASC");
                    
                    }
            
            
                    if (Sql.GetRowCount() > 0){
                
                        while (Rs.next()){
                        
                            if (Rs.getInt("mes") == nmonth2 && Rs.getInt("agno") == nyear2 ){     //MES o AÑO ANTERIOR
                       
                                estado = "cerrado";
                                nmonth = nmonth2;
                                nyear = nyear2;
                        
                            }else if (Rs.getInt("mes") == month  && Rs.getInt("agno") == year ){   //MES Y AÑO ACTUAL
                           
                                estado = "abierto";
                                nmonth = month;
                                nyear = year;
                           
                            }
                        
                            Calculo_Ventas(nyear,nmonth,2);  
                            resultado = totalv;
                            logrado = "si"; 
                        
                            Sql2.ExeSql("UPDATE bono_comision SET valor_resultado = " + Math.round(resultado) + ", \n"+
                                        "logrado ='"+logrado+"', \n"+
                                        "estado ='"+estado+"' \n"+
                                        "WHERE mes = "+nmonth + "\n"+
                                        "AND codigo = "+item + "\n"+
                                        "AND agno = "+nyear);    
                      
                        }
                    
                         pb1.setValue(pb1.getValue()+20);
                    }
                  
             }catch (SQLException ex) {
                    
                    Logger.getLogger(utBarraProgreso.class.getName()).log(Level.SEVERE, null, ex);
             }
         
        }else if(item == 10 || item == 11 || item == 12 || item == 13) {          //BONO CUMPLIMIENTO PRESUPUESTO   (CAMILA)
            
                int codigo = item;
                int cod_conv = 0;
            
                if (codigo == 10){
             
                    cod_conv = 3;
            
                }else if (codigo == 11){
             
                    cod_conv = 6;
             
                }else if (codigo == 12){
             
                    cod_conv = 7;
             
                }else if (codigo == 13){
             
                    cod_conv = 9;
                
                }
            
                try {
                    
                     if (month == 1){
                    
                        Rs = Sql.Select("SELECT * FROM bono_comision \n"+
                                        "WHERE codigo = "+item+"\n" +
                                        "AND agno IN ("+(nyear2)+","+year+") \n" +
                                        "AND mes  IN ("+nmonth2+","+month+") \n" +
                                        "ORDER BY mes ASC");
                    }else if (month > 1) {
                    
                        
                        Rs = Sql.Select("SELECT * FROM bono_comision \n"+
                                        "WHERE codigo = "+item+"\n" +
                                        "AND agno = "+nyear2+"\n" +
                                        "AND mes IN ("+(nmonth2)+","+month+") \n" +
                                        "ORDER BY mes ASC");
                    
                    }
                    
                
                    if (Sql.GetRowCount() > 0){
                    
                        while (Rs.next()){
                            
                            resultado = 0;
                            valor2 = 0;
                            
                            if (Rs.getInt("mes") == nmonth2){                   //MES ANTERIOR
                                
                                estado = "cerrado";
                                nmonth = nmonth2;
                                nyear = nyear2;
                                
                                
                            }else if (Rs.getInt("mes") == month){
                                
                                estado = "abierto";
                                nmonth = month;        
                                nyear = year;
                                
                            }    
                              
                                
                            //**************************************************************************************************//
                                                             
                            Rs2 = Sql2.Select("select convenio, sum(totventa) as total from (select c.femision, p.convenio as codcon, conv.convenio as convenio, sum(d.cantidad), p.nombre, p.valultcompra,  p.costopromedio,round(d.valorunitario), round(CAST((sum(round(d.cantidad))*d.valorunitario) as numeric)) as totventa\n" +
                            "from occh c\n" +
                            "left join occhdet d on c.rut=d.rut and c.orden=d.orden and c.codigo_oc=d.codigo_oc \n" +
                            "left join producto p on d.sku=p.sku \n" +
                            "left join par_convenio conv on conv.codigo=p.convenio \n" +
                            "right join occh_portal op on c.codigo_oc = op.codigo_oc and c.orden = lower(op.orden) \n" +
                            "where op.mes ="+nmonth+" and op.agno = "+year+" and extract(year from cast(c.femision as date))="+year+" \n" +
                            "and extract(month from cast(c.femision as date))="+nmonth+" \n" +
                            "AND p.convenio IN ('"+cod_conv+"') \n" +
                            "group by c.femision, p.convenio, conv.convenio, nombre, p.valultcompra,  p.costopromedio,d.valorunitario) as sel group by convenio");
                            
                            while (Rs2.next()){
                            
                                 resultado = Rs2.getDouble("total");
                                
                            
                            }
                            
                            valor2 = resultado - Rs.getDouble("valor_meta");
                                
                            //****************************************************************************************************************//    
                                
                                
                            if (valor2 >= 0){                    //Si el Monto Facturado es Mayor o igual a la Meta Mínima
          
                                logrado = "si";                             //Se cumplió la meta
       
                            }else{
       
                                logrado = "no";
                            }
                            
                             Sql2.ExeSql("UPDATE bono_comision SET valor_metamin = " + Math.round(resultado) + ", \n"+
                                        "valor_resultado ="+Math.round(valor2)+", \n"+
                                        "logrado ='"+logrado+"', \n"+
                                        "estado ='"+estado+"' \n"+
                                        "WHERE mes = "+nmonth + "\n"+
                                        "AND codigo = "+item + "\n"+
                                        "AND agno = "+year);    
                       
                        }   
                       
                        pb1.setValue(pb1.getValue()+10);
                   }
                
                } catch (SQLException ex) {
                    Logger.getLogger(utBarraProgreso.class.getName()).log(Level.SEVERE, null, ex);
                }
               
            }      //Camila
      }  
        
       
    return 0; 
    
    
   }
    
    @Override
     protected void done() {
     
       jb1.doClick();
         
     }
    
    
    
    private void Calculo_Ventas(int agno, int mes, int ind){
        
        totalfac = 0;
        totalfec = 0;
        totalncc = 0;
        subtotalncc = 0;
        totalv = 0;
        
        try{
            //************************************* OBTENCION VALOR ACTUAL DE VENTAS MES EN CURSO ********************************************//
            
            ExeSql Sql = new ExeSql();
            ResultSet Rs = null;
            
            
            if (ind == 1){
            
                Rs = Sql.Select("SELECT tipdocto, femision, SUM(totaldocto) AS tdocto, SUM(totalafecto) AS tafecto, SUM(totalexento) AS texento  \n" +  //VENTAS PARA TODOS
                                "FROM ctactecli \n" +
                                "WHERE EXTRACT(YEAR FROM femision)= "+agno+" \n" +
                                "AND EXTRACT(MONTH FROM femision)= "+mes+" \n"+
                                "AND tipdocto IN ('FAC','FEC','NCC') \n"+
                                "AND nrodocto <> 63540  \n"+
                                "GROUP BY tipdocto, femision");
            }else if (ind == 2){
            
            
                Rs = Sql.Select("SELECT c.femision, c.tipdocto, SUM(c.totalafecto) AS tafecto, SUM(c.totalexento) AS texento,\n"+     //VENTAS (ALEJANDRO)
                                "SUM(c.totaldocto) AS tdocto \n"+
                                "FROM ctactecli c \n"+
                                "LEFT JOIN occh oc ON c.rut=oc.rut AND c.codigo_oc=oc.codigo_oc AND c.occh=oc.orden \n"+
                                "WHERE EXTRACT(YEAR FROM c.femision)="+agno+"\n"+
                                "AND EXTRACT(MONTH FROM c.femision)="+mes+"\n"+
                                "AND c.tipdocto IN ('FAC','FEC','NCC') \n"+
                                "AND oc.vendedor IN ('2') \n"+
                                "AND c.nrodocto <> 63540  \n"+
                                "GROUP BY c.tipdocto, c.femision");
            
            }
            
            
            if (Sql.GetRowCount() > 0){                                                                            
                
                while(Rs.next()){
            
                    if (Rs.getString("tipdocto").equals("FAC")){
            
                        totalfac = totalfac + Rs.getDouble("tafecto");                      //se suma el total afecto    
                                                                                                                
                    }
            
                    if (Rs.getString("tipdocto").equals("FEC")){                            //se suma el total documentos
            
                        totalfec = totalfec + Rs.getDouble("tdocto");
                    }
            
                    if (Rs.getString("tipdocto").equals("NCC")){
            
                        subtotalncc = Rs.getDouble("tafecto") + Rs.getDouble("texento");     //se suma el subtotal afecto y exento
                        totalncc = totalncc + subtotalncc;
                        
                    }
                    
                    totalv = (totalfac + totalfec) - totalncc;                              //TOTAL VENTAS   (RESULTADO)      
                }
            }
        }catch (SQLException ex) {
            
            Logger.getLogger(utBarraProgreso.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    private void Calculo_Cobranza(int agno, int mes, int indice){
       
        int Ejecutivo = 0;
        double pago = 0;
        double tpago = 0;
        
        double pago2 = 0;
        double tpago2 = 0;
        
        long dias = 0;
        int agno_local = agno;
        int agno_local_ant = 0;
        int mes_local = mes;
        int mes_local_ant = mes - 1;
        
        if (mes_local_ant == 0){
        
            mes_local_ant = 12;
            agno_local_ant = agno-1;
            
        }else if (mes_local_ant > 0){
        
           mes_local_ant = mes - 1;
           agno_local_ant = agno;
        
        }
        
        
        
        int mesant = cal.get(Calendar.MONTH)+1;         // Se se setea la fecha que indicará
        int anant = cal.get(Calendar.YEAR);             //el día 25 del mes en curso
        String mesx = String.valueOf(mesant);           //    
        String agnox = String.valueOf(anant);           // 
        String fechax = "25-"+mesx+"-"+agnox;           //
       
        Date fec_limite = new Date();
       
        try{  
            
            ExeSql Sql = new ExeSql();
            ResultSet Rs;
            
            fec_limite = dateFormat.parse(fechax);             //Se asigna la fecha "25" a una variable Date
        
            if (indice == 3){
                    
                Ejecutivo = 18193732;   //CAMILA SOLEDA (TAMARA SALUD)
                    
            }else if (indice == 4){           
                    
                Ejecutivo = 19196156;   //YOSELINE  MUNICIPALIDADES
                   
            }else if (indice == 5){     
                    
                Ejecutivo = 21104992;  //TAMARA NO SALUD
            }
            
        
            if (month == mes_local){              //ACTUALIZA PAGO DE COBRANZA DEL MES ACTUAL.
            
                Rs = Sql.Select("SELECT p.monto AS Pago, p.fechapago, p.fingreso \n" +
                                "FROM cli_pagos p\n" +
                                "LEFT JOIN cli_cuentasxcobrar cxc ON p.cuenta=cxc.id \n" +
                                "WHERE EXTRACT (MONTH FROM p.fechapago)="+ mes_local +"\n" +
                                "AND EXTRACT (YEAR FROM p.fechapago)=" + agno_local  + " \n" +
                                "AND cxc.rut IN (SELECT cliente FROM cli_cartera WHERE ejecutivo="+ Ejecutivo +")\n" +
                                "AND p.tipopago <> 4");
                   
                while (Rs.next()){
                
                    Date fecingreso = Rs.getDate("fingreso");
                
                    long dif = fec_limite.getTime() - fecingreso.getTime();      //Se realiza la resta entre la fecha "25" y la fecha ingreso 
             
                    dias = dif / (1000 * 60 * 60 * 24);                    //Se transforma el resultado de la resta a "dias"
                    
                    if (dias >= 0){
                
                        pago = Rs.getDouble("Pago");
                        tpago = tpago + pago;
            
                    }
                }
            
                totalcob = tpago / 1.19;
                
            }
            
            if (month-1 == mes_local_ant){     //ACTUALIZA PAGO DE COBRANZA DEL MES ANTERIOR CON FECHA LIMITE 25 DEL MES ACTUAL
            
               Rs = Sql.Select("SELECT p.monto AS Pago, p.fechapago, p.fingreso \n" +
                               "FROM cli_pagos p\n" +
                               "LEFT JOIN cli_cuentasxcobrar cxc ON p.cuenta=cxc.id \n" +
                               "WHERE EXTRACT (MONTH FROM p.fechapago)="+ mes_local_ant +"\n" +
                               "AND EXTRACT (YEAR FROM p.fechapago)=" + agno_local_ant  + " \n" +
                               "AND cxc.rut IN (SELECT cliente FROM cli_cartera WHERE ejecutivo="+ Ejecutivo +")\n" +
                               "AND p.tipopago <> 4");
                   
               while (Rs.next()){
                
                    Date fecingreso = Rs.getDate("fingreso");                   //Fecha del pago de la cobranza
                
                    long dif = fec_limite.getTime() - fecingreso.getTime();     //Se realiza la resta entre la fecha "25" y la fecha ingreso 
             
                    dias = dif / (1000 * 60 * 60 * 24);                         //Se transforma el resultado de la resta a "dias"
                
                    if (dias >= 0){
                
                        pago2 = Rs.getDouble("Pago");
                        tpago2 = tpago2 + pago2;
            
                    }
               }
            
               totalcob2 = tpago2 / 1.19;
            }
            
            
        }catch (SQLException | ParseException e) {
            Logger.getLogger(utBarraProgreso.class.getName()).log(Level.SEVERE, null, e);
        }
    
    
    }
 
     
}
