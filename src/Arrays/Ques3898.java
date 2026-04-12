package Arrays;

class Ques3898 {
    /*
     * Function: findDegrees
     * ----------------------
     * Given an adjacency matrix of an undirected graph,
     * returns an array where each index represents
     * the degree of that vertex.
     */
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;     // number of vertices
        int[] ans = new int[n];    // result array
        // Traverse each vertex (row)
        for(int i = 0; i < n; i++) {
            int count = 0; // degree of current vertex
            // Count number of edges (1's in row)
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 1) {
                    count++;
                }
            }
            ans[i] = count; // store degree
        }
        return ans;
    }
}
