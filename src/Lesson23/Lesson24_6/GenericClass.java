package Lesson23.Lesson24_6;

public class GenericClass<T extends String, V extends Animal, K extends Number> {
    private T t;
    private V v;
    private K k;

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public GenericClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public void showNames(){
        System.out.println("T: " + t.getClass().getName() + "\n" +
                "V: " + v.getClass().getName() + "\n" +
                "K: " + k.getClass().getName());
    }

    public static void main(String[] args) {
        GenericClass<String, Cat, Integer> generic = new GenericClass<>("String", new Cat(), 123);
        generic.showNames();
    }
}
