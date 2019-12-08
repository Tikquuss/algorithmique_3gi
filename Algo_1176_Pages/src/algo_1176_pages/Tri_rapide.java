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
public class Tri_rapide {
    
    public static void tri_rapide(int[] T){
        tri(T, 0, T.length-1);
    }
    
    public static void tri_rapideRandomisé(int[] T){
        triRandomisé(T, 0, T.length-1);
    }
    
    public static void tri(int[] T, int p, int r){
        if(p<r){
            int q = partition(T, p, r);
            tri(T, p, q-1);
            tri(T, q+1, r);
        }
    }
    
    public static void triRandomisé(int[] T, int p, int r){
        if(p<r){
            int q = partitionRandomisé(T, p, r);
            triRandomisé(T, p, q-1);
            triRandomisé(T, q+1, r);
        }
    }
    
    public static int partition(int[] T, int p, int r){
        int x = T[r]; // Le pivot
        int i = p-1, tmp;
        for(int j = p; j<r; j++){
            if(T[j] <= x){
                i++;
                //permuter T[i] ↔ T[j]
                tmp = T[i];
                T[i] = T[j];
                T[j] = tmp;
            }
        }
        //permuter T[i + 1] ↔ T[r]
        tmp = T[i+1];
        T[i+1] = T[r];
        T[r] = tmp;
        return i+1;
    }
    
    public static int partitionRandomisé(int[] T, int p, int r){
        int pivot = (int)Util.alea(p, r, true);
        //int x = T[pivot]; // Le pivot aléatoire
        int i = p-1, tmp;
        for(int j = p; j<pivot; j++){
            if(T[j] <= T[pivot]){
                i++;
                //permuter T[i] ↔ T[j]
                tmp = T[i];
                T[i] = T[j];
                T[j] = tmp;
            }
        }
        //permuter T[i + 1] ↔ T[pivot]
        tmp = T[i+1];
        T[i+1] = T[pivot];
        T[pivot] = tmp;
        return i+1;
    }
    
    public static void main(String[] args) {
        /*
        int[] T = {2, 1, 4, 5, 0, 3, 2, 2, 1};
        Util.afficheTab(T, 9);
        tri_rapide(T);
        Util.afficheTab(T, 9);
        
        int[] id = {1, 1, 1, 1, 1};
        System.out.println(partition(id, 1, 3));
        //*/
        //*
        int max = 10000;
        int[] A = new int[max];
        for(int i = 0; i < max; i++)
            A[i] = max-i;
        tri_rapideRandomisé(A);
        Util.afficheTab(A, max);
        //*/
    }
}
