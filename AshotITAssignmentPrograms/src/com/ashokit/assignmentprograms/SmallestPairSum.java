package com.ashokit.assignmentprograms;

import java.util.Scanner;

public class SmallestPairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i,j, count=0,temp=0;
		int a[]=new int[20];
    Scanner s=new Scanner(System.in);
    System.out.println("Enter  the number of elements");
     n=s.nextInt();
    System.out.println("Enter the array numbers");
   
    for(i=0;i<n;i++){
    	a[i]=s.nextInt();
    }       

 
    for(i=0;i<n;i++) {
    	for(j=i+1;j<n;j++) {
    		if(a[i]>a[j]) {
        		temp=a[i];
        		a[i]=a[j];
        		a[j]=temp;
        	}	
    	}
    	
    }
     
    System.out.println("The pair ("+a[0]+","+a[1]+") will have the minimum sum pair i.e.."+a[0]+"+"+a[1]+"="+((a[0]+a[1])));
    }

}
