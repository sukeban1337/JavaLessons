package Lesson32.Lesson32_2;

import Lesson32.Lesson32_1.WrongLoginException;
import Lesson32.Lesson32_1.WrongPasswordException;

import java.util.Map;
import java.util.Set;

public class Authorization {
    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static <K, V> void shopAuth(String login, String password, Map<K, V> loginAndPassword) throws WrongPasswordException, WrongLoginException {
        Set<Map.Entry<K, V>> setLogNPas = loginAndPassword.entrySet();

        int count = 0;
        for(Map.Entry<K, V> element : setLogNPas){
            count++;

            if(login.equals(element.getKey())){
                if(!password.equals(element.getValue())){
                    throw new WrongPasswordException("Wrong Password");
                } else System.out.println("Успешная авторизация."); break;
            }else if(count == loginAndPassword.size()) throw new WrongLoginException("Wrong Login");
        }
    }



}
