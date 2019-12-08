/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD1;
/**
 *
 * @author HP
 */
public class exo1 {
    
    // trie le tableau A[0...t-1]
    public static int[] tri_insertion(int[] A, int taille){
        if(taille == 1)
            return A;
        else{
           return insertion(taille-1, tri_insertion(A, taille-1)); 
        }
    }
    
    // trie le tableau A[d...f]
    public static int[] tri_insertion(int[] A, int d, int f){
        if(d == f)
            return A;
        else{
           return insertion(f, tri_insertion(A, d, f-1)); 
        }
    }
    
    // Insertion de l'element a la position k à sa bonne place dans A[0,  , k-1]
    // En supposant A[0,  , k-1] trié
    /*
    public static int[] insertion(int k, int[] A){
        if(k == 0){
            return A;
        }else{
            int i = k-1;
            while(A[i] > A[k] && i > 0){
                i--;
            } 
            if(i == k-1){// Tout est deja trié
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
    //*/
    //*
    public static int[] insertion(int k, int[] A){
        if(k == 0){
            return A;
        }else{
            int cle = A[k];
            int i = k-1;
            // Il est question de remplacer cette recherche lineaire par une recherche dichotomique
            while(i >= 0 && A[i] > cle){
               A[i+1] = A[i];
               i--;
            }
            A[i+1] = cle;
            return A;
        }
        
    }
    //*/
    
    public static void afficheTab(int[] T, int l){	
	for(int i = 0; i < l; i++){
            System.out.printf(T[i] + " | ");
	}
	System.out.println("\n\n");
    }
    
    public static void main(String[] args) {
        int[] T = {2, 1, 4, 5, 0, 3, 2, 2, 1};
        afficheTab(tri_insertion(T, 9), 9);
        //*
        int max = 10000;
        int[] A = new int[max];
        for(int i = 0; i < max; i++)
            A[i] = max-i;
        afficheTab(tri_insertion(A, max), max);
        //*/
    }
}
