package com.ashokit.assignmentprograms;
import java.util.Scanner;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i,j, count=0;
		int[] a;
		a= new int[20];
    Scanner s=new Scanner(System.in);
    System.out.println("Enter  the number of elements");
     n= s.nextInt();
    System.out.println("Enter the array numbers");
   
    for(i=0;i<n;i++){
    	a[i]=s.nextInt();
    }
  System.out.print("The duplicate Elements are : ");
    for(i=0;i<n;i++) {
    	 for(j=i+1;j<n;j++) {
    		 if(a[i]==a[j]) {
    			 count++;
    			 if(count>=1) {
    	    		 System.out.print( a[i] + " " );
    	    	 } 
    		 }
    		 
    	 }
    	  		 
    }
	}

}
