/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting_assignment;

import java.util.Random;

/**
 *
 * @author S067232588
 */
public class Sorting_assignment {

    /**
     * @param args the command line arguments
     */
    
    static int[] sort(int[] sequence, int maxValue) {
        // Bucket Sort
        int[] Bucket = new int[maxValue + 1];
        int[] sorted_sequence = new int[sequence.length];

        for (int i = 0; i < sequence.length; i++) {
            Bucket[sequence[i]]++;
        }

        int outPos = 0; 
        for (int i = 0; i < Bucket.length; i++) {
            for (int j = 0; j < Bucket[i]; j++) {
                sorted_sequence[outPos++] = i; //
            }
        }
        return sorted_sequence;
    }
    
    static int maxValue(int[] sequence) {
        int maxValue = 0;
        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] > maxValue) {
                maxValue = sequence[i];
            }
        }
        return maxValue;
    }
    
    static void printSequence(int[] sorted_sequence) { 
        for (int i = 0; i < sorted_sequence.length; i++) {
            System.out.print(((char)sorted_sequence[i]) + " ");
        }
    }
    
    static int[] countingSort(int[] numbers) {
    int max = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
        if (numbers[i] > max)
            max = numbers[i];
    }

    int[] sortedNumbers = new int[max+1];

    for (int i = 0; i < numbers.length; i++) {
        sortedNumbers[numbers[i]]++;
    }

    int insertPosition = 0;

    for (int i = 0; i <= max; i++) {
            for (int j = 0; j < sortedNumbers[i]; j++) {
                    numbers[insertPosition] = i;
                    insertPosition++;
            }
    }
    return numbers;
}
    
    public static void main(String[] args) {
       System.out.println("Sorting the alphabet using BUCKET SORT:");
        Random random = new Random(); 
        int N = 26; //Set # of items in sequence 
        int[] sequence = new int[N]; //Makes an array filled with N number of int

        for (int i = 0; i < N; i++) {
            sequence[i] = Math.abs(random.nextInt(26) + 65); //Fills the array with random ints 65 - 90
        }

        int maxValue = maxValue(sequence); //Calls the maxValue function, whitch loops through the array and finds the maximum value 
        
        System.out.println("Original Sequence: ");
        printSequence(sequence);
        
        System.out.println("\nSorted Sequence (bucket): ");
        printSequence(sort(sequence, maxValue));
        
        System.out.println("\ncounting sort: ");
        printSequence(countingSort(sequence));

        System.out.print("\n");
    }
    
}
