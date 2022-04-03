package odessa;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);


    /**
     Дана последовательность натуральных чисел а1, а2, ..., an.
     Создать массив из четных чисел этой последовательности.
     Если таких чисел нет, то вывести сообщение об этом факте.
     */
    static void task30() {
        System.out.println("task30");
        int[] array = new int[]{1, 2, 4, 7, 9, 3, 2, 6};
        System.out.print("Your array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                counter++;
            }
        }

        if (counter == 0) {
            System.out.print("there is no even numbers ");
        } else {
            int[] newArray = new int[counter];
            int counter1 = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    newArray[counter1] = array[i];
                    counter1++;
                }
            }
            System.out.print("\nYour new array: ");
            for (int i = 0; i < counter; i++) {
                System.out.print(newArray[i] + " ");
            }
        }
    }

    /**
     Сформировать массив простых множителей заданного числа.
    */
    static void task55() {
        System.out.println("task55");
        int n;
        boolean first = true;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n");
        n = in.nextInt();
        for (int i = 2; i <= n; i++) {
            while(n % i == 0)
            {
                if(first){
                    System.out.print(i);
                    first = false;
                }
                else
                {
                    System.out.print("*" + i);
                }
                n/=i;
            }
        }
    }

    /**
    Известны данные о мощности двигателя 30 моделей легковых автомобилей.
     Выяснить, есть ли среди них модель, мощность двигателя которой превышает 200 л. с.
     */
    static void task80() {
        System.out.println("task80");
        int[] arr = new int[30];
        System.out.print("Engine power over 200: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 250) + 14);
            if (arr[i]>200){
                System.out.print(arr[i] + " ");
            }
            else{
                System.out.print("No engines with a capacity of more than 200 ");
            }
        }
    }

    /**
     Удалить первый элемент одномерного массива целых чисел.
     */
    static void task105() {
        System.out.println("task105");
        int[] arr = {1,5,6,9,3,8,4};
        int[] newArr = null;
        int deleted = 1;
        System.out.println("Array: "+Arrays.toString(arr));

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == deleted){
                newArr = new int[arr.length - 1];
                for(int index = 0; index < i; index++){
                    newArr[index] = arr[index];
                }
                for(int j = i; j < arr.length - 1; j++){
                    newArr[j] = arr[j+1];
                }
            }
        }
        System.out.println("New Array: " + Arrays.toString(newArr));
    }

    /**
     Даны целые положительные числа а1, а2, ..., an.
     Найти среди них те, которые являются квадратами некоторого числа m.
     */
    static void task130() {
        System.out.println("task130");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 11) + 3);
        }
        System.out.println("Array: " + Arrays.toString(arr));
        int m;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter m");
        m = in.nextInt();
        int counter = 0;
        System.out.print("Found number(s): ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == m * m) {
                System.out.print(arr[i] + " ");
                counter++;
            }
        }
        if(counter == 0){
            System.out.print("-\nSearched numbers not found");
        }
    }

    public static void main(String[] args) {
        task30();
        task55();
        task80();
        task105();
        task130();

    }
}
