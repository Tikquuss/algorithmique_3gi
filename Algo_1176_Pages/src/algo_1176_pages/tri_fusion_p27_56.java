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
public class tri_fusion_p27_56 {
    
    // Fusionne les deux tableaux [min, ..., milieu] et [milieu+1, ...,max]
    public static void fusion(int[] A, int min, int milieu, int max){
        int i, j, k = 0;
        int n1 = milieu - min + 1;
        int n2 = max - milieu;
        int[] Gauche = new int[n1];
        int[] Droite = new int[n2];
        
        for(i = 0; i < n1; i++)
            Gauche[i] = A[i+min];
        for(j = 0; j < n2; j++)
            Droite[j] = A[j+milieu+1];
        i = j = 0;
        
        while(i < n1 && j < n2){
            if(Gauche[i] < Droite[j]){
                A[k] = Gauche[i];
                i++;
            }else{
                A[k] = Droite[j];
                j++;
            }
            k++;
        }
        for(int l = i; l < n1; l++){
            A[k] = Gauche[i];
            k++;
        }
        for(int l = j; l < n2; l++){
            A[k] = Droite[j];
            k++;
        }
    
    }
    
    public static void triFusion(int[] A, int min, int max){
        int milieu = 0;
        if(min < max){
            milieu = (max+min)/2;
            triFusion(A, min, milieu);
            triFusion(A, milieu+1, max); 
            fusion(A, min, milieu, max);
        }
        //return A;
    }
    
    public static void main(String[] args) {
       int[] T = {2, 1, 4, 5, 0, 3, 2, 2, 1};
       triFusion(T, 0, 9);
       Util.afficheTab(T, 9);
    }
}
