/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abastecimiento;

/**
 *
 * @author cristian
 */
public class CalculosCasos {
    float selector,cantidad,consumo,Dotacion;

    public void setSelector(float selector) {
        this.selector = selector;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    public void setDotacion(float Dotacion) {
        this.Dotacion = Dotacion;
    }

    public void setCD(Cal_Dotaciones CD) {
        this.CD = CD;
    }

    public float getSelector() {
        return selector;
    }

    public float getCantidad() {
        return cantidad;
    }

    public float getConsumo() {
        return consumo;
    }

    public float getDotacion() {
        return Dotacion;
    }

   
    
    Cal_Dotaciones CD=new Cal_Dotaciones();
     public void CalcularValores(int pos1,int pos2,float selector,float cantidad) {
        if(pos1==1){
          //Unifamiliar
          CD.ViviendaUnifamiliar(selector, cantidad);
          consumo=CD.consumo;
          Dotacion=CD.Dotacion;
         }else if(pos1==2){
          //Multifamiliar
          CD.Multifamiliar(selector,cantidad);
          
        
          consumo=CD.consumo;
          Dotacion=CD.Dotacion;
          
         }else if(pos1==3){
          //Hospedaje
          CD.Hospedaje(selector, pos2, (int) cantidad);
          consumo=CD.consumo;
          Dotacion=CD.Dotacion;

         }else if (pos1==4) {
           // Restaurantes;
          CD.Restaurante(selector, cantidad);
          consumo=CD.consumo;
          Dotacion=CD.Dotacion;
           
         }else if (pos1==5){
             //
          CD.localfuera((int)cantidad,(int)selector);
          consumo=CD.consumo;
          Dotacion=CD.Dotacion;
             
         }else if (pos1==6||pos1==7){
             //
          CD.Educacionales((int) selector, pos2, (int) cantidad);
          consumo=CD.consumo;
          Dotacion=CD.Dotacion;
             
         }else if (pos1>=8&&pos1<=20){
             //
          CD.LocalesEspectaculos(pos1, (int) selector,(int) cantidad);
          consumo=CD.consumo;
          Dotacion=CD.Dotacion;
             
         }else if (pos1==21){
             //
          CD.Piscinas(pos2,(int)selector,(int)cantidad);
          consumo=CD.consumo;
          Dotacion=CD.Dotacion;
            
         }else if (pos1>=22&&pos1<=26){
             //
          CD.DotacionesIJKLM(pos1, (int) selector,(int) cantidad);
          consumo=CD.consumo;
          Dotacion=CD.Dotacion;
              
         }else if (pos1==27){
             //
          CD.PlantasProduccion(pos2, selector, (int) cantidad);
          consumo=CD.consumo;
          Dotacion=CD.Dotacion;
             
         }else if (pos1==28){
             //
          CD.EstacionesServicio(pos2,(int)selector ,(int) cantidad);
          consumo=CD.consumo;
          Dotacion=CD.Dotacion;
             
         }else if (pos1==29){
             //
          CD.AlojamientoAnimal(pos2, (int) cantidad, (int) selector);
          consumo=CD.consumo;
          Dotacion=CD.Dotacion;
             
         }else if (pos1==30){
             //
          CD.Mataderos(pos2, (int) cantidad, (int) selector);
          consumo=CD.consumo;
          Dotacion=CD.Dotacion;
             
         }else if (pos1==31){
             //
          CD.BaresSoda(pos2, selector, (int) cantidad);
          consumo=CD.consumo;
          Dotacion=CD.Dotacion;
             
         }else if (pos1==32){
             //
          CD.LocalSalud(pos2,(int) cantidad, (int) selector);
          consumo=CD.consumo;
          Dotacion=CD.Dotacion;
             
         }else if (pos1==33){
             //
          CD.Lavanderia(pos2, (int) cantidad,selector);
          consumo=CD.consumo;
          Dotacion=CD.Dotacion;
             
         }else if (pos1==34){
             //
          CD.AreVerde(selector, (int) cantidad);
          consumo=CD.consumo;
          Dotacion=CD.Dotacion;
             
         }
          
    
    
    }
    
}
