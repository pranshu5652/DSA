class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
        // first intervals ke start or end elements
        int start=intervals[0][0];
        int end=intervals[0][1];
        // list to store the intervels...
        List<int[]>list=new ArrayList<>();
         for(int i=1;i<intervals.length;i++){
            // loop ke first intervals ke start or end elements
            int s=intervals[i][0];
            int e=intervals[i][1];
            // if is true so the intervals is overlap
            if(s<=end){
                // update end 
                 end=Math.max(e,end); 
            }
            // if not overlap so add the intervals
            else{
                // same intervals add karo do..
                     list.add(new int[]{start,end});
                     // update the start or end because loop searching new intervals..
                     start=s;
                     end=e;
            }
         }
         // jo last interval bacha use add ase hi kar do kuki compaire ke liya koi interval bcha nhi 
         list.add(new int[]{start,end});
         // convert Arraylist into 2darray...
         return list.toArray(new int[list.size()][]);

    }
}