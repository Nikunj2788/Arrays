package ARRays;

import java.util.Scanner;

public class buyandsell {
	
	 public int maxProfit(int[] prices) {
		 int max = Integer.MAX_VALUE;
		 int min = 0;
		 int op = 0;
		 for(int i=0;i<prices.length;i++) {
			 if(prices[i] < max) {
				 max = prices[i];
			 }
			 min = prices[i]- max; 
	            if(op < min){
	                op = min;
	            }
		 }
		 return op;
	 }
public static void main(String[] args) {
	buyandsell s = new buyandsell();
	Scanner sc = new Scanner(System.in);
	int arr[] = new int[4];
	for(int i =0 ;i<arr.length;i++)
	{
		arr[i] = sc.nextInt();
	}
	s.maxProfit(arr);
}
}
