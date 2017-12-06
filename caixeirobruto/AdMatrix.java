/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixeirobruto;

import java.util.Random;

/**
 *
 * @author gceconelli
 */
public class AdMatrix {
    
    private int[][] matriz;
    private int size;
    Random rand;
    
    public AdMatrix(int size) {
        this.rand = new Random();
        this.size = size;
        this.matriz = new int[size][size];
        this.generateMatrix(matriz,0,0);
        this.printMatrix();
    }
    
    public void generateMatrix(int mt[][],int m,int n){
        if(m > this.size)
            return;
        
        for(int i=m;i<this.size;i++){
            if(i == n)
                mt[i][n] = 0;
            else
                mt[i][n] = mt[n][i] = rand.nextInt(10);
        }
        this.generateMatrix(mt, m+1, n+1);
    }
    
    public void printMatrix(){
        System.out.print("  ");
        for(int i=0;i<this.size;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=0;i<this.size;i++){
            System.out.print(i+"|");
            for(int j=0;j<this.size;j++){
                System.out.print(this.matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int getSize(){
        return this.size;
    }
    public int[][] getMatriz() {
        return matriz;
    }
    
    



}
