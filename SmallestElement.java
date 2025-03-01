// Find the smallest element in an array
// Problem Statement: Given an array, we have to find the smallest element in the array.

// Examples:

// Example 1:
// Input: arr[] = {2,5,1,3,0};
// Output: 0
// Explanation: 0 is the smallest element in the array. 

// Example2: 
// Input: arr[] = {8,10,5,7,9};
// Output: 5
// Explanation: 5 is the smallest element in the array.


// >>>>- solution


import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
class SmallestElement{
        public static int[] input_array(){
            System.out.print("Enter the size of the Array : ");
            Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.print("enter the elements of the array :  ");
        for(int i =0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
            return arr;
            }

            
            public static int findMin(int arr[]){
                Arrays.sort(arr);
                
                return arr[0];
            }

        
        
        
        
    public static void main(String[] args){
            int arr[]=SmallestElement.input_array();
            System.out.print("The Input Array is : ");
            for(int i =0; i<arr.length;i++){
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
            int minimun=findMin(arr);
            System.out.println("the smallest element in the array is : " +minimun);
        }
    }
