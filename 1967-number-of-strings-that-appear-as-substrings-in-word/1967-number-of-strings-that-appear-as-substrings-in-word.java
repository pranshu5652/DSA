class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(String pt:patterns){
            if(word.indexOf(pt)!=-1){
                count++;
            }
        }
        return count;
    }
}