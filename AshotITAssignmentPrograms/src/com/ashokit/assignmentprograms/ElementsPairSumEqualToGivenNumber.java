package com.ashokit.assignmentprograms;

import java.util.Scanner;

public class ElementsPairSumEqualToGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i,j, sum=0;
		int[] a= new int[20];
    Scanner s=new Scanner(System.in);
    System.out.println("Enter  the number of elements for array");
     n= s.nextInt();
    System.out.println("Enter the elements for array");
   
    for(i=0;i<n;i++){
    	a[i]=s.nextInt();
    }
    System.out.println("Enter the number for sum");
    sum=s.nextInt();
    
 System.out.println("the pair of elements whose sum is equal to given number are ");
      for(i=0;i<n;i++) {
    	 for(j=i+1;j<n;j++) {
    		 if(sum==a[i]+a[j]) {
    			  System.out.print("("+a[i]+","+a[j]+")"+"  is  "+sum+"  ");
    			 } 
    	 }    			 
      }	 
	}

}
