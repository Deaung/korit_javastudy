package classStudy;

import java.util.ArrayList;
import java.util.List;

class UserRepository{

}

class UserAndAdminRepository{

    List<User> userList = new ArrayList<>();
    private static UserAndAdminRepository instance;

    private UserAndAdminRepository (){ }

    static UserAndAdminRepository getInstance(){
        if (instance == null){
            instance = new UserAndAdminRepository();
        }
        return instance;
    }

    void insert(){
        userList.add(new User());
        System.out.println("사용자 또는 관리자 정보 추가");
    }

    void delete(){
        userList.remove(new User());
        System.out.println("사용자 또는 관리자 정보 삭제");
    }
}

class AdminService{

    void addAdmin(){
        UserAndAdminRepository.getInstance().insert();
    }
    void removeAdmin(){
        UserAndAdminRepository.getInstance().delete();
    }
}

class UserService{

    void addUser(){
        UserAndAdminRepository.getInstance().insert();
    }
    void removeUser(){
        UserAndAdminRepository.getInstance().delete();
    }
}

class User{
    static String userType = "사용자";
    String username= "user1";
    String password = "pw1";
}

public class Main {
    public static void main(String[] args) {
//        username = "123";
//        password = 123;
//
//        String username = "123";
//        String password="123";
        User user = new User();
        new User().username = "d";
        new User().password = "dd";
        User.userType= "관리자";

        AdminService adminService = new AdminService();
        UserService userService = new UserService();
    }

}
