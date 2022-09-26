package Lesson23.Lesson23_5;

public class Food {

    public void prepare(Cookable c, String str) {
        c.cook(str);
    }

    public static void main(String[] args) {
        Food food = new Food();
        Cookable c = new Cookable() {
            @Override
            public void cook(String str) {
                System.out.println(str + " is cooking.");
            }
        };
        String str = "food";

        food.prepare(c, str);
    }
}
