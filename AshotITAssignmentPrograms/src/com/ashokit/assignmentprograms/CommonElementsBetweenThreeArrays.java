package com.ashokit.assignmentprograms;

import java.util.Scanner;

public class CommonElementsBetweenThreeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,n1,n2,n3, i,j,k=0, count=0,temp=0;
		int[] a=new int[20], b=new int[20],c=new int[20],d=new int[20];
    Scanner s=new Scanner(System.in);
    System.out.println("Enter  the number of elements for array1");
     n1=s.nextInt();
    System.out.println("Enter the array1 elements");
   
    for(i=0;i<n1;i++){
    	a[i]=s.nextInt();
    }
    
    
    System.out.println("Enter  the number of elements for  array 2");
    n2=s.nextInt();
   System.out.println("Enter the array2 elements");
  
   for(i=0;i<n2;i++){
   	b[i]=s.nextInt();
   }
   
   
   System.out.println("Enter  the number of elements for array3");
   n3=s.nextInt();
  System.out.println("Enter the array3 elements");
 
  for(i=0;i<n3;i++){
  	c[i]=s.nextInt();
  }
     
        
    // System.out.println("The smallest array size is"+n);
    System.out.println("The Comment elements in given three arrays are ");
    for(i=0;i<n1;i++) {
    	for(j=0;j<n2;j++) {
    		if(a[i]==b[j]) {
    			d[k]=a[i];
    			k++;
    		}
    	}
    }  
    n=d.length;
    for(i=0;i<n3;i++) {
    	for(j=0;j<n;j++) {
    		if(c[i]==d[j]) {
    			System.out.print(c[i]+" ");
    		}
    	}
    }
  
	}

}
