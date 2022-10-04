package Lesson32.Lesson32_1;

public class Authorization {
    private String login;
    private String password;
    private String confirmPassword;

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

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public Authorization(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static void auth(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if (login.length() > 20 || !login.matches("^[a-zA-Z0-9_]+$") || password.length() > 20 || !password.matches("^[a-zA-Z0-9_]+$") || !password.equals(confirmPassword)) {
            if (login.length() > 20 || !login.matches("^[a-zA-Z0-9_]+$")){
                System.out.println("false");
                throw new WrongLoginException("Wrong login");}
            if (password.length() > 20 || !password.matches("^[a-zA-Z0-9_]+$") || !password.equals(confirmPassword)){
                System.out.println("false");
                throw new WrongPasswordException("Wrong password");}
        } else System.out.println("true");
    }
}
