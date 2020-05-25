package com.ashokit.assignmentprograms;
import java.util.Scanner;

public class UniqueElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, i,j, count=0;
		int[] a= new int[20];
    Scanner s=new Scanner(System.in);
    System.out.println("Enter  the number of elements");
     n= s.nextInt();
    System.out.println("Enter the numbers");
   
    for(i=0;i<n;i++){
    	a[i]=s.nextInt();
    }
 System.out.print("The unique Elements are ");
    for(i=0;i<n;i++) {
    	 for(j=i+1;j<n;j++) {
    		 if(a[i]==a[j]) {
    			 count++;  
    			 } 
    	 }
    			 if(count==0) {
    	    		 System.out.print(a[i] + " , ");
    	    	 } 
    			 count=0;
    		 //}
    		 
    	// }
    	  		 
    }
		

	}

}
