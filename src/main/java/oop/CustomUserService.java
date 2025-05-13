package oop;

public class CustomUserService {
    CustomUserRepository customUserRepository = new CustomUserRepository();
    public void addUser(){
        System.out.println("커스텀사용자 추가");
        customUserRepository.insert();
    }
}
