package homework_2;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException(){
        super("Некорректная длина массива. Массив должен быть 4X4");
    }
}
