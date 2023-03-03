package ARRays;

import java.util.Arrays;
import java.util.Scanner;

public class minmax {
public static void main(String[] args) {
 int arr[] = new int[4];
 Scanner sc = new Scanner(System.in);
 //take an element
 
 for(int i=0;i<arr.length;i++) {
	 arr[i] = sc.nextInt();
 }
 
 // withfunction
 
     //Arrays.sort(arr);
 
	/*
	 * int min = Arrays.stream(arr).min().getAsInt(); 
	 * int max = Arrays.stream(arr).max().getAsInt();
	 */
 
   //withoutfunction
 
 	int min = arr[0];
 	int max= arr[0];
 	
 	for(int i=0;i<arr.length;i++) {
 		if(arr[i] < min) {
 			min = arr[i]; 
 		}
 		if(arr[i]> max) {
 			max = arr[i];
 		}
 	}
 	System.out.println("Minimum "+min);
 	System.out.println("Maximum"+max);
    int sum = min+max;
    System.out.println(sum);
}

}
