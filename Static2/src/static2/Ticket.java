/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package static2;

/**
 *
 * @author rivar
 */
public class Ticket {
    private int contador;
    private int numero;
    private String fechaCompra;
    private String DNIpersona;
    
    public Ticket(String fechaCompra, String DNIPersona){
        contador++; //contador = contador +1
        this.fechaCompra = fechaCompra;
        this.DNIpersona = DNIPersona;
    }

    @Override
    public String toString() {
        return "Ticket{" + "numero=" + numero + ", fechaCompra=" + fechaCompra + ", DNIpersona=" + DNIpersona + '}';
    }
    
    
}
