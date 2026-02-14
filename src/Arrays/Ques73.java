package Arrays;

// Ques73.java
// Set Matrix Zeroes (Better Approach using Row & Column Marking)

class Ques73 {

    public void setZeroes(int[][] matrix) {
        // n = number of rows
        int n = matrix.length;
        // m = number of columns
        int m = matrix[0].length;
        // row[i] = true matlab ith row me zero hai
        boolean[] row = new boolean[n];
        // col[j] = true matlab jth column me zero hai
        boolean[] col = new boolean[m];
        //  Step 1: Mark karo kis row aur column me zero present hai
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        //  Step 2: Jis row ya column pe mark hai usko pura zero bana do
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(row[i] || col[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
