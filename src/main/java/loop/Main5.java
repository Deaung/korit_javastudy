package loop;

import java.util.ArrayList;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        // 단어 시작이 A 혹은 a 로 시작하는 단어 newWords 리스트에 담고 출력
        List<String> words = List.of("Apple", "banana", "avocado", "carrot");


        List<String> newWords = new ArrayList<>();
        for (String word : words){
            if (word.startsWith("A") || word.startsWith("a")) {
                newWords.add(word);
            }
        }
        System.out.println(newWords);

        List<String> newWords2 = new ArrayList<>();
        for (String word : words){
            char c = word.charAt(0);
            if (c == 'a'|| c == 'A') {
                newWords2.add(word);
            }
        }
        System.out.println(newWords2);

        List<String> newWords3 = new ArrayList<>();
        for (String word : words){
            String firstStr = word.substring(0, 1);
            if (firstStr.equals("A")|| firstStr.equals("a")){
                newWords3.add(word);
            }
        }
        System.out.println(newWords3);

    }
}
