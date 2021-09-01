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
public class Cal_Dotaciones {
    
float area,cantidad,Dormitorios,consumo,Dotacion;


    public void setArea(float area) {
        this.area = area;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public void setDormitorios(float Dormitorios) {
        this.Dormitorios = Dormitorios;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    public void setDotacion(float Dotacion) {
        this.Dotacion = Dotacion;
    }

    public float getArea() {
        return area;
    }

    public float getCantidad() {
        return cantidad;
    }

    public float getDormitorios() {
        return Dormitorios;
    }

    public float getConsumo() {
        return consumo;
    }

    public float getDotacion() {
        return Dotacion;
    }

    
    
public void ViviendaUnifamiliar(float area, float cantidad){
     float exceso=0;
     if (area>3000){
     exceso=area-3000;
     }
     
     if(area<=200){
         Dotacion=1500;
      }else if(area>200&&area<=300){
         Dotacion=1700;
      }else if(area>300&&area<=400){
          Dotacion=1900;
      }else if(area>400&&area<=500){
          Dotacion=2100;
      }else if(area>500&&area<=600){
          Dotacion=2200;
      }else if(area>600&&area<=700){
          Dotacion=2300;
      }else if(area>700&&area<=800){
          Dotacion=2400;
      }else if(area>800&&area<=900){
          Dotacion=2500;
      }else if(area>900&&area<=1000){
          Dotacion=2600;
      }else if(area>1000&&area<=1200){
          Dotacion=2800;
      }else if(area>1200&&area<=1400){
          Dotacion=3000;
      }else if(area>1400&&area<=1700){
          Dotacion=3400;
      }else if(area>1700&&area<=2000){
          Dotacion=3800;
      }else if(area>2000&&area<=2500){
          Dotacion=4500;
      }else if(area>2500&&area<=3000){
          Dotacion=5000;
      }else{
          Dotacion=5000+(exceso);
      }
          consumo=Dotacion*cantidad;

    }
public void Multifamiliar(float Dormitorios,float cantidad){
    float Dorm=Dormitorios;
    if(Dorm==1){Dotacion=500;}
    if(Dorm==2){Dotacion=850;}
    if(Dorm==3){Dotacion=1200;}
    if(Dorm==4){Dotacion=1350;}
    if(Dorm==5){Dotacion=1500;} 
    consumo=Dotacion*Dorm*cantidad;      
    
   }
public void localfuera(int cantidad,int cubierto){
Dotacion=8;
consumo=Dotacion*cantidad*cubierto;
}
public void Hospedaje(float selector, int tipo, int cantidad){
if(tipo==0){Dotacion=500;}
if(tipo==1){Dotacion=25;}
 consumo=Dotacion*selector*cantidad;
}
public void Restaurante (float area,float cantidad){

if(0<area&&area<=40){
  Dotacion=2000;
  consumo=Dotacion*cantidad;
}
else if(area>=41&&area<=100){
    Dotacion=50;
    consumo=Dotacion*cantidad*area;
}
else if(area>100){
    Dotacion=40;
    consumo=Dotacion*cantidad*area;

}


  
}
public void Educacionales(int  persona, int tipo,int cantidad){
if(tipo==0){
    Dotacion=50;
}if(tipo==1){
    Dotacion=200;
}
consumo=Dotacion*persona*cantidad;
}
public void LocalesEspectaculos(int tipo ,int selector,int cantidad){
if(tipo>=8&&tipo<=10){
    Dotacion=3;
}if(tipo>10&&tipo<=13){
    Dotacion=30;
}
if(tipo>13&&tipo<=20){
    Dotacion=1;
}
consumo=Dotacion*cantidad*selector;
         
}
public void Piscinas(int tipo,int selector,int cantidad){

if(tipo==0){
    Dotacion=10;
}if(tipo==1){
    Dotacion=25;
}
if(tipo==2){
    Dotacion=125;
}
if(tipo==3){
    Dotacion=80;
}
if(tipo==4){
    Dotacion=40;
}
if(tipo==5){
    Dotacion=30;
}

consumo=Dotacion*selector*cantidad;
}
public void DotacionesIJKLM(int tipo,int selector ,int cantidad){

if(tipo==22){
    //tipo i oficinas
    Dotacion=6;
}if(tipo==23){
    //j Depositos de amteriasless
    Dotacion=(float) 0.50;
}if(tipo==24){
    //k Locales comerciales
    Dotacion=6;
}if(tipo==25){
    // mercados establecimientos
    Dotacion=15;
}if(tipo==26){
    //M Consumo industrial 
    Dotacion=80;
}
  consumo=Dotacion*selector*cantidad;
}
public void PlantasProduccion(int tipo,float litros,int cantidad){
if(tipo==0||tipo==1||tipo==2){
    //Estaciones de recibo y enfriamiento 
    litros=litros/1000;
    Dotacion=1500;
    consumo=Dotacion*litros*cantidad;
}
}
public void EstacionesServicio(int tipo,int uniLavado,int cantidad){
    if(tipo==0){Dotacion=12800;}
    if(tipo==1){Dotacion=8000;}
    if(tipo==2){Dotacion=300;}
    if(tipo==3){Dotacion=2;}
    consumo=Dotacion*cantidad*uniLavado;
}

public void AlojamientoAnimal(int tipo,int cantidad,int animales){
   
    if(tipo==0){Dotacion=120;}
    if(tipo==1){Dotacion=40;}
    if(tipo==2){Dotacion=10;}
    if(tipo==3){
        int cantidadAves =(cantidad/100);
        Dotacion=20*cantidadAves;
        consumo=Dotacion*cantidadAves;
        
    }
    consumo=Dotacion*cantidad*animales;
}

public void Mataderos(int tipo,int cantidad,int animales){
if(tipo==0){Dotacion=500;}
if(tipo==1){Dotacion=300;}
if(tipo==2){Dotacion=250;}
if(tipo==3){Dotacion=16;}
consumo=Dotacion*cantidad*animales;
}
public void BaresSoda(int tipo, float area,int cantidad){
if(area<=30){Dotacion=1500;
}else if(area>31&&area<=60){
  Dotacion=60;   
}else if(area>=61&&area<=100){
  Dotacion=50;   
}else if(area>=100){
  Dotacion=40;   
}
consumo=Dotacion*cantidad;
}
public void LocalSalud(int tipo , int cantidad, int camaunidad){
    if (tipo==0){Dotacion=600;}
    if (tipo==1){Dotacion=500;}
    if (tipo==2){Dotacion=1000;}
     consumo=Dotacion*cantidad*camaunidad; 
}
public void Lavanderia(int tipo , int cantidad,float kgropa){
    if (tipo==0){Dotacion=40;}
    if (tipo==1){Dotacion=30;}
    
     consumo=Dotacion*cantidad*kgropa; 
}
public void AreVerde(float selector, int cantidad){
   Dotacion=2;
   consumo=Dotacion*cantidad*selector;
}
}
