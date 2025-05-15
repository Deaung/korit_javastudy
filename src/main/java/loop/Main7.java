package loop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class StudentName {
    private String name;

    public StudentName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "StudentName{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class Main7 {
    public static void main(String[] args) {
        // Student 객체들 전부 studentName 객체로 변환하여 리스트 출력
        List<StudentName> studentNames = new ArrayList<>();
        List<StudentName> studentNames2 = null;
        List<Student> students = List.of(
                new Student("김준일",80),
                new Student("김준이",94),
                new Student("김준삼",75),
                new Student("김준사",99),
                new Student("김준오",85)
        );
        for (Student std : students) {
            if (std.getScore() > 84){
                studentNames.add(new StudentName(std.getName()));
            }
        }
        System.out.println(studentNames);

        studentNames2 = students.stream()
                .filter(student -> student.getScore() > 84)
                .map(student -> new StudentName(student.getName()))
                .collect(Collectors.toList());
        System.out.println(studentNames2);
    }
}
