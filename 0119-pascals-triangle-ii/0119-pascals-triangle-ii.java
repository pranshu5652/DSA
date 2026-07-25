class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer>list=new ArrayList<>();
        long ans=1;
        list.add((int)ans);
        for(int k=1;k<=rowIndex;k++){
            ans=ans*(rowIndex - k+1)/k;
            list.add((int)ans);
        }
        return list;
    }
}