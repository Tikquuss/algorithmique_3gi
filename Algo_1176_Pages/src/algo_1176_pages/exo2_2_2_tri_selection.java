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
public class exo2_2_2_tri_selection {
    
    public static int[] tri(int[] T){
        int c = T.length, i = 0, j = 0, min = T[0];
        int[] tmp = T.clone();
        boolean b = false;
        while(i < c-1){
            //b = true;
            for(j = i+1; j < c; j++){
                if(tmp[j] < tmp[i]){
                    min = tmp[j];
                    //b = false;
                }
            }
            tmp[j-1] = tmp[i];
            tmp[i] = min;
            i++;
        }
        return tmp;
    }
    
    public static void main(String[] args) {
        int[] T = {2, 1, 4, 5, 0, 3, 2, 2, 1};
        Util.afficheTab(tri(T), 9);
    }
}
