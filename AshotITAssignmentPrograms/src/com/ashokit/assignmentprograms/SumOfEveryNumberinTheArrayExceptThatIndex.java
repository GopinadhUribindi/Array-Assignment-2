package com.ashokit.assignmentprograms;

import java.util.Scanner;

public class SumOfEveryNumberinTheArrayExceptThatIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i,j, sum=0;
		int a[]=new int[20],b[]=new int[20];
    Scanner s=new Scanner(System.in);
    System.out.println("Enter  the number of elements");
     n=s.nextInt();
    System.out.println("Enter the array numbers");
   
    for(i=0;i<n;i++){
    	a[i]=s.nextInt();
    }
            
 System.out.println("The array after sum of everyeleemnt except that index  is :"); 
 
    for(i=0;i<n;i++) {
    	sum=0;
    	for(j=0;j<n;j++) {
    		if(i!=j) {
        		sum=sum+a[j];
        	}
    		b[i]=sum;
    	}
    	
    }
    for(i=0;i<n;i++) {
    	System.out.print(b[i] + " ");
    }  
    

	}

}
