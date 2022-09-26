package Lesson23.Lesson23_7;

public class GenericMatrix <T> {
    private T[][] matrix1;

    public T[][] getMatrix1() {
        return matrix1;
    }

    public GenericMatrix(T[][] matrix1){
        this.matrix1 = matrix1;
    }

    public static void main(String[] args) {
        Integer[][] intArray = {{1, 2},
                                {3, 4},
                                {5, 6}};

        GenericMatrix<Integer> intGenericMatrix = new GenericMatrix<>(intArray);
    }
}
