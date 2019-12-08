package com.company;

/**
 * Created by veronne on 20/02/17.
 */
public class Tri {

    private int longueur;
    private int taille;
    private int [] tableau = new int [longueur];

    public Tri(int[] A){
        this.tableau = A;
        this.longueur = A.length;
        this.taille = A.length;
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public int[] getTableau() {
        return tableau;
    }

    public void setTableau(int[] tableau) {
        this.tableau = tableau;
    }

    public int Parent (int i){
        if (i%2==0) return i/2 -1;
        else return i/2;
    }

    public int Gauche (int i){
        return 2*i;
    }

    public int Droite(int i){
        return 2*i+1;
    }

    public void Echanger(int i, int j){

        int [] A = this.getTableau();
        int tmp;
        tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }

    public void Entasser_Max(int i){

        int l = Gauche(i);
        int r = Droite(i);
        int max;

        if(l< this.getTaille() && (this.getTableau()[l]>this.getTableau()[i])){
            max = l;
        }
        else max = i;
        if ((r < this.getTaille()) && (this.getTableau()[r] > this.getTableau()[max])) {
            max = r;
        }
        if (max !=i ){
            this.Echanger(i, max);
            this.Entasser_Max(max);
        }

    }

    public void Construire_Tas_Max (){
        this.setTaille(this.getLongueur());
        for(int i=(this.getLongueur()/2); i>=0; i--){
            this.Entasser_Max(i);
        }
    }

    public void Tri_Par_Tas(){
        this.Construire_Tas_Max();
        for(int i=this.getLongueur() - 1; i>=1; i--){
            this.Echanger(0,i);
            this.setTaille(this.getTaille() - 1);
            this.Entasser_Max(0);
        }
    }
    
    public int Partition (int p, int r)
    {
    	int x = this.getTableau()[r];
    	int i = p - 1;
    	for (int j =p; j<= r; j++)
    	{
    		if (this.getTableau()[j]<= x)
    		{
    			i++;
    			this.Echanger(j, r);
    		}
    	}
    	
    	this.Echanger(i+1, r);
    	return i+1;
    }
    
    public void Tri_Rapide (int p, int r)
    {
    	if (p<r)
    	{
    		int q = this.Partition(p, r);
    		this.Tri_Rapide(p, q-1);
    		this.Tri_Rapide(q+1, r);
    	}
    }
    
    public void Affiche_Tableau(){
        for (int i=0; i<this.getLongueur(); i++){
            System.out.print(this.tableau[i]);
            System.out.print(" ");
        }
        System.out.print("\n");
    }
}
