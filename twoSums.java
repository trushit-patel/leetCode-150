public class twoSums {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i = 1 ; i<=nums.length ; i++){
           int k = i-1;
            
            for(int j = i ;j<=nums.length-i; j++){
                
                if(k+j==target){
                    return new int[]{j,k};
                }
            }
        }
        return new int[]{0};
    }
}