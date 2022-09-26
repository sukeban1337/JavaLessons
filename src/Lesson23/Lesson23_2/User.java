package Lesson23.Lesson23_2;

public class User {
    private String login;
    private String password;

    User(String login, String password){
        this.login = login;
        this.password = password;
    }


    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }

    class Query{
        public void printToLog(){
            System.out.println("Пользователь: (login:) " + login + " / (password:) " + password + " отправил запрос.");
        }
    }


    public static void main(String[] args) {
        User user = new User("login1", "password1");
        user.createQuery();

        user.new Query().printToLog();

        new User("login2", "password2").new Query().printToLog();
    }
}
