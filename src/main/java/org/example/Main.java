package org.example;


public class Main {

    public static void main(String[] args) {
        //Task1        String str = "Hello";
        //        System.out.println("Reversed: " + Task1.reverseString(str));
        //
        //        String palindromeStr = "anna";
        //        System.out.println("Is palindrome: " + Task1.isPalindrome(palindromeStr));
        //        System.out.println("Is NOT palindrome: " + Task1.isPalindrome("qwsdxcb"));
        //
        //        int n = 5;
        //        int[] primes = Task1.generatePrimes(n);
        //        System.out.print("First " + n + " prime numbers: ");
        //        for (int prime : primes) {
        //            System.out.print(prime + " ");
        //        }


        //Task3
        int[] numbers = {5, 2, 9, 1, 5, 6};

        System.out.println("Original array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        Task3.bubbleSort(numbers);

        System.out.println("\nSorted array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }
}
