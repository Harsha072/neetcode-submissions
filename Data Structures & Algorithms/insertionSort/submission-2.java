// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
         List<List<Pair>> sample = new ArrayList<>();

        for (int i = 0; i <pairs.size() ; i++) {
            for (int j = i; j > 0 && pairs.get(j).key < pairs.get(j - 1).key; j--) {

                    Pair temp = pairs.get(j);
                    pairs.set(j, pairs.get(j-1));
                    pairs.set(j-1,temp);
            }
            List<Pair> cloneList = new ArrayList<>(pairs);
            sample.add(cloneList);

        }

        return sample;
    }
}
