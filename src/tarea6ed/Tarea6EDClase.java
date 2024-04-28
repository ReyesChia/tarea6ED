/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6ed;

/**
 *
 * @author reyes
 */
public class Tarea6EDClase {
    
    private static final double DESCUENTOMAYOR = 0.95;
    private static final double DESCUENTOMENOR = 0.8;
    
    public void aplicarDescuento(double precioProducto, int numeroProductos){     
        
    double Total;
    
    if(numeroProductos>3){
        precioProducto-=5;
        if (numeroProductos!=0){
            Total = precioProducto*DESCUENTOMENOR;           
        }else {
            Total = precioProducto*DESCUENTOMAYOR;
        } 
        mensajeDescuento(Total);
    }    
    }

    
    private void mensajeDescuento(double Total) {
        System.out.println("El total a pagar es:"+Total);
        System.out.println("Enviado");
    }
}
