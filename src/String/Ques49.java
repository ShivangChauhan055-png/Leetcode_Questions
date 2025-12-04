package String;

// Ques49.java
// LeetCode 49 : Group Anagrams
// IDEA:
//  -> Same letters wali strings (anagrams) ko ek group me rakhna h
//  -> Har word ko sort karne pe same result milega (anagram case me)
//     Example: "eat", "tea", "ate" sort hoke "aet" banta h
//  -> sorted string ko key bana kar hashmap me list store karwa denge
//  -> map ke values hi final answer ban jayenge

import java.util.*;

public class Ques49 {

    public List<List<String>> groupAnagrams(String[] strs) {

        // HashMap store karega:
        // key   = sorted string
        // value = original words ki list (jo is sorted key se match ho)
        Map<String, List<String>> map = new HashMap<>();

        // har string par loop
        for (String word : strs) {

            // 1. string ko char array me convert -> sort karne ke liye
            char[] ch = word.toCharArray();

            // 2. sort -> ab anagrams same ban jayenge
            Arrays.sort(ch);

            // 3. sorted char array ko fir se string me convert
            String sortedKey = new String(ch);

            // 4. agar ye key map me nahi hai -> new list create karo
            if (!map.containsKey(sortedKey)) {
                map.put(sortedKey, new ArrayList<>());
            }

            // 5. direct original word ko us group me add kar do
            map.get(sortedKey).add(word);
        }

        // Map ki values hi answer h -> list of list return kar denge
        return new ArrayList<>(map.values());
    }

    // Optional Testing
    public static void main(String[] args) {
        Ques49 obj = new Ques49();

        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(obj.groupAnagrams(arr));
        // Output:
        // [["eat","tea","ate"],["tan","nat"],["bat"]]
    }
}

