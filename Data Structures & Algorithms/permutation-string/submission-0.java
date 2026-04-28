class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int [] freq= new int[26];
        int [] freq2 = new int[26];
        for (int i = 0; i <s1.length() ; i++) {
            char c = s1.charAt(i);
            int index = c-'a';
            freq[index] = freq[index]+1;
        }


        int l = 0;

        for (int r = 0; r < s2.length() ; r++) {
            char c = s2.charAt(r);
            int index = c-'a';
            freq2[index] = freq2[index]+1;

            if(r-l+1> s1.length()){
                //we shrink l decrase count
                char c2 = s2.charAt(l);
                int index2 = c2-'a';
                freq2[index2] = freq2[index2]-1;
                l++;
            }
            if(r-l+1 == s1.length()){
                boolean match = true;
                for (int i = 0; i <26 ; i++) {
                    if(freq[i]!=freq2[i]){
                        match= false;
                        break;
                    }

                }
                if(match) return true;
            }
        }


        return false;
    }
}
