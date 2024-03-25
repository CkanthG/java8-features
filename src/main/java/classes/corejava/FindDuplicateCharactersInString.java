package classes.corejava;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharactersInString {
    public static void main(String[] args) {
//        new FindDuplicateCharactersInString().findDuplicates(new String("Welcome"));
        new FindDuplicateCharactersInString().duplicateCount(new String("Welcome"));
    }
    public void duplicateCount(String str){
        String[] strings = str.split("");
        System.out.println(strings.length);
        Map<String, Integer> map = new HashMap<>();
        for (int i=0;i<strings.length;i++) {
            if(map.containsKey(strings[i])) {
                int count = map.get(strings[i]);
                map.put(strings[i], count + 1);
            } else {
                map.put(strings[i], 1);
            }
        }
        System.out.println(map);
    }

    public void findDuplicates(String str) {
        int count = 0;
        char[] chars = str.toCharArray();
        System.out.println("Duplicate finding starts");
        for (int i=0; i<str.length();i++){
            for (int j = i+1; j<str.length(); j++) {
                if (chars[i] == chars[j]) {
                    System.out.println(chars[j]);
                    count++;
                    break;
                }
            }
        }
    }
}
