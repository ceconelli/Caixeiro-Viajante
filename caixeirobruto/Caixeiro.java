/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixeirobruto;

/**
 *
 * @author gceconelli
 */
public class Caixeiro {
    
    private AdMatrix matriz;
    private boolean[] visited;
    private int counter;
    private int travels;
    
    public Caixeiro(int n){
        this.travels = 0;
        this.counter = 0;
        this.matriz = new AdMatrix(n);
        this.visited = new boolean[n];
        for(int i=0;i<n;i++){
            this.visited[i] = false;
        }
    }
    
    public int fat(int n){
        if (n == 0)    
            return 1;    
        else    
            return(n * fat(n-1));    
    }
    
    public void percorrer(int currentCity,int i,int j,int dist){
        
    }
    
}
