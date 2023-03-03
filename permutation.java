package ARRays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class permutation {
	private void recursivepermutation(int nums[],List<Integer> ds,List<List<Integer>> ans, boolean[] freq) {
		if(ds.size() == nums.length) {
			ans.add(new ArrayList<Integer>(ds));
			return;
		}
		for(int i=0;i<nums.length;i++) {
			if(!freq[i]) {
				freq[i] = true;
				ds.add(nums[i]);
				recursivepermutation(nums, ds, ans, freq);
				ds.remove(ds.size()-1);
				freq[i] = false;
			}
		}
	}
	public List<List<Integer>> permute(int [] nums){
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		List<Integer> ds = new ArrayList<Integer>();
		boolean freq[] = new boolean[nums.length];
		recursivepermutation(nums, ds, ans, freq);
	    return ans;
	}
	
public static void main(String[] args) {
	permutation  p = new permutation();
    Scanner sc = new Scanner(System.in);
	int arr[] =new int[4];
    for(int i=0;i<arr.length;i++) {
       arr[i] = sc.nextInt();	
    }
    p.permute(arr);
}
}
