package homework_2;

public class Main {
    public static void main(String[] args) {
        String array[][] = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        String array1[][] = {{"2", "4", "10", "4"}, {"1", "25", "5", "4", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        String array2[][] = {{"2", "4", "55", "4"}, {"1", "25", "5", "4"}, {"1", "2", "3", "4"}, {"1", "Привет", "3", "4"}};

        try {
            Size_and_Sum(array);
            Size_and_Sum(array1);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        try {

            Size_and_Sum(array2);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


    }

    public static void Size_and_Sum(String array[][]) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i].length != 4 || array[j].length != 4)
                    throw new MyArraySizeException();
                else {
                    int value = 0;
                    try {
                        value = Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException e) {
                        i++;
                        j++;
                        System.out.println(" В столбце № " + j + " строке № " + i + " лежит символ или текст вместо числа");
                        throw new MyArrayDataException();
                    }
                    sum += value;

                }
            }


        }
        System.out.println("Сумма массива = " + sum);

    }
}
