class Solution {
    public void rotateArr(int arr[], int d) {
        // code here
        int n=arr.length;
        d=d%n;
        Reverse(arr,0,d-1);
        Reverse(arr,d,n-1);
        Reverse(arr,0,n-1);
    }
    public void Reverse(int[] arr,int l,int r){
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
}