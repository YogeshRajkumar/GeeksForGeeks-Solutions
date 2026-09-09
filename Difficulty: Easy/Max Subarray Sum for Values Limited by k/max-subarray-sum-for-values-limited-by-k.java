class Solution {
    public int maxSum(int[] arr, int k) {
        int max=0;
        int sum=0;
        for(int i:arr){
            if(i<=k){
                sum+=i;
                max=Math.max(max,sum);
            }
            else{
                sum=0;
            }
        }
        return max;
    }
}