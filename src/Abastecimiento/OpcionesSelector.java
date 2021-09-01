/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abastecimiento;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author cristian
 */
public class OpcionesSelector {
   // String Multifamiliar[]={"1","2","3","4","5"};
    String Hospedaje[]= {"Hoteles apart-hotel y hostales","Albergues"};
    String Leducacionales[]= {"Alumnado y personal  no residente","Alumnado y personal residente"};
    String Piscinas[]= {"Con recirculación de las  aguas de rebose ","sin circulación de las aguas de rebose ","Públicas","Semi públicas","Privada o residenciasles","sanitarios de vestuarios o cuartos aseo"};
    String Plantas[]= {"Estaciones de recibo y enfriamiento","Plantas de pasteurización","Fábrica de mantequilla,queso o leche"};
    String Estaciones []={"Lavado automático","Lavado no automático","Estación de gasolina","Garajes y parques de estacionamiento"};
    String EdiAnimales[]= {"Ganado lechero","Bovinos y equinos","Ovinos y porcinos ","aves"};
    String Mataderos[]= {"Bovinos","porcinos ","Ovinos y Caprinos","Aves en general"};
    String LocaSalud[]= {"Hospitales y clinicas","Consultorios medicos","Clinicas dentales"};
    String Lavanderia[]={"Lavanderia","Lavanderia en seco tintoreria y similares"}; 
    String Dormitorios[]={"Dormitorios X Dto"};
    String Dormitorio[]={"Dormitorio"};
    String Area[]={" Area m²"};
    String volumen[]={" Volumen m³"};
    String litros[]={" Litros"};
    String persona[]={" Personas"};
    String asiento[]={" Asiento"};
    String kgRopa[]={" Kg ropa"};
    String Kg[]={" Kg"};
    String Animal[]={" Animal"};
    String aves[]={" Aves"};
    String camas[]={" Camas"};
    String consultorio[]={" Consultorios"};
    String UnidadDental[]={" Unidad Dental"};
    String UnidadLAvado[]={" Unidad lavado"};
    String Asiento[]={" Asientos"};
    String LitrosEspectador[]={" Litros Espectador"};
    String preparado[]={" Cubiertos preparados"};
    String Surtidor[]={" Surdidores"};
    String Espectador[]={" Espectador"};
    float consumo,Dotacion;
    DefaultComboBoxModel select=new DefaultComboBoxModel();
    Cal_Dotaciones CD =new Cal_Dotaciones();
   public String [] OpcionesSelector(int caso) {

        String var[] = {"vacio"};
         if(caso==3){
          //Hospedaje
          var=Hospedaje;
            return var;
         }else if (caso==6 || caso==7) {
           // Leducacionales;
          var=Leducacionales;
           return var;
         }else if (caso==21){
             //
          var=Piscinas;
              return var;
         }else if (caso==27){
             //
          var=Plantas;
              return var;
         }else if (caso==28){
             //
          var=Estaciones;
              return var;
         }else if (caso==29){
             //
          var=EdiAnimales;
              return var;
         }else if (caso==30){
             //
          var=Mataderos;
              return var;
         }else if (caso==32){
             //
          var=LocaSalud;
              return var;
         }else if (caso==33){
             //
          var=Lavanderia;
              return var;
         }
          
        return var;
    
    }
  
   public String [] OpcionesSelector3(int pos1,int pos2){
       String var3[] = {""};
     if(pos1==1||pos1==31||pos1==4){
         var3=Area;
         return var3;
       }
     if(pos1>21&&pos1<=26){
         var3=Area;
      return var3;
     }
     if(pos1==2){
         var3=Dormitorios;
         return var3;
      }
     if(pos1==3){
         if(pos2==0){
              var3=Dormitorio;
         }else if(pos2==1){
              var3=Area;
         }
       return var3;
      }
     if(pos1==5){
          var3=preparado;
          return var3;
         }
     if(pos1==21){
         if(pos2<2){
         var3=Area;
         }else{
         var3=volumen;
         }
         return var3;
      }
     if(pos1==27){
         var3=litros;
         return var3;
      }
     if(pos1==6||pos1==7){
         var3=persona;
         return var3;
      }
     if(pos1>=8&&pos1<=10){
         var3=asiento;
      return var3;
     }if(pos1>10&&pos1<=13){
         var3=Area;
      return var3;
     }
     if(pos1>13&&pos1<=20){
         var3=Espectador;
      return var3;
     }
   
     
     if(pos1==28){
          if(pos2<2){
          var3=UnidadLAvado;
          }else if(pos2==2){
           var3=Surtidor;  
          }else if(pos2==3){
           var3=Area;
          }
          return var3;
      }
     if(pos1==29){
        if (pos2<=2){
            var3=Animal;
          }else{
              var3=aves;
          }
        return var3;
      }
      if(pos1==30){ 
          if(pos2<2){
            var3=Animal;
          }else{
            var3=Kg;
          }
       return var3;
      } if(pos1==32){ 
          if(pos2==0){
            var3=camas;
          }if(pos2==1){
            var3=consultorio;
          }if(pos2==2){
            var3=UnidadDental;
          }
       return var3;
      }
      
      if(pos1==33){
         var3=kgRopa;
         return var3;
      }if(pos1==34){
         var3=Area;
         return var3;
      } 
    
       return var3;
      
   }

}