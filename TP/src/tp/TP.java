/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp;

/**
 *
 * @author Notsawo
 */
public class TP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FirstIntFirstOut f = new FirstIntFirstOut();
        //Test de fonctionnement
        System.out.println("Ma file est-elle vide ? :" + f.is_empty());
        f.add(100);
        f.add(4);
        f.add(4);
        f.add(6);
        f.remove();
        System.out.println("1er element :" + f.first());
        f.remove();
    }
    
}
