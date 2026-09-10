class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        Arrays.sort(start);
        Arrays.sort(end);
        int i=1;
        int j=0;
        int room=1;
        while(i<start.length){
            if(start[i]<end[j]){
                room++;
            }
            else{
                j++;
            }
            i++;
        }
        return room;
        
        
        // Arrays.sort(start);
        // Arrays.sort(end);
        // int i=0;
        // int j=0;
        // int room=0;
        // int max=0;
        // while(i<start.length){
        //     if(start[i]<end[j]){
        //         room++;
        //         max=Math.max(max,room);
        //         i++;
        //     }
        //     else{
        //         room--;
        //         j++;
        //     }
        // }
        // return max;
    }
}
