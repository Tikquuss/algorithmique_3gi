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
public class exo2_1_4_addition_tableau {
    public static int[] addition(int[] A, int[] B, int taille, int base){
        int[] C = new int[taille + 1];
        int reste = 0;
        for(int i = taille - 1; i >= 0; i--){
            C[i+1] = (A[i]+B[i] + reste)%base;
            reste =  (A[i]+B[i]) - reste;
        }
        C[0] = reste;
        return C;
    }
    
    public static void main(String[] args) {
        int[] A = {1, 0, 0, 1, 1, 1, 1, 1, 1};
        int[] B = {1, 0, 0, 1, 1, 1, 1, 1, 1};
        
        Util.afficheTab(addition(A, B, 2, 9), 10);
        
    }
}
