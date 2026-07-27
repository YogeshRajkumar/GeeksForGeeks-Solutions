class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        code here
        ArrayList <Integer> obj=new ArrayList<>();
        obj.add(arr[arr.length-1]);
        int max=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>=max){
                obj.add(arr[i]);
                max=arr[i];
            }
        }
        int l=0;
        int r=obj.size()-1;
        while(l<r){
            int temp=obj.get(l);
            obj.set(l,obj.get(r));
            obj.set(r,temp);
            l++;
            r--;
        }
        return obj;
        // ArrayList<Integer> obj=new ArrayList<>();
        // int max=arr[arr.length-1];
        // obj.add(arr[arr.length-1]);
        // for(int i=arr.length-2;i>=0;i--){
        //     if(max<=arr[i]){
        //         obj.add(0,arr[i]);
        //         max=arr[i];
        //     }
        // }
        // return obj;
    }
}
