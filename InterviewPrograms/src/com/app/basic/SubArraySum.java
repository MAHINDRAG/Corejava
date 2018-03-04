package com.app.basic;

public class SubArraySum {
   public static void main(String[] args) {
	   int array[] = {-2,-3,4,-1,-2,1,5,-3};
	   SubArraySum s=new SubArraySum();
	   s.contiguousSubArrayWithLargestsum(array);

}
   void contiguousSubArrayWithLargestsum(int array[]){
	   
	    int startIndex = 0, endIndex = 0;
	    int currStartIndex = 0;
	 
	    int maxSum = 0;
	    int currentSum = 0;
	 
	    for(int i=0;i<array.length;i++){
	        currentSum  = currentSum + array[i];
	        // case 1 : When ith element can be included
	        // Change the end index and also update the start index.
	        if(currentSum > maxSum){
	            maxSum = currentSum;
	            endIndex =i;
	            startIndex = currStartIndex;
	        }
	        /*case 2 : When ith index cannot be included and 
	        we need to start with i+1 index. till now our max sum
	        and start and end index of that sum remain same */
	        if(currentSum < 0){
	            currStartIndex =i+1;
	            currentSum = 0;
	        }
	    }
	    System.out.println("Maximum Sum : " +maxSum);
	    System.out.println("Between " +startIndex+" "+endIndex);
   }
}
