class Solution {
    public boolean isPalindrome(String s) {
        String words = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(words);

        char [] characters = words.toLowerCase().toCharArray();
        int i = 0;
        int j= characters.length-1;

        while(i<j){
            if(characters[i] != characters[j]){
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
    }

