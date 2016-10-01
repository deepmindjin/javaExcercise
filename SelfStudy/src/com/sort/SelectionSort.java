package com.sort;

public class SelectionSort {
	
    public static void main(String[] args) {
        
        int a[]  = new int[10];
        int min= 0 ;
        int k =0;
        
        // Create array of random numbers
        for (int i = 0; i < 10; i++) {
            a[i] = (int)Math.ceil(Math.random()*100);            
            System.out.print(" "+a[i]);
        }
        
        // Set the minimum as the first one of array
        min = a[0];
        
        // Check out the minimum through all numbers
        for (int i = 0; i < a.length; i++) {
        	// If find out, then put it into min and its index into k
            for (int j = a.length-1; j >= i; j--) {
                if(min > a[j]){
                    min = a[j];
                    k = j;
                }
            }
            
            // Swap the minimum and front one
            a[k] = a[i];
            a[i] = min;
            
            // Set minimum as the first one of rest array
            if(i<a.length-1){
                min=a[i+1];
            }    
        }
                    
        // Print sorted array
        System.out.println();    
        for (int i = 0; i < 10; i++) {        
            System.out.print(" "+a[i]);
        }
    }
}

