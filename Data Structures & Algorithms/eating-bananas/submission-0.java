class Solution {
       public static int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        int res = 0;
        int ans = right;
        for (int pile : piles) {
            if (pile > right) {
                right = pile;
            }
        }

        while(left <= right){
            int k = (left+right)/2;
             res = 0;
            for (int i = 0; i < piles.length ; i++) {
                res += Math.ceil((double) piles[i] /k);

            }

            if(res<=h){
                ans = k;
                right = k -1;
            }
            else if(res>=h){
                left = k+1;
            }
        }
     return ans;
    }
}
