class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character, Integer> tmap = new HashMap<>();
        int l = 0;
        int count = t.length();
        int minLen =   Integer.MAX_VALUE;
        String ans = "";
        for (int i = 0; i <t.length() ; i++) {
            tmap.put(t.charAt(i), tmap.getOrDefault(t.charAt(i), 0)+1);
        }

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);

            tmap.put(c, tmap.getOrDefault(c, 0) - 1);

            if (tmap.get(c) >= 0) {
                count--;
            }

            while (count == 0) {

                if (right - l + 1 < minLen) {
                    minLen = right - l + 1;
                    ans = s.substring(l, right + 1);
                }

                char k = s.charAt(l);

                tmap.put(k, tmap.get(k) + 1);

                if (tmap.get(k) > 0) {
                    count++;
                }

                l++;
            }
        }

        return ans;
    }
}
