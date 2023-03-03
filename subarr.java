package ARRays;

import java.util.Scanner;

public class subarr {
public static void main(String[] args) {
	int cur = 0;
	int max = 0;
	int arr[] = new int[10];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the element in array");
	int n = sc.nextInt();
	for(int i=0;i<n;i++) {
		arr[i] = sc.nextInt();
	}
	for(int i=0;i<n;i++) {
		cur= cur+arr[i];
		if(cur>max) {
			max = cur;
		}
		else if(cur<0) {
			cur=0;
		}
	}
	System.out.println(max);
}
}
