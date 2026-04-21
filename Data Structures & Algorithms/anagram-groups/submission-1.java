class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      HashMap<String, List<String>> map = new HashMap<>();
          List <List<String>> result  = new ArrayList<>();
        for (int i = 0; i <strs.length ; i++) {
            char [] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String str =new String(ch);
            List<String> list = null;
            if(map.isEmpty()){
                 list = new ArrayList<>();
                list.add(strs[i]);
                map.put(str, list);
            }
            else if (map.containsKey(str)){
                //get that value and add it to the list
                List l = map.get(str);
                l.add(strs[i]);
            }
            else{
                list = new ArrayList<>();
                list.add(strs[i]);
                map.put(str, list);
            }

        }
        for (Map.Entry<String , List<String>> entry : map.entrySet()){
            result.add(entry.getValue());
        }
        //need to get all hashmap values and return it
        return result;  
    }
}
