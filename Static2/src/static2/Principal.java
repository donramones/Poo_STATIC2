/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package static2;

/**
 *
 * @author rivar
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ticket t1 = new Ticket("2025/08/20","30234566");
        Ticket t2 = new Ticket("2025/09/30","40299566");
        Ticket t3 = new Ticket("2025/07/10","20234896");
        Ticket t4 = new Ticket("2025/11/20","39287668");
        
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        
    }
    
}
