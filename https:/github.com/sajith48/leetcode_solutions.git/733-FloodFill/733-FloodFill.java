// Last updated: 7/18/2026, 9:27:06 PM
class Solution {
    int m,n;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        n = image.length;
        m = image[0].length;
        int fcolor = image[sr][sc];
        if(image[sr][sc]!=color)dfs(image,sr,sc,color,fcolor);
        return image;
    }
    public void dfs(int[][] image,int sr,int sc,int color,int fcolor){
        if(sr<0 || sc<0 || sr>=n || sc>=m || image[sr][sc]!=fcolor)return;
        image[sr][sc] = color;
        dfs(image,sr,sc-1,color,fcolor);
        dfs(image,sr,sc+1,color,fcolor);
        dfs(image,sr-1,sc,color,fcolor);
        dfs(image,sr+1,sc,color,fcolor);
    }
}