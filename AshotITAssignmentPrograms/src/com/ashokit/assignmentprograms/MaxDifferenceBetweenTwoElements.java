package com.ashokit.assignmentprograms;

import java.util.Scanner;

public class MaxDifferenceBetweenTwoElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i,j, count=0,max=0,m=0,k=0,l=0;
		int[] a= new int[20];
    Scanner s=new Scanner(System.in);
    System.out.println("Enter  the number of elements");
     n= s.nextInt();
    System.out.println("Enter the array numbers");
   
    for(i=0;i<n;i++){
    	a[i]=s.nextInt();
    }

     for(i=0;i<n;i++) {
    	 for(j=i+1;j<n;j++) {
    		  m=(a[i]-a[j]);
    		 if(m>0) {
    			 if(m>max) {
    			 max=m;
    			 k=a[i];
    			 l=a[j];
    			 }
    		 }
    		 if(m<0) {
    			 m=m*(-1);
    			 if(m>max) {
        			 max=m;
        			 k=a[i];
        			 l=a[j];
        			 }

    		 }
    	 }
     }
     System.out.println("The max difference between " +k +" and " +l +"  elements in the given array are "+max);
	}

}
