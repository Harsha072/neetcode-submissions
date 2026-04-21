class Solution {
    public boolean isAnagram(String s, String t) {
       int [] freq = new int[26];

        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);
            int index  = c - 'a';
           freq[index]= freq[index]+1;
        }
System.out.println("before sub s ");
        for (int j : freq) {
            System.out.println(j);
        }


        for (int i = 0; i <t.length() ; i++) {
            char c = t.charAt(i);
            int index  = c - 'a';
            freq[index]--;
        }

        System.out.println("after sub s ");
        for (int j : freq) {
            System.out.println(j);
        }

        for (int j : freq) {
            if (j != 0) {
                return false;
            }
        }

        return true;
    }
}
