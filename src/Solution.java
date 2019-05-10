import java.util.Arrays;

class Solution {
    
    public int solution(int[] A) {
    	Arrays.sort(A); 
        int smallestPositiveInt = 1;
        
        //Loop through the array
        for (int i = 0; i < A.length; i++) {
        	if(A[i] == smallestPositiveInt + 1) {
    			smallestPositiveInt++;
    		}
         }
        
        if(smallestPositiveInt > 1) {
			smallestPositiveInt += 1;
		}
        return smallestPositiveInt;
    }
}
