package Lesson32.Lesson32_2;

import Lesson32.Lesson32_1.WrongLoginException;
import Lesson32.Lesson32_1.WrongPasswordException;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> loginAndPassword = new HashMap<>();
        loginAndPassword.put("Login1", "Password1");
        loginAndPassword.put("Login2", "Password2");
        loginAndPassword.put("Login3", "Password3");


        try{
            Authorization.shopAuth("Login1", "Password1", loginAndPassword);
            Authorization.shopAuth("Login1", "Password2", loginAndPassword);

        }catch(WrongLoginException | WrongPasswordException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
