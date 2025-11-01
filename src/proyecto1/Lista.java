/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author LEO
 */
public class Lista {
    Nodo primero;
    public Lista(){
        primero= null; 
    }
    public void insertar(String usuario){
        Nodo nuevo= new Nodo(usuario); 
        if(this.primero==null){
            this.primero= nuevo;
        }else{
            Nodo aux= this.primero;
            while(aux.sig!=null){
                aux=aux.sig; 
            }
            aux.sig= nuevo;
        }
    }
        public void eliminar(String usuario){
            if (this.primero!=null){
                Nodo aux= this.primero;
                while(aux.sig!=null && !aux.sig.usuario.equals(usuario)){
                 aux=aux.sig;
                }
                if(aux.sig!=null){
                    aux.sig= aux.sig.sig;
                }             
    }
}
        public Nodo buscar(String usuario){
            if (this.primero!=null){
                Nodo aux=this.primero;
                while(aux!=null && !aux.usuario.equals(usuario)){
                    aux=aux.sig;
                }
                return aux;
            }
            return null;
        }
        public String mostrar(){
            Nodo aux= this.primero;
            String lista="";
            while(aux!=null){
                lista+=aux.usuario+ ", ";
                aux=aux.sig;
            }
            return lista; 
        }
}