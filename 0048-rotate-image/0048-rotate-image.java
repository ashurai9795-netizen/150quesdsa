class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
         int temp=matrix[i][j];
         matrix[i][j]=matrix[j][i];
         matrix[j][i]=temp;
        }
       } 
       for(int i=0;i<n;i++){
        int a=0;
       int j=n-1;
        while(j>a){
            int temp=matrix[i][a];
            matrix[i][a]=matrix[i][j];
            matrix[i][j]=temp;
            a++;j--;
        }
       }
    }
}