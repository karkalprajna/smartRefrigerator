package com.practice;

public class ArrayProblem {
   public static void main(String args[]){
	   int a[]={3,5,9,11,12};
	   int b[] = {4,8,20};
	   int c[] = new int[a.length+b.length];
	   int i=0,j=0,k=0;
	   
	   while(i < a.length && j< b.length){
		   if(a[i] < b[j]){
			   c[k++] =a[i++]; 
		   }else{
			   c[k++] =b[j++];
		   }
	   }
	   
	   if(i < a.length ){
		   while(i < a.length)
		   {
			   c[k++] =a[i++]; 
		   }
	   }
	   
	   
	   if(j < b.length ){
		   while(j < b.length)
		   {
			   c[k++] =b[j++]; 
		   }
	   }
	   
	   
	   for(int l=0 ; l<c.length ;l++){
		   System.out.println(c[l]+",");
	   }
	   
	   
   }
}
