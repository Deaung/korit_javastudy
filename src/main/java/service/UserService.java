package service;


import entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private static UserService instance;



    List<User> userServices = new ArrayList<>();

    public void register(String username, String password,
                         String name, String email,
                         String phone, String address,
                         int age, String roles){




            userServices.add((new User(username,password,name,email,phone,address,age,roles)));


    }

    public void printAll(){
        System.out.println(userServices.toString());
    }

    public void printByUsername(){
    }

}
