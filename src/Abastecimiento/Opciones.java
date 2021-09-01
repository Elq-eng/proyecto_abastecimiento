/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abastecimiento;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author cristian
 */
public class Opciones {

    
    DefaultTableModel model = new DefaultTableModel();

    public Opciones(DefaultTableModel model){
               
            model.addColumn("Establecimiento");
            model.addColumn("Tipo");
            model.addColumn("Unidad");
            model.addColumn("Dotacion");
            model.addColumn("Consumo");
            model.addColumn("Cantidad");
            model.addColumn("Observaciones");
    }

  
    public Object datos_tabla(DefaultTableModel model, String Esta, String tipo,String Selector3 , float  dotacion ,float consumo,float cantidad ,String obser){     
     model.addRow(new Object[] {Esta,tipo,Selector3,dotacion,consumo,cantidad,obser});
     return model;   
    }
    
} 