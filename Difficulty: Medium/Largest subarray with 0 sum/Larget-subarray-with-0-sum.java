class Solution {
    int maxLength(int arr[]) {
        HashMap<Integer,Integer> obj=new HashMap<>();
        obj.put(0,-1);
        int r=0;
        int sum=0;
        int max=0;
        while(r<arr.length){
            sum+=arr[r];
            if(obj.containsKey(sum)){
                max=Math.max(max,r-obj.get(sum));
            }
            else{
                obj.put(sum,r);
            }
            r++;
        }
        return max;
    }
}
