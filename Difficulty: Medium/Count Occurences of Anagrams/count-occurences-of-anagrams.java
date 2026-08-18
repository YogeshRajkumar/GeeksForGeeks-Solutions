class Solution {
    int search(String pat, String txt) {
        int count=0;
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        int n1=txt.length();
        int n2=pat.length();
        for(int i=0;i<n2;i++){
            arr1[txt.charAt(i)-'a']++;
        }
        for(int i=0;i<n2;i++){
            arr2[pat.charAt(i)-'a']++;
        }
        if(Arrays.equals(arr1,arr2)){
            count++;
        }
        for(int i=n2;i<n1;i++){
            arr1[txt.charAt(i)-'a']++;
            arr1[txt.charAt(i-n2)-'a']--;
            if(Arrays.equals(arr1,arr2)){
                count++;
            }
        }
        return count;
    }
}