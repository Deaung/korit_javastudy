import service.UserService;

public class JavaStudyApplication {
    public static void main(String[] args) {
        UserService userService = new UserService();

        userService.register("dd","dd",
                "dd","aaa",
                "123","adsfsd",
                1,"dd");

        userService.register("dd","dd",
                "dd","aaa",
                "123","adsfsd",
                1,"dd");

        userService.printAll();
        userService.printByUsername();
    }
}
