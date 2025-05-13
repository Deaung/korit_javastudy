package oop;

public class BasicUserService {

    private UserRepository userRepository;
//    private BasicUserRepository basicUserRepository = (BasicUserRepository) userRepository;

    public BasicUserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    public void addUser(){
        System.out.println("기본사용자 추가");
        userRepository.insert();
    }
}