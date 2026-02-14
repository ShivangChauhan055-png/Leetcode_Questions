package Arrays;

class Ques48 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // ================= STEP 1 : TRANSPOSE =================
        // rows ko columns bana diya
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // ================= STEP 2 : REVERSE EACH ROW =================
        for(int i=0;i<n;i++){
            int left = 0;
            int right = n-1;
            while(left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}
