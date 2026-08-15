class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // code here
        List<Integer> obj=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            while(!q.isEmpty() && q.peek()<=i-k){
                q.poll();
            }
            if(arr[i]<0){
                q.offer(i);
            }
            if(i>=k-1){
                if(q.isEmpty()){
                    obj.add(0);
                }
                else{
                    obj.add(arr[q.peek()]);
                }
            }
        }
        return obj;
    }
}