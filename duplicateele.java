package ARRays;

import java.util.HashSet;
import java.util.Scanner;

public class duplicateele {
public static void main(String[] args) {
	int arr[] = new int[10];
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	for(int i=0;i<n;i++) {
		arr[i] = sc.nextInt();
	}
	
    HashSet<Integer> set = new HashSet<Integer>();
    
    for(int num : arr) {
    	if(set.contains(num)) {
    		System.out.println(num);
    	}
    	set.add(num);
    }
}
}
