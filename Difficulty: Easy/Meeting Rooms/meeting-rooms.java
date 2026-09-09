class Solution {
    static boolean canAttend(int[][] arr) {
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        int prev=0;
        for(int i=1;i<arr.length;i++){
            if(arr[prev][1]>arr[i][0]){
                return false;
            }
            prev=i;
        }
        return true;
    }
}