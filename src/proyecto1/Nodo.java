/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author LEO
 */
public class Nodo {
     String usuario;
     Nodo sig; 
 
     public Nodo(String usuario){
         this.usuario= usuario;
         this.sig= null;
     }
}
