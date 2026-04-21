class Solution {
   public boolean searchMatrix(int[][] matrix, int target) {
    int m = matrix.length;           // rows
    int n = matrix[0].length;        // columns
    int low = 0;
    int high = m * n - 1;
    
    while (low <= high) {
        int mid = (low + high) / 2;
        
        int row = mid / n;   // divide by COLUMNS
        int col = mid % n;   // mod by COLUMNS
        
        if (target == matrix[row][col]) {
            return true;
        } else if (target > matrix[row][col]) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    
    return false;
}
}
