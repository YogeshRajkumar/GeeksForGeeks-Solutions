class Solution {
    public int longestKSubstr(String s, int k) {
        HashMap<Character,Integer> obj=new HashMap<>();
        int l=0;
        int r=0;
        int max=0;
        while(r<s.length()){
            char ch=s.charAt(r);
            obj.put(ch,obj.getOrDefault(ch,0)+1);
            while(obj.size()>k){
                char c=s.charAt(l);
                obj.put(c,obj.get(c)-1);
                if(obj.get(c)==0){
                    obj.remove(c);
                }
                l++;
            }
            if(obj.size()==k){
                max=Math.max(max,r-l+1);
            }
            r++;
        }
        return (max==0) ? -1:max;
    }
}