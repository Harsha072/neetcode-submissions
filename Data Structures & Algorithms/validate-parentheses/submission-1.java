class Solution {
    public boolean isValid(String s) {
       HashMap<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');

        ArrayList<Character> stack = new ArrayList<>();

        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)){
                if(stack.isEmpty()){
                    return false;
                }
                char topElement = stack.remove(stack.size() - 1);
                if(topElement!=map.get(c)){
                    return  false;
                }
            }
            else{
                stack.add(c);
            }
        }
        return stack.isEmpty(); 
    }
}
