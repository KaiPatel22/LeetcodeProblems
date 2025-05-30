import java.util.*;
public class problem242 {
    public boolean isAnagram(String s, String t) {
        // HashMap<Character, Integer> hashmapS = new HashMap<Character, Integer>();
        // HashMap<Character, Integer> hashmapT = new HashMap<Character, Integer>();

        // if (s.length() != t.length()) {
        //     return false;
        // }
        // for(char char1 : s.toCharArray()){
        //     if(!hashmapS.containsKey(char1)){
        //         hashmapS.put(char1, 1);
        //     }else{
        //         hashmapS.put(char1, (hashmapS.get(char1)+1));
        //     }
        // }
        
        // for(char char2 : t.toCharArray()){
        //     if(!hashmapT.containsKey(char2)){
        //         hashmapT.put(char2, 1);
        //     }else{
        //         hashmapT.put(char2, (hashmapT.get(char2)+1));
        //     }
        // }
        
        // if(hashmapS.equals(hashmapT)){
        //     return true;
        // }else{
        //     return false;
        // }

        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        
        Arrays.sort(charS);
        Arrays.sort(charT);

        return Arrays.equals(charS, charT);
    }

}
