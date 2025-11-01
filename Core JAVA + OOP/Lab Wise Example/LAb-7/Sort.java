// arr 5 class A
// 4 method 
// sort 
// search
// sum
// avg 

import java.util.*;

class A {
    public void sort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {// array sorting
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void search(int[] arr, int search) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("Index of target element is " + i);// finds target index
                break;
            }
        }

    }

    public int sum(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of all elements of array is " + sum);// sum of all elements
        return sum;

    }

    public void avg(int[] arr) {

        int sum = sum(arr);
        System.out.println("Average of all elements of array is " + (sum / 5));// average of all elements

    }
}

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter element no " + (i + 1));
            arr[i] = sc.nextInt();
        }

        A a = new A();
        System.out.println("Enter\n1 for sorting\n2 for search\n3 for sum of array\nor 4 for avg of array");// choice
                                                                                                            // for user
        int n = sc.nextInt();
        if (n == 1) {

            a.sort(arr);

        } else if (n == 2) {

            System.out.println("Enter element to be searched : ");
            int search = sc.nextInt();
            a.search(arr, search);

        } else if (n == 3) {

            a.sum(arr);

        } else if (n == 4) {

            a.avg(arr);

        } else {

            System.out.println("Enter valid no : ");

        }
        sc.close();
    }
}
