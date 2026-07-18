// Last updated: 7/18/2026, 9:26:46 PM
class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            int left = 0;
            int right = arr[i].length - 1;
            while (left < right) {
            int temp = arr[i][left];
            arr[i][left] = arr[i][right];
            arr[i][right] = temp;
            left++;
            right--;
        }   
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(arr[i][j]==0)arr[i][j]=1;
            else arr[i][j] = 0;
        }
    }  
    return arr;
    }
}