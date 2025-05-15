package loop;

import java.util.ArrayList;
import java.util.List;

public class Main8 {

    public static void main(String[] args) {
        //newWords에 1. bread , 2. milk , 3.egg 처럼 앞에 숫자 붙이기
        List<String> words = List.of("bread", "milk", "egg");
        List<String> newWords =new ArrayList<>();

        for (int i = 0; i < words.size(); i++){
            newWords.add(((i+1)+".")+words.get(i));
        }
        System.out.println(newWords);

        // ints 리스트에 Integer 자료형으로 옮기기
        List<Double> doubles = List.of(1.12,2.23,3.34,4.45);
        List<Integer> ints = new ArrayList<>();

        for (int i = 0; i < doubles.size(); i++){
            int nums = (int)doubles.get(i);
            ints.add(nums);
        }

    }

}
