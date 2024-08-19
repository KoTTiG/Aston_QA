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
        String[][] notSymmetricalArray = { {"1", "1", "1", "1"},
                {"2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4"}};
        String[][] strArray = { {"1", "a1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}};
        try {
            int sum = SumArray(intArray);
            System.out.println("Cумма элементов массива: " + sum);
        } catch (MyArraySizeException|MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        try {
            int sum = SumArray(notSymmetricalArray);
            System.out.println("Cумма элементов массива: " + sum);
        } catch (MyArraySizeException|MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        try {
            int sum = SumArray(wrongSizeArray);
            System.out.println("Cумма элементов массива: " + sum);

        } catch (MyArraySizeException|MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        try {
            int sum = SumArray(strArray);
            System.out.println("Cумма элементов массива: " + sum);
        } catch (MyArraySizeException|MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static int SumArray(String[][] array) throws MyArrayDataException, MyArraySizeException {
            if ((array.length != 4)) throw new MyArraySizeException("Неправильный размер массива");
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i].length != 4) throw new MyArraySizeException("Неправильный размер массива");
                for (int j = 0; j < array[i].length; j++) {
                    try {
                    sum = sum + Integer.valueOf(array[i][j]);
                    }
                    catch (NumberFormatException e) {
                        throw new MyArrayDataException ("Неправильный формат данных в ячейке [" + i +";"+j+"]");
                    }
                }
            }
            return sum;
    }



}