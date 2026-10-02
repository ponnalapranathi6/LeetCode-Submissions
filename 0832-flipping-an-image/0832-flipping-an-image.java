class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        int[][] rev=new int[n][image[0].length];
        for(int i=0; i<n; i++){
            for(int j=image[i].length-1; j>=0; j--){
                rev[i][image[i].length-1-j]=image[i][j];
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<image[i].length; j++){
                if(rev[i][j]==1){
                    rev[i][j]=0;
                }
                else{
                    rev[i][j]=1;
                }
            }
        }
        return rev;
    }
}