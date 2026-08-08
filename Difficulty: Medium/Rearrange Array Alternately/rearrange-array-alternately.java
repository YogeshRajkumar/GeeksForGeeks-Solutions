class Solution {
    public void rearrange(int arr[]) {
        Arrays.sort(arr);
        int l=0;
        int r=arr.length-1;
        int base=arr[r]+1;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i]=arr[i]+(arr[r]%base)*base;
                r--;
            }
            else{
                arr[i]=arr[i]+(arr[l]%base)*base;
                l++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]/base;
        }
    }
}
