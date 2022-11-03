import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static java.util.Collections.swap;

public class Main {

    public static void main(String[] args) {

        System.out.println("Generic sort method:");

        Integer[] arr = {3,4,1,5};
        System.out.println("Before: "+ Arrays.toString(arr));
        sort(arr);
        System.out.println("After: "+Arrays.toString(arr));

        String[] arr1= {"acd","ded","dal","bad","cle"};
        System.out.println("Before: "+ Arrays.toString(arr1));
        sort(arr1);
        System.out.println("After: "+Arrays.toString(arr1));

        LocalDate[] arr2= {LocalDate.parse("1999-06-24"), LocalDate.now(), LocalDate.parse("2002-01-31")};
        System.out.println("Before: "+ Arrays.toString(arr2));
        sort(arr2);
        System.out.println("After: "+Arrays.toString(arr2));

        System.out.println("\nBinary tree for integers:");

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(30);
        binaryTree.add(50);
        binaryTree.add(15);
        binaryTree.add(20);
        binaryTree.add(10);
        binaryTree.add(40);
        binaryTree.add(60);
        binaryTree.inOrder();

        System.out.println("\n\nGeneric binary tree:");

        BinaryTreeGeneric<Integer> binaryTreeGeneric = new BinaryTreeGeneric<>();
        binaryTreeGeneric.add(10);
        binaryTreeGeneric.add(30);
        binaryTreeGeneric.add(25);
        binaryTreeGeneric.add(35);
        binaryTreeGeneric.add(5);
        binaryTreeGeneric.add(69);
        binaryTreeGeneric.add(42);
        binaryTreeGeneric.inOrder();
    }

    public static <T extends Comparable<T>> void sort (T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            int smallest = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[smallest])<=0) {
                    smallest = j;
                }
            }

            //Swapping the elements
            if(i != smallest) {
                T temp = arr[i];
                arr[i] = arr[smallest];
                arr[smallest] = temp;
            }
        }
    }
}