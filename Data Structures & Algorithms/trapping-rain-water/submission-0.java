class Solution {
    public int trap(int[] height) {
         int res = 0;

        int [] lb = new int[height.length]; 
        int [] rb = new int[height.length];//make array for left most max boundary that can store water

        lb[0] = height[0]; // since the first element and last element wont store any water then we initialise this with first element of left boundary

        for (int i = 1; i <height.length ; i++) {
            lb[i] = Math.max(lb[i-1], height[i]);// compare lb with left most max height
        }
        rb[rb.length-1] = height[rb.length-1]; // since the first element and last element wont store any water then we initialise this with first element of left boundary

        for (int i = height.length-2; i >=0 ; i--) {
            rb[i] = Math.max(rb[i+1], height[i]);// compare rb with right most max height
        }

        for (int i = 0; i <height.length ; i++) {
            int wl = Math.min(lb[i],rb[i]);

            int tw = wl-height[i];
            res = res+tw;

        }



        return res;
    }
}
