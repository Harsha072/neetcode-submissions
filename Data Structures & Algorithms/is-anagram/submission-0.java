class Solution {
    public boolean isAnagram(String s, String t) {

        if (s == null || t == null || s.length() != t.length()) {
        return false;
    }

        char[] s1 = s.toCharArray();
        Arrays.sort(s1);
        char[] s2 = t.toCharArray();
        Arrays.sort(s2);
        
        int i=0;
        int j=0;
        while(i<s1.length && j<s2.length)
        {
            if(s1[i]!=s2[j]){
              return false;
            }
            i++;
            j++;
        }
        return true;

    }
    
}
