package com.company;

public class Test {

    public static void main(String[] args) {
	// write your code here

        int [] A = {-1,13,3,16,13,-2,1,5,7,12,4,8,9,0};

        Tri test = new Tri(A);

        test.Affiche_Tableau();

        test.Tri_Par_Tas();
        
        System.out.println("Tri Par Tas \n");
        test.Affiche_Tableau();
        
        test.Tri_Rapide(0, test.getTaille() -1);
        
        System.out.println("\n Tri Rapide \n");
        test.Affiche_Tableau();

    }
}
