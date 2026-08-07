class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> obj=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                if(obj.isEmpty() || obj.get(obj.size()-1)!=a[i]){
                    obj.add(a[i]);
                }
                i++;
            }
            else if(a[i]>b[j]){
                if(obj.isEmpty() || obj.get(obj.size()-1)!=b[j]){
                    obj.add(b[j]);
                }
                j++;
            }
            else{
                if(obj.isEmpty() || obj.get(obj.size()-1)!=a[i]){
                    obj.add(b[j]);
                }
                i++;
                j++;
            }
        }
        while(i<a.length){
            if(obj.isEmpty() || obj.get(obj.size()-1)!=a[i]){
                obj.add(a[i]);
            }
            i++;
        }
        while(j<b.length){
            if(obj.isEmpty() || obj.get(obj.size()-1)!=b[j]){
                obj.add(b[j]);
            }
            j++;
        }
        return obj;
    }
}

