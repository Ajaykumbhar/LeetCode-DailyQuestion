class Solution {
    public int minimizeMax(int[] nums, int p) {
      Arrays.sort(nums);

      int l = 0;
      int r = nums[nums.length-1]-nums[0];
      while(l<r){
          int m = (l+r)/2;
          if(numPairs(nums,m)>=p){
              r = m;
          }
          else{
              l = m + 1;
          }
      }  
      return l;
    }

    public int numPairs(int[] nums, int maxdiff){
        int pairs = 0;
        for(int i = 1 ; i < nums.length; i++){
            if(nums[i]  - nums[i-1] <= maxdiff){
                ++pairs;
                ++i;
            }
        }
        return pairs;
    }
}
