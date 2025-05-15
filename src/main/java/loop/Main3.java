package loop;

import java.util.ArrayList;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {
        // 중복단어 제거 후 출력
        List<String> words = List.of("apple", "banana", "apple", "grape", "banana");
//        List list = words.stream().distinct().toList();
//
//        System.out.println(list);
        List<String> stringList = new ArrayList<>();
        for (String s : words){
            if (stringList.contains(s)){
                continue;
            }
            stringList.add(s);
        }
        System.out.println(stringList);
    }

}
