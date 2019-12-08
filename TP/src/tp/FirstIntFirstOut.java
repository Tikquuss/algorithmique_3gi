/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp;

/**
 *
 * @author Notsawo
 */
public class FirstIntFirstOut {
    public final static int MAX =  200;
    private int size = 0;
    private int tab_element[];

    public FirstIntFirstOut() {
        tab_element = new int[MAX];
    }
    
    public FirstIntFirstOut(int taille) {
        if(taille > MAX)
            throw new IllegalArgumentException();
        tab_element = new int[taille];
    }

    public boolean is_empty() {
        if(size == 0)
          return true;
        return false;
    }

    //size > 0
    public int first(){
        if(size == 0)
            throw new IllegalArgumentException();
        return tab_element[0];
    }

    //size < MAX
    public void add(int val) {
        if(size  >= MAX)
            throw new IllegalArgumentException();
        tab_element[size++] = val;
    }

    //size > 0
    public void remove() {
        if(size == 0)
            throw new IllegalArgumentException();
        int i;
        for(i = 0; i < size - 1; i++){
                tab_element[i] = tab_element[i + 1];
        }
        size--;
    }
}
