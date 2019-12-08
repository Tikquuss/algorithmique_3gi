package algo_1176_pages;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class exo2_1_3_rech_lineaire {
    
    private static int lineaire(int[] T, int v){
        int i = 0, c = T.length;
        // Eviter de mettre la condition T[i] != v && i < c
        // Si non il y'aura debordement : T[c] != v.
        while(i < c && T[i] != v){
            i++;
        }
        if(i < c)
            return i;
        else
            return -1;
    }
    
    
    public static void main(String[] args) {
        int[] T = {2, 1, 4, 5, 0, 3, 2, 2, 1};
        Util.afficheTab(T, 9);
        System.out.println(lineaire(T, 6));
        System.out.println(lineaire(T, 2));
        System.out.println(lineaire(T, 0));
    }
}
