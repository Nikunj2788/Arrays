package ARRays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class minimizeDeviationinArray {
	public int minimumdeviation(int [] nums) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		for(int x: nums) {
			if(x%2 ==0 ) {
				set.add(x);
			}
			else {
				set.add(x*2);
			}
		}
		int ans = Integer.MAX_VALUE;
		while(true) {
			int val = set.last();
			ans = Math.min(ans, val - set.first());
			if(val %2 ==0) {
				set.remove(val);
				set.add(val/2);
				
			}
			else {
				break;
			}
		}
		return ans;
	}
	
public static void main(String[] args) {
    minimizeDeviationinArray in = new minimizeDeviationinArray();
	int arr[] = new int[4];
	
	Scanner sc =  new Scanner(System.in);
	for(int i=0;i<arr.length;i++) {
		arr[i] = sc.nextInt();
	}
	in.minimumdeviation(arr);
   }
 }
