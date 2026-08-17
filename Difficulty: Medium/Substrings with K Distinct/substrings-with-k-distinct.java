class Solution {
    public int countSubstr(String s, int k) {
        return Func(s,k)-Func(s,k-1);
    }
    private int Func(String s,int k){
        HashMap<Character,Integer> obj=new HashMap<>();
        int r=0;
        int l=0;
        int count=0;
        while(r<s.length()){
            char ch=s.charAt(r);
            obj.put(ch,obj.getOrDefault(ch,0)+1);
            while(obj.size()>k){
                char c=s.charAt(l);
                obj.put(c,obj.get(s.charAt(l))-1);
                if(obj.get(s.charAt(l))==0){
                    obj.remove(c);
                }
                l++;
            }
            count+=r-l+1;
            r++;
        }
        return count;
    }
}