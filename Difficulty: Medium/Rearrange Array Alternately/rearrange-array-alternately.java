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

// base is always the max+1 in an array

// encryption = min+(max*base)

// here,
// encryption = min+(max*base)%base gives min
// encryption = min+(min*base)/base gives max 

// ex:
// 1 2 3 4 5
// 1+(5*6)=1+30
//        =31
    
//     min=31%6=1
//     max=31/6=5

// arr[r]%base for decrypte the already encoded number by you

// arr[i]=arr[i]+(arr[r]%base)*base;
// arr[r] is what you are going to encrypting - max

// arr[i]=arr[i]+(arr[l]%base)*base;
// similarly, arr[l] - min
