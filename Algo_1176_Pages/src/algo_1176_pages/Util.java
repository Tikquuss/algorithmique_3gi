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
public class Util {
    public static void afficheTab(int[] T, int l){	
	for(int i = 0; i < l; i++){
            System.out.printf(T[i] + " | ");
	}
	System.out.println("\n\n");
    }
    
        public static int[][] copie(int[][] T, int L, int C){
        int[][] tmp = new int[L][C];
        for(int i = 0; i < L; i++){
            for(int j = 0; j < C; j++)
		tmp[i][j] = T[i][j];
	}
        return tmp;
    }
        
    public static double alea(int min,int  max, boolean isInteger){    
        if(!isInteger)
            return Math.random() * (max - min) + min;
        else
            return Math.floor( Math.random() * (max - min + 1) + min );
    }
}
