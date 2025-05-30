import java.util.HashMap;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();

        for(int num : nums){
            if (!hashmap.containsKey(num)){
                hashmap.put(num, 1);
            }else{
                return true;
            }
        }
        return false;
    }
}
