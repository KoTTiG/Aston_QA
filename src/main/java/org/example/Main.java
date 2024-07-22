package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[][] wrongSizeArray = { {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"} };
        String[][] intArray = { {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}};
        String[][] strArray = { {"1", "a1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}};
        try {


            checkArraySize(intArray);
            checkArraySize(wrongSizeArray);

        } catch (MyArraySizeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        finally {
            try {


                SumArray(intArray);
                SumArray(strArray);

            } catch (MyArrayDataException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }

    }

    public static void SumArray(String[][] array) throws MyArrayDataException {

            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    try {
                    sum = sum + Integer.valueOf(array[i][j]);
                    }
                    catch (NumberFormatException e) {
                        throw new MyArrayDataException ("Неправильный формат данных в ячейке [" + i +";"+j+"]");
                    }
                }
            }
            System.out.println("Сумма элементов в массиве = " +sum);


    }

    public static void checkArraySize(String[][] array) throws MyArraySizeException {

        if ((array.length != 4) || (array[0].length != 4)) throw new MyArraySizeException("Неправильный размер массива");
    }


}