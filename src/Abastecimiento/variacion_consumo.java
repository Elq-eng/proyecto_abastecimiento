
package Abastecimiento;

import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.table.DefaultTableModel;

public class variacion_consumo {
    
    //definicion de variables
   double consumo,Qm,Qmd, factormayoracion = 1.50, Qmh,Qmm;
   int valor = 86400;
   double valueK1, valueK2;
   int contador; 
   DefaultTableModel model = new DefaultTableModel();

   
    
    public variacion_consumo(DefaultTableModel model) {
        model.addColumn("Codigo");
        model.addColumn("Año");
        model.addColumn("Poblacion");
        model.addColumn("Consumo(L/hab.d)");
        model.addColumn("Qm (L/s)");
        model.addColumn("Factor mayoración");
        model.addColumn("Qmd (L/s)");
        model.addColumn("Qmh (L/s)");
        model.addColumn("Qmm (L/s)");
    }
    
    public double getQmm() {
        return Qmm;
    }
    public void setQmm(double Qmm) {
        this.Qmm = Qmm;
    }
  

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getQm() {
        return Qm;
    }

    public void setQm(double Qm) {
        this.Qm = Qm;
    }

    public double getQmd() {
        return Qmd;
    }

    public void setQmd(double Qmd) {
        this.Qmd = Qmd;
    }

    public double getFactormayoracion() {
        return factormayoracion;
    }

    public void setFactormayoracion(double factormayoracion) {
        this.factormayoracion = factormayoracion;
    }

    public double getQmh() {
        return Qmh;
    }

    public void setQmh(double Qmh) {
        this.Qmh = Qmh;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public double getValueK1() {
        return valueK1;
    }

    public void setValueK1(double valueK1) {
        this.valueK1 = valueK1;
    }

    public double getValueK2() {
        return valueK2;
    }

    public void setValueK2(double valueK2) {
        this.valueK2 = valueK2;
    }

   //constructor 
    
    //funcion principal 
    public void generate_information(int ano, double poblacion, String k1, String k2)
    {
            
        //valores para K11.2;
        if(k1 == "Poblaciones mayores"){valueK1 = 1.2;}
        else if(k1 == "Poblaciones menores"){valueK1 = 1.3;}
        else if(k1 == "Clima uniforme"){valueK1 =1.2;}
        else if(k1 == "Clima variables"){valueK1 =1.3;}
        else if(k1 == "Clima pequeñas"){valueK1 =2.0;}
        
        
  
        //valores para K2
        if(k2 == "2.000 a 10.000 hab"){valueK2 = 2.5 ;}
        else if(k2 == "10.000 hab < P"){valueK2 = 1.8;}
        else if(k2 == "Urbano"){
           
            Random random = new Random();
            double limiteInferior = 1.8;
            double limiteSuperior = 0.455;
            valueK2 = limiteInferior + (limiteSuperior)*random.nextDouble();
        }
        else if(k2 == "Rural"){valueK2 =1.5;}
        else if(k2 == "P < 5.000"){valueK2 = 1.8;}
        else if(k2 == "5.000< P < 20.000"){valueK2 = 1.65;}
        else if(k2 == "20.000 < P"){valueK2 = 1.50;}
        else if(k2 == "Aldeas"){valueK2 = 1.50;}
        else if(k2 == "Pueblos"){valueK2 = 1.50;}
        
        consumo = redondeo((Math.log10(poblacion)-valueK2)/0.014);
        Qm = redondeo((poblacion * consumo)/valor);
        Qmd = redondeo(valueK1*Qm);
        Qmh = redondeo(factormayoracion * Qm);
        Qmm = redondeo(valueK1 * valueK2 * Qm);
        contador++;
        
    }
    public double redondeo(double value){
        
        System.out.print(value);
        value = Math.round(value * 100)/100d;
        return value;
    }
    
    public Object datos_Tabla(DefaultTableModel model, int codigo, int ano,
            double poblacion, double consumo, double Qm, double Qmd, double Qmh,
            double Qmm, double factormayoracion){
        
        
         model.addRow(new Object[]{codigo,ano,poblacion,consumo,Qm,factormayoracion,Qmd,Qmh,Qmm});
        
        
        return model;
    }
    
    
    
    
   
    
}
