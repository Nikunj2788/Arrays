package ARRays;

public class nextpermutation {
   public void nextper(int[] arr) {
	   int n=arr.length;
	   int k=n-2;
	   
	   //null check
	   if(arr == null ||arr.length == 0) {
		   return;
	   }
	   
	   //find k 
	   for(int i=n-1;i>=0;i--)
	   if(arr[i]<arr[i-1])k--;
	   else {
		   break;
	   }
	   
	   //k ==-1 reverse
	   if(k == -1) {
		   reverse(arr,0,n-1);
	   }
	   
	   //replace k with bext greater element //or swap
	   for(int i = n-1;i>0;i--) {
		   if(arr[i]>arr[k]) {
			   int temp = arr[k];
			   arr[k] = arr[i];
			   arr[i] = temp;
		   }
	   }
   }
   void reverse(int[] arr,int start,int end) {
	   while(start<end) {
		   int temp = arr[start];
		   arr[start] =arr[end];
		   arr[end] = temp;
		   start++;
		   end--;
	   }
   }
}

