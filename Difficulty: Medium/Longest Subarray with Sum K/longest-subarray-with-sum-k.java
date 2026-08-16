class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Long,Integer> obj=new HashMap<>();
        obj.put(0L,-1);
        long sum=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(obj.containsKey(sum-k)){
                max=Math.max(max,i-obj.get(sum-k));
            }
            if(!obj.containsKey(sum)){
                obj.put(sum,i);
            }
        }
        return max;
    }
}