/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD1;

import static TD1.exo1.tri_insertion;
import td.Util;

/**
 *
 * @author HP
 */
public class exo2 {
     public static int dichotomie(int[] T, int v, int gauche, int droite){
        int milieu;
        if(gauche <= droite){
            milieu = (gauche + droite)/2;
            if(T[milieu] == v)
                return milieu;
            if(v < T[milieu])
                return dichotomie(T, v, gauche, milieu - 1);
            else
                return dichotomie(T, v, milieu + 1, droite);
        }
        return -1;
    }
     
    
    
    public static void main(String[] args) {
        int[] T = {2, 1, 4, 5, 0, 3, 2, 2, 1};
        Util.afficheTab(T, 9);
        int[] tmp = tri_insertion(T, 9);
        Util.afficheTab(tmp, 9);
        System.out.println(dichotomie(tmp, 6, 0, 8));
        System.out.println(dichotomie(tmp, 2, 0, 8));
        System.out.println(dichotomie(tmp, 0, 0, 8));
    }
}
