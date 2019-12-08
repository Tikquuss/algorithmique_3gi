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
public class Tri_par_tas {
    
    public static class Tableau{
        private int[] T;
        private int taille;
        private int longueur; // Taille du tableau
        
        // On doit toulours avoir taille <= longueur.
        public Tableau(){
            
        }
        public Tableau(int[] T){
            this.T = T;
            this.taille = this.longueur = T.length;
        }

        public int[] getT() {
            return T;
        }

        public void setT(int[] T) {
            this.T = T;
        }

        public int getTaille() {
            return taille;
        }

        public void setTaille(int taille) {
            this.taille = taille;
        }

        public int getLongueur() {
            return longueur;
        }

        public void setLongueur(int longueur) {
            this.longueur = longueur;
        }
    }
    
    // Ici les indices partent de 0
    public static int PARENT(int i){
        if(i != 0)
            return (i-1)/2;
        else
            return 0; // 0 n'a pas de parent
    }
    public static int GAUCHE(int i){
        return 2*i+1;
    }
    public static int DROITE(int i){
        return 2*i+2;
    }
    
    /*
    ENTASSER-MAX prend en entrée un tableau A et un indice i. Quand ENTASSER-MAX est appelée, on suppose que 
    les arbres binaires enracinés en GAUCHE(i) et DROITE(i) sont des tas max, mais que A[i] peut être plus petit 
    que ses enfants, violant ainsi la propriété de tas max. Le rôle de ENTASSER-MAX est de faire «descendre» la valeur
    de A[i] dans le tas max de manière que le sous-arbre enraciné en i devienne un tas max.
    */
    public static void ENTASSER_MAX(Tableau A, int i){
        int max, l = GAUCHE(i), r = DROITE(i), tmp;
        if(l < A.getTaille() && r < A.getTaille()){
            if(A.getT()[l] > A.getT()[i]){
                max = l; 
            }else{
                max = i;
            }
            if(A.getT()[r] > A.getT()[max]){
                max = r; 
            }
            //permuter(A[i], A[max]);
            //System.out.println(A.getT()[max]);
            tmp = A.getT()[i];
            A.getT()[i] = A.getT()[max];
            A.getT()[max] = tmp;
            //Util.afficheTab(A.T, A.getLongueur());
            ENTASSER_MAX(A, max);
        }
        else if(l < A.getTaille()){
            if(A.getT()[l] > A.getT()[i]){
                max = l; 
            }else{
                max = i;
            }
            tmp = A.getT()[i];
            A.getT()[i] = A.getT()[max];
            A.getT()[max] = tmp;
            ENTASSER_MAX(A, max);
        }else if(r < A.getTaille()){
            if(A.getT()[r] > A.getT()[i]){
                max = r; 
            }else{
                max = i;
            }
            tmp = A.getT()[i];
            A.getT()[i] = A.getT()[max];
            A.getT()[max] = tmp;
            ENTASSER_MAX(A, max);
        }  
    }
    
    // Page 126
   
    public static void CONSTRUIRE_TAS_MAX(Tableau A){
        A.taille = A.longueur;
        for(int i = A.longueur/2-1; i >= 0;i--){
            //System.out.println(A.getT()[i]);
            ENTASSER_MAX(A, i);
            //System.out.println(A.getT()[i]+"\n");
            //Util.afficheTab(A.getT(), A.getLongueur());
        }
    }
    
    public void TRI_PAR_TAS(int[] T){
        int tmp;
        Tableau A = new Tableau(T);
        CONSTRUIRE_TAS_MAX(A);
        for(int i = A.longueur-1; i >= 1;i--){
            //faire échanger A[1] ↔ A[i]
            tmp = A.T[i];
            A.T[i] = A.T[1];
            A.T[1] = tmp;
            
            A.taille = A.taille - 1;
            ENTASSER_MAX(A, 0);
        }
    }
        
    public static void main(String[] args) {
        //*
        int[] T = {2, 1, 4, 5, 0, 3, 2, 2, 1};
        Tableau A = new Tableau(T);
        Tri_par_tas tp = new Tri_par_tas();
        tp.ENTASSER_MAX(A, 0);
        //Util.afficheTab(T, 9);
        //tp.CONSTRUIRE_TAS_MAX(A);
        
        //*/
        /*
        int[] T = {2, 1, 4, 5, 0, 3, 2, 2, 1};
        Util.afficheTab(T, 9);
        new Tri_par_tas().TRI_PAR_TAS(T);  
        Util.afficheTab(T, 9);
        //*/
        /*
        int[] T = {2, 1, 3};
        Util.afficheTab(T, 3);
        new Tri_par_tas().TRI_PAR_TAS(T);  
        Util.afficheTab(T, 3);
        //*/
    }   
}
