class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int startrow=0;
        int startcol=0;
        int endrow=m-1;
        int endcol=n-1;
        while(startrow<=endrow && startcol<=endcol){
            // row wise l to r ,print starting row,from starting coloum to ending coloum...
            for(int col=startcol;col<=endcol;col++){
                result.add(matrix[startrow][col]);
            }
            startrow++;
            // coloum wise t to b ,print ending coloum ,from startrow to ending row...
             for(int row=startrow;row<=endrow;row++){
                result.add(matrix[row][endcol]);
            }
            endcol--;
            if(startrow<=endrow){
            // row wise r to l,print ending  row,from ending coloum to starting coloum.
             for(int col=endcol;col>=startcol;col--){
                result.add(matrix[endrow][col]);
            }
        }
            endrow--;
             if(startcol<=endcol){
            // coloum wise b  to t,print starting coloum ,from  to ending rowto starting row...
             for(int row=endrow;row>=startrow;row--){
                result.add(matrix[row][startcol]);
            }
            startcol++;
             }

        } 
           return result;
        
    }
}