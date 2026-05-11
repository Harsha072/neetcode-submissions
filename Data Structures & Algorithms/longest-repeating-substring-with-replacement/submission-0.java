class Solution {
    public static int characterReplacement(String s, int k) {

    HashMap<Character, Integer> map = new HashMap<>();

    int maxLen = 0;
    int maxf = 0;

    int l = 0, r = 0;

    while (r < s.length()) {

        map.put(s.charAt(r),
                map.getOrDefault(s.charAt(r), 0) + 1);

        maxf = Math.max(maxf, map.get(s.charAt(r)));

        while ((r - l + 1) - maxf > k) {

            map.put(s.charAt(l),
                    map.get(s.charAt(l)) - 1);

            l++;
        }

        maxLen = Math.max(maxLen, r - l + 1);

        r++;
    }

    return maxLen;
}
}
