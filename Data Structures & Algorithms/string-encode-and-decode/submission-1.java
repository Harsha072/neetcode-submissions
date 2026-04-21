class Solution {

    public String encode(List<String> strs) {
  String encoded = "";
           for (String s : strs){
               encoded += s.length()+"#"+(s);
           }
        return encoded;
    }

    public List<String> decode(String str) {
        int i =0;
        List<String> result = new ArrayList<>();
        while(i < str.length()){
            int indexOfHash = str.indexOf('#', i);
            int lengthOfWord = Integer.parseInt(str.substring(i, indexOfHash));

            String word =str.substring(indexOfHash+1, indexOfHash+1+lengthOfWord);
            result.add(word);
            i = indexOfHash+1+lengthOfWord;
            
        }
         return result;
    }
   
}
