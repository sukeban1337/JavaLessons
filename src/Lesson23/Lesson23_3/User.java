package Lesson23.Lesson23_3;

public class User {
    private static String login;
    private static String password;

    User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery() {
        User.Query query = new User.Query();
        query.printToLog();
    }

    public static class Query {

        public void printToLog() {
            System.out.println("Пользователь: (login:) " + login + " / (password:) " + password + " отправил запрос.");
        }
    }


    public static void main(String[] args) {
        User user = new User("login1", "password1");
        user.createQuery();

        User.Query query = new User.Query();
        query.printToLog();

    }
}
