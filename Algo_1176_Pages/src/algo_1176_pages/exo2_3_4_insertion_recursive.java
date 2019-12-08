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
public class exo2_3_4_insertion_recursive {
    
    public static int[] tri(int[] A, int d, int f){
        if(d == f)
            return A;
        else{
           return insertion(f, tri(A, d, f-1)); 
        }
    }
    
    // Insertion de l'element a la position k à sa bonne place dans A[0,  , k-1]
    // En supposant A[0,  , k-1] trié
    public static int[] insertion(int k, int[] A){
        if(k == 0){
            return A;
        }else{
            int i = 0;
            while(A[i] <= A[k] && i < k){
                i++;
            } 
            if(i == k){// Tout est deja trié
                return A;
            }else{ // On fait un decalage
                int temp = A[k];
                for(int j = k-1; j >= i; j--){
                    A[j+1] = A[j];
                } 
                A[i] = temp;
                return A;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] T = {2, 1, 4, 5, 0, 3, 2, 2, 1};
        Util.afficheTab(tri(T, 0, 8), 9);
        
        int max = 10000;
        int[] A = new int[max];
        for(int i = 0; i < max; i++)
            A[i] = max-i;
        Util.afficheTab(tri(A, 0, max-1), max);
    }   
}
