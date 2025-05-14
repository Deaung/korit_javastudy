package lambda;

public class Main {
    public static void main(String[] args) {
        아무거나가능한 a = new 식사();
        아무거나가능한 b = new 운동();
        a.실행();
        b.실행();
        아무거나가능한 c = new 아무거나가능한() {
            @Override
            public void 실행() {
                System.out.println("태어남.");
            }
        };
        c.실행();

        아무거나가능한 d = () -> System.out.println("태어남");
        d.실행();

        아무거나가능한2 e = (String data1, String data2) ->{
            return data1 + data2;
        } ;
        String e결과 = e.실행("데이터1","데이터2");
        System.out.println(e결과);

        // 매개변수 자료형을 생략할 수 있고, 변수명 변경이 가능
        아무거나가능한2 f = (d1, d2) ->{
            return d1 + d2;
        } ;

        // 재정의 함수 내용이 한줄의 명령이면 {} 생략 가능
        // 단, 리턴이 있는경우 리턴값만 한줄로 작성해야 함.
        아무거나가능한 g = () -> System.out.println("한줄 명령 실행");

        아무거나가능한2 g2 = (d1,d2) -> d1+d2;

        // 매개변수가 하나면 매개변수 감싸는 소괄호 생략 할 수 있다.
        아무거나가능한3 h = data -> "데이터:" + data;
        String h결과 = h.실행("아무 데이터");


        // 람다식 정의 조건 -> 추상 메서드 갯수 하나만 정의할 것
    }
}
