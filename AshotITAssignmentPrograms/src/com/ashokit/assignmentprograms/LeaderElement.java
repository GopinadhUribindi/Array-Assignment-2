package com.ashokit.assignmentprograms;

import java.util.Scanner;

public class LeaderElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i,j, count=0,maxcount=0,temp=0,leaderelement,index=0;
		int a[]=new int[20];
    Scanner s=new Scanner(System.in);
    System.out.println("Enter  the number of elements");
     n=s.nextInt();
     leaderelement=n/2;
     
    System.out.println("Enter the array numbers");
   
    for(i=0;i<n;i++){
    	a[i]=s.nextInt();
    }
            
 System.out.println("The leader element in the given array  is :"); 
 
    for(i=0;i<n;i++) {
    	count=0;
    	for(j=i+1;j<n;j++) {
    		if(a[i]==a[j]) {
    			count++;    			
    		}
    	}
    	if(count>maxcount) {
    		maxcount=count;
    		index=i;
    	}
    	
    }
    if(maxcount>leaderelement) {
    	System.out.print(a[index]);
    }  
    else {
    	System.out.print("the leader element doesn't exists");
    }

	}

}
