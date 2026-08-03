class Solution {
    int countTriplets(int target, int arr[]) {
        // code here
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<arr.length-2;i++){
            int l=i+1;
            int r=arr.length-1;
            while(l<r){
                int sum=arr[i]+arr[l]+arr[r];
                if(target>sum){
                    count+=r-l;
                }
                if(sum<target){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return count;
    }
}