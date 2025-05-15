package loop;

import loop.Student;

import java.util.List;



public class Main4 {

    public static void main(String[] args) {
        // 점수 가장 높은 학생 이름 출력
        List<Student> students = List.of(
                new Student("김준일",80),
                new Student("김준이",94),
                new Student("김준삼",75),
                new Student("김준사",99),
                new Student("김준오",85)
        );

        Student maxStudent = null;
        for (Student s : students){
            if (maxStudent == null){
                maxStudent = s;
            } else if (maxStudent.getScore() > s.getScore()) {
                maxStudent = s;
            }
        }
        System.out.println(maxStudent.getName());
    }

}
