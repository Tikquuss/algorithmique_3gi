/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo_1176_pages;

/**
 *
 * @author HP
 */
public class exo2_3_5_rech_dichotomique {
    public static int dichotomie(int[] T, int v, int gauche, int droite ){
        int milieu = (gauche + droite)/2;
        if(gauche <= droite){
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
        int[] tmp = tri_insertion.tri(T, 9);
        Util.afficheTab(tmp, 9);
        System.out.println(dichotomie(tmp, 6, 0, 8));
        System.out.println(dichotomie(tmp, 2, 0, 8));
        System.out.println(dichotomie(tmp, 0, 0, 8));
    }
}
