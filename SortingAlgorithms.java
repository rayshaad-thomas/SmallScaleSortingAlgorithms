/*
 * Rayshaad Thomas
 * 892564854
 * Lab Section 1
 * Lab Assignment 6
 * Submission time: 5:33
 */
package sortingalgorithms;
import java.util.Scanner;
import java.util.Random;
import java.time.Instant;
import java.time.Duration;

/**
 *
 * @author rtho137
 */
public class SortingAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("Please enter the size of your file:");
        
        Scanner input = new Scanner(System.in);
        int listSize = input.nextInt();
        
        int[] array = new int[listSize];
        Random rand = new Random();
        
        for(int i= 0 ; i<listSize; i++)
            array[i] = rand.nextInt(1000);
        
        Instant start = Instant.now();
        selectionSort(array.clone());
        Instant finish = Instant.now();
        System.out.println("Time is: "+ Duration.between(start, finish).toMillis());
        
        Instant.now();
        bubbleSort(array.clone());
        Instant.now();
        System.out.println("Time is: " + Duration.between(start, finish).toMillis());
        start = Instant.now();
        scBubbleSort(array.clone());
        finish = Instant.now();
        System.out.println("Time is: " + Duration.between(start, finish).toMillis());
        start = Instant.now();
        selectionSort(array.clone());
        finish = Instant.now();
        System.out.println("Time is: " + Duration.between(start, finish).toMillis());
        start = Instant.now();
        insertionSort(array.clone());
        finish = Instant.now();
        System.out.println("Time is: " + Duration.between(start, finish).toMillis());
    }
    
    public static void bubbleSort(int [] array) 
    {
        long counter = 0;
        for (int i = 1; i < array.length; i++)
        {
            for (int j = 0; j < array.length - 1; j++)
            {
                counter++;
                if (array [j] > array [j+1])
                {
                    
                    int temp = array [j];
                    array [j] = array [j+1];
                    array [j+1] = temp;
                }
            }
        }
        System.out.println("Number of iterations: " + counter);
    }
    
    public static void scBubbleSort (int [] array)
    {
        long counter = 0;
        for (int i = 1; i < array.length; i++)
        {
            boolean swap = false;
            for (int j = 0; j < array.length - 1; j++)
            {
                counter++;
                if (array [j] > array [j+1])
                {
                    
                    int temp = array [j];
                    array [j] = array [j+1];
                    array [j+1] = temp;
                    swap = true;
                }
            }
            if(!swap) break;
        }
        System.out.println("Number of iterations: " + counter);
    }
    
    public static void selectionSort (int [] array) 
    {
        long counter = 0;
        for (int i = 0; i < array.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < array.length; j++)
            {
                counter++;
                if (array [j] < array [index]) index = j;
            }
            int smallerNumber = array [index];
            array [index] = array [i];
            array [i] = smallerNumber;
        }
        System.out.println("Number of iterations: " + counter);
    }
    
    public static void insertionSort (int [] array) 
    {
        int i, j, key;
        long counter = 0;
        for (i = 1; i < array.length; i++)
        {
            key = array [i];
            j = i - 1;
            
            while (j >= 0 && array [j] > key) 
            {
                array [j+1] = array [j];
                j = j - 1;
                counter ++;
            }
            array [j+1] = key;
        }
        System.out.println("Number of iterations: " + counter);
        
    }        
    
    
}
