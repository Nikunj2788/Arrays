package ARRays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;



public class reversearr {
public static void main(String[] args) {
	int arr[] = new int[4];
	 Scanner sc = new Scanner(System.in);
	 //take an element
	 
	 for(int i=0;i<arr.length;i++) {
		 arr[i] = sc.nextInt();
	 }
	 
	 //without function
	   for(int i=0;i<arr.length/2;i++) {
		   int temp = arr[i];
		   arr[i] = arr[arr.length-1-i];
		   arr[arr.length-1-i] =temp;
	   }
	   System.out.println(Arrays.toString(arr));
	 
   }
public static void reverse(int[] arr){
    Collections.reverse(Arrays.asList(arr));
}
}
