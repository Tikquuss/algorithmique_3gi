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
public class exo_2_3_7_VoirLenonce {
    public static boolean Somme_existe(int[] S, int somme){
        if(S.length == 1) 
            return false;
        else{
            int i = 0, j = 0, c = S.length;
            boolean b = false;
            while(i < c && !b){
                j = i+1;
                while(j < c && !b){
                    b = (somme == S[i] + S[j]);
                    System.out.print(i+"-"+j+" : ");
                    System.out.println(S[i]+"-"+S[j]);
                    j++;
                }
                i++;
            }
            i--;
            j--;
            System.out.println(i+"-"+j);
            return b;
        }
    }
    
    //Incorrect
    public static boolean Somme_existe(int[] S, int somme, int d, int f){
        //if(d == f) 
            //return false;
        if(d+1 == f)
            return somme == S[d] + S[f];
        else{
            int milieu = (d+f)/2;
            System.out.println(d+"-"+f+"-"+milieu);
            return Somme_existe(S, somme, d, milieu) || Somme_existe(S, somme, milieu, f);
        }
    }
    
    public static void main(String[] args) {
        int[] T = {4, 1, 4, 5, 0, 3, 1, 2, 10};
        Util.afficheTab(T, 9);
        //System.out.println(Somme_existe(T, 12));
        System.out.println(Somme_existe(T, 1, 0, 8));
    }
}
