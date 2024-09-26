// Lab 1: Data Structures Basics
// Created by: Manbir Kheira
// This is the first lab for the course where we work on practicing some basic java coding.
// We're supposed to create some methods to do stuff like finding the max, min, sum, and average of numbers
// Not perfect but it'll get the job done

public class ManbirKheira_Lab1 {

    // Method to get the maximum value between two integers
    public static int max(int a, int b) {
        return (a > b) ? a : b; // using simple if else check
    }

    // Method to find the minimum value between two integers
    public static int min(int a, int b) {
        return (a < b) ? a : b; // again pretty basic
    }

    // Method to return sum of an integer array
    public static int sum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num; // adding each number up
        }
        return sum; // return total sum
    }

    // Method to calculate average of the array
    public static double average(int[] nums) {
        int sum = sum(nums);  // using the sum method we made earlier
        return (double) sum / nums.length; // careful dividing by array length, must be double
    }

    // Method to find max value in array
    public static int max(int[] nums) {
        int max = nums[0]; // start with first element
        for (int num : nums) {
            if (num > max) {
                max = num; // update if bigger found
            }
        }
        return max;
    }

    // Method to find min value in array
    public static int min(int[] nums) {
        int min = nums[0]; // again start with first one
        for (int num : nums) {
            if (num < min) {
                min = num; // update if smaller found
            }
        }
        return min;
    }

    // Main method where everything gets run
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 12, 7, 3, 11, 5}; // our test array

        // Output the array in order using a while loop
        System.out.print("Array in order: ");
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " "); // print one by one
            i++;
        }
        System.out.println();

        // Output the array in reverse using a for loop
        System.out.print("Array in reverse: ");
        for (int j = array.length - 1; j >= 0; j--) {
            System.out.print(array[j] + " "); // going backwards
        }
        System.out.println();

        // Output the first and last values of the array
        System.out.println("First value: " + array[0]);
        System.out.println("Last value: " + array[array.length - 1]);

        // Call the methods and print their results
        System.out.println("Max of 5 and 9: " + max(5, 9));
        System.out.println("Min of 5 and 9: " + min(5, 9));
        System.out.println("Sum of array: " + sum(array));
        System.out.println("Average of array: " + average(array));
        System.out.println("Max value in array: " + max(array));
        System.out.println("Min value in array: " + min(array));
    }
}
