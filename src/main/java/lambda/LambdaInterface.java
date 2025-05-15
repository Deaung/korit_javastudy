package lambda;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaInterface {

    public static void main(String[] args) {
//        Runnable runnable = () -> {
//            System.out.println("메인문 처럼 사용 가능");
//        };
//        runnable.run();

        Supplier<Double> doubleSupplier = () -> 10.10;
        doubleSupplier.get();

        Consumer<Integer> integerConsumer = n -> {
            System.out.println("consumer");
            System.out.println("전달받을 데이터: " + n);
        };
        integerConsumer.accept(1000);

        List<Integer> numList = List.of(10,20,30,40);
        numList.forEach(n-> System.out.println("number : "+n));

        Function<String ,String > fx = name -> "이름" +name;
        String nameText = fx.apply("1000");
        System.out.println(nameText);

        String searchName = "ㅇㅇ";
        List<String> 일학년 = List.of("dd","sa","ㅇㅇ");
        List<String> 이학년 = List.of("ㅁd","sa","ㅇㄴ");

//        Predicate<List<String>> isContains  = List.contains(searchName);
//        System.out.println(isContains.test(일학년));
//        System.out.println(isContains.test(이학년));

        Predicate<String>  isContains2 = name -> 일학년.contains(name) || 이학년.contains(name);
        isContains2.test(searchName);

        List<String> dataList  = List.of("aaaa","bbbb","cccc","abaa","bbaa", "ccbb");

        List list = new ArrayList<>();

        List<String> newdataList = dataList.stream()
                .filter(data -> data.contains("a"))
                .collect(Collectors.toList());

//        Stream<Integer> numstream = List.of(1,2,3,4).stream();
        Stream<Integer> numstream = Stream.of(1,2,3,4);
        // 스트림 구성
        /*
            1. 스트림 생성
            2. 중간 연산(조건에 맞는 데이터 구분, 데이터 값 수정, 수정,정렬,중복제거,제한, 건너뛰기)
            3. 최종연산
            4. 반복중 뒤로돌아갈수없음
         */
        numstream.filter(num -> num % 2 ==0).forEach(n -> System.out.println(n));

        List<Integer> numList2 = List.of(1,2,3,4);

        for (Integer num : numList2){
            if (num%2 == 0){
                System.out.println(num);
            }
        }
    }

}
