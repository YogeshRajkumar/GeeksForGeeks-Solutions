class Solution {
    int countPairs(int arr[], int target) {
        // code here
        Map<Integer,Integer> obj=new HashMap<>();
        int count=0;
        for(int i=0;i<arr.length;i++){
            count+=obj.getOrDefault(target-arr[i],0);
            obj.put(arr[i],obj.getOrDefault(arr[i],0)+1);
        }
        return count;
    }
}