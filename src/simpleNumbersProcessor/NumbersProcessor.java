package simpleNumbersProcessor;

import java.util.*;

public class NumbersProcessor {
    public static void main(String[] args) {
        double mulSum = 1;

        System.out.println("Welcome to A Simple Number Processor (ASimpNPro)!\n"
        		+ "*This Program Can't Accept Floats, Please Only Input Whole Numbers!\n");
        try (Scanner scan = new Scanner(System.in);){
        
        System.out.println("How Many Variables Would You Like?");
        int n = scan.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Please Input Some Numbers!");
        //number input from user
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
            mulSum = mulSum * arr[i]; //multiply every elements with each other
        }

        System.out.print("Your Numbers are: ");        
        //sort array then print numbers
        Arrays.sort(arr); 
        System.out.println(Arrays.toString(arr));

        //print unsortened array
        //  for (int i = 0; i < arr.length; i++){
        //      System.out.print(arr[i] + ",");
        //  }
        

        //count avg
        double total = 0;
        for(int j=0;j<arr.length;j++){
            total = total+arr[j];
        }
        double avg = total/arr.length;
        System.out.print("Your Average is: " + avg + "\n");

        //count median
        double median;
        if (arr.length % 2 == 0){
            median = ((double)arr[arr.length/2] + (double)arr[arr.length/2 - 1])/2;
        }else{
            median = (double) arr[arr.length/2];
        }
        System.out.print("Your Median is: " + median + "\n");

        //print out sum multiplication of elements
        System.out.print("Total of Multiplication of Elements is: " + mulSum + "\n");
        System.out.print("Program Finished Successfully! Thank You for Using ASimpNPro, Have a Nice Day!");
        } catch (Exception e){
            System.out.print("Error Detected \nProgram Terminated Due to Error");
        }

}
}
