package Lesson32.Lesson32_1;

public class Main {
    public static void main(String[] args) {
        try{
            Authorization.auth("Login1", "Password1", "Password1");
            Authorization.auth("Login1", "Password1", "Password2");

        }catch(WrongLoginException | WrongPasswordException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
