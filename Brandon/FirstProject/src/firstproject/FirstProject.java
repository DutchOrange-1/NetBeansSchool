/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;

/**
 *
 * @author Brandon
 */
public class FirstProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "Brandon"; 
        int numberOfItems = 6; 
        int [] qty = {5,6,87,12,4,68,2,4}; // Qountity of goods in same order as the name of goods
        String [] names = {"Bread   ", "Milk   ", "Eggs   ", "Cheese   ", "Onions   ", "Tomatos" }; // Names of goods
        int totalGoods=0; 
        
        int length = name.length(); 
        System.out.print("Shopping list\n-------------\nItem \t \t Description \t \t Qty\n---- \t \t ----------- \t \t --- \n");
        for (int i = 0; i <= numberOfItems-1; i++) {
            System.out.print((i+1) +" \t \t "+ names[i]+"\t \t "+ qty[i]+"\n"); //Printing out item number, item and n.o of goods. 
        }
        for (int i = 0; i < numberOfItems; i++) {  //Quntity of goods caculation. 
            totalGoods=totalGoods+qty[i]; 
        }
        System.out.print("Totall goods = "+ totalGoods + "\n- - - - - - - - - - - - - - - - - - - - - - - - -\n \n");
    }
    
}
