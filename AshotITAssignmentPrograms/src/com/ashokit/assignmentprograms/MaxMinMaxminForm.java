package com.ashokit.assignmentprograms;

import java.util.Scanner;

public class MaxMinMaxminForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i,j, count=0,temp=0;
		int a[]=new int[20],b[]=new int[20];
    Scanner s=new Scanner(System.in);
    System.out.println("Enter  the number of elements");
     n=s.nextInt();
    System.out.println("Enter the array numbers");
   
    for(i=0;i<n;i++){
    	a[i]=s.nextInt();
    }
            
 System.out.println("The Given array after arranging max min order  is :"); 
 
    for(i=0;i<n;i++) {
    	for(j=i+1;j<n;j++) {
    		if(a[i]>a[j]) {
        		temp=a[i];
        		a[i]=a[j];
        		a[j]=temp;
        	}	
    	}
    	
    }
    for(i=0,j=1;i<n;i++,j=j+2) {
    	b[j]=a[i];
    	//j=j+2;
    	    } 
    for(i=n-1,j=0;i>0;i--,j=j+2) {
    	b[j]=a[i];
    	//j=j+2;
    	    }  
    
    for(i=0;i<n;i++) {
    	 System.out.print(b[i] + " ");
    }
   

    
	}

}
