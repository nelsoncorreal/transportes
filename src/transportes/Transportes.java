/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportes;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel Cifuentes
 */
public class Transportes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tiquetes t1 =new tiquetes();
        tiquetes t2 =new tiquetes();
        tiquetes t3 =new tiquetes();
        t1.setCosto(30000);
        t2.setCosto(50000);
        t3.setCosto(70000);
        int total=0;
        int opc=0;
        do{
         opc=Integer.parseInt(JOptionPane.showInputDialog("elija que tiquete desea de 1 a 3"));
        if(opc==1){
            t1.setNombre(JOptionPane.showInputDialog("nombre "));
            t1.setFecha(JOptionPane.showInputDialog("fecha "));
            t1.setHora(JOptionPane.showInputDialog("hora "));
            t1.setNumeroViaje(Integer.parseInt(JOptionPane.showInputDialog("numero de viaje ")));
            total+=t1.getCosto();
        }
        if(opc==2){
            t2.setNombre(JOptionPane.showInputDialog("nombre "));
            t2.setFecha(JOptionPane.showInputDialog("fecha "));
            t2.setHora(JOptionPane.showInputDialog("hora "));
            t2.setNumeroViaje(Integer.parseInt(JOptionPane.showInputDialog("numero de viaje ")));
            total+=t2.getCosto();
        }
        if(opc==3){
            t3.setNombre(JOptionPane.showInputDialog("nombre "));
            t3.setFecha(JOptionPane.showInputDialog("fecha "));
            t3.setHora(JOptionPane.showInputDialog("hora "));
            t3.setNumeroViaje(Integer.parseInt(JOptionPane.showInputDialog("numero de viaje ")));
            total+=t3.getCosto();
        }
        opc=Integer.parseInt(JOptionPane.showInputDialog("desea comprar mas 1. si 2.no"));
        }while(opc==1);
        JOptionPane.showMessageDialog(null, "el total de la compra es "+total);
    }
    
}
