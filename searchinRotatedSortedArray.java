package ARRays;

import java.util.Arrays;
import java.util.Scanner;

public class searchinRotatedSortedArray {
public static void main(String[] args) {
	int arr[] = new int[5];
	int left = 0 ;
	int right = arr.length-1;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Array ");
	for(int i=0;i<arr.length;i++) {
		arr[i] = sc.nextInt();
	}
	System.out.println("Enter the target");
	
	int target = sc.nextInt();
	
	/*
	 * while(left<=right) { int mid = left +(left-right)/2; 
	 * if(arr[mid] == target) {
	 * System.out.println(mid);
	 *  } else if(arr[mid] < target) { left = mid+1;
	 * System.out.println(); 
	 * } else { right = mid-1;
	 *  System.out.println(); } }
	 * 
	 * System.out.println("-1");
	 */
	
	//with function
	
	int res  = Arrays.binarySearch(arr, target);
	if(res>0) {
		System.out.println(target +"found at index ="+res);
	}
	else {
		System.out.println(target+"not found");
	}
	
}

}
