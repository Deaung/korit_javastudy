//package generic;
//
//public class Main {
//
//    /*
//    와일드 카드 제약 조건
//    1.? extends 클래스자료형  -> 해당 클래스의 자식 클래스 자료형만 허용
//    2.? super 클래스자료형    ->해당 클래스 자료형이 부포 부
//     */
//    public static void showAll(Repository<? extends Student> repository){
//        repository.findAll().forEach(System.out::println);
//    }
//
//    public static void main(String[] args) {
//        Repository<HighStudent> hsRepo = new Repository<>();
//        Repository<AcademyStudent> asRepo = new Repository<>();
//
//        hsRepo.save(new HighStudent());
//        asRepo.save(new AcademyStudent());
//
//        hsRepo.findAll().forEach(s-> s.printGrade());
//        hsRepo.findAll().forEach(s-> s.getName());
//
//        showAll(hsRepo);
//    }
//}
