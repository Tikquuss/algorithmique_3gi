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
public class exo_2_3_6_tri_insertion_dichotomique {
    
    public static int[] tri(int[] T, int n){
        int[] temp = T.clone();
        int cle, j;
        for(int i = 1; i < n; i++){
            //insertion de Tab[i] dans la liste triée Tab[0], Tab[1], ...,Tab[i-1]
            cle = temp[i];
            j = i-1;
            // Il est question de remplacer cette recherche lineaire par une recherche dichotomique
            while(j >= 0 && temp[j] > cle){
               temp[j+1] = temp[j];
               j--;
            }
            temp[j+1] = cle;
        }
        return temp;
    }
    
    public static void main(String[] args) {
        int[] T = {2, 1, 4, 5, 0, 3, 2, 2, 1};
        Util.afficheTab(tri_insertion.tri(T, 9), 9);
        
        int max = 10000000;
        int[] A = new int[max];
        for(int i = 0; i < max; i++)
            A[i] = max-i;
        Util.afficheTab(tri(A, max), max);
    }
}
