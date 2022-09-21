package Lesson22.Lesson22_3;

public class Lesson22_3 {

public static void replace(){
    StringBuilder stringBuilder = new StringBuilder().append("Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla. Object-oriented programming bla. Object-oriented programming bla. Object-oriented programming bla. Object-oriented programming bla. Object-oriented programming bla. Object-oriented programming bla. Object-oriented programming bla.");
    String oldWord = "Object-oriented programming";
    String newWord = "OOP";
    int oldWordLenght = oldWord.length();
    int index = stringBuilder.indexOf(oldWord, stringBuilder.indexOf(oldWord) +1); //Здесь нахожу индекс второго вхождения


    while(index != -1 && index != 0) {
        stringBuilder.replace(index, index + oldWordLenght, newWord);
        index = stringBuilder.indexOf(oldWord, stringBuilder.indexOf(oldWord , stringBuilder.lastIndexOf(newWord)) + 1); //Здесь переопределяю переменную на поиск второго вхождения от места последней замены
    }
    System.out.println(stringBuilder);
}


    public static void main(String[] args) {
    replace();
    }

}
