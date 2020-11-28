package homework5;

public class Home5 {
    private static final int SIZE = 10000000;
    private static final int HALF_SIZE = SIZE / 2;

    public static void main(String[] args) {
        Home5 home5 = new Home5();
        home5.methodTwo();
        home5.methodOne();
    }

    private float[] evaluate (float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        return arr;
    }

    public void methodOne() {
        float[] arr = new float[SIZE];
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++)
            arr[i] = 1.0f;
        evaluate(arr);
        System.out.print("Время выполнения ");
        System.out.println(System.currentTimeMillis() - a);

    }

    public void methodTwo() {
        float[] arr = new float[SIZE];
        float[] arr1 = new float[HALF_SIZE];
        float[] arr2 = new float[HALF_SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, arr1, 0, HALF_SIZE);
        System.arraycopy(arr, HALF_SIZE, arr2, 0, HALF_SIZE);
        new Thread(() -> {
            float[] array = evaluate(arr1);
            System.arraycopy(array, 0, arr1, 0, array.length);
        }).start();
        new Thread(() -> {
            float[] array2 = evaluate(arr2);
            System.arraycopy(array2, 0, arr2, 0, array2.length);
        }).start();
        System.arraycopy(arr1, 0, arr, 0, HALF_SIZE);
        System.arraycopy(arr2, 0, arr, HALF_SIZE, HALF_SIZE);
        System.out.print("Время выполнения ");
        System.out.println(System.currentTimeMillis() - a);
    }


}
