package com.array.Intro;
import java.util.Scanner;

public class JaggedArray {
 public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter 1st D length i, e no of schools");
	 int arr[][][] = new int[scan.nextInt()][][];
	 
	 for(int i=1;i<=arr.length-1;i++) {
		 System.out.println("Enter 2D length for 1st D"+i+" i, e no oof class for school "+i);
		 arr[i]=new int[scan.nextInt()][];
	 }
	 
	 for(int i=0;i<=arr.length-1;i++) {
		 for(int j=0;j<=arr[i].length-1;j++) {
			 System.out.println("Enter the 3rd D length for the 1st");
			 arr[i][j]=new int[scan.nextInt()];
		 }
	 }
	 
	 for(int i=0;i<=arr.length-1;i++) {
		 for(int j=0;j<=arr[i].length-1;j++) {
			 for(int k=0;k<=arr[i][j].length-1;k++) {
				 System.out.println("Enter the marks of the students");
				 arr[i][j][k]=scan.nextInt();
			 } 
		 }
	 }
	 
	 for(int i=0;i<=arr.length-1;i++) {
		 System.out.println("{");
		 for(int j=0;j<=arr[i].length-1;j++) {
			 System.out.println("[");
			 for(int k=0;k<=arr[i][j].length-1;k++) {
				 System.out.println(arr[i][j][k]);
				 if(k!=arr[i][j].length-1) {
					 System.out.println(" , ");
				 }
			 }
				 System.out.println("]");
 }
}
	 }
 }

