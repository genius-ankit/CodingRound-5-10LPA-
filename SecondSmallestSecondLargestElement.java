// Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.


import java.util.Scanner;

public class SecondSmallestSecondLargestElement {
    public static int secondSmallest(int arr[]){
        int min=Integer.MAX_VALUE;
        int secmin=Integer.MAX_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                secmin=min;
                min=arr[i];     
            }
            else if(arr[i]<secmin && arr[i]!=min){
                   return arr[i];
            }
            
        }
        return -1;
    }

    public static int secondLargest(int arr[]){
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                secmax=max;
                max=arr[i];     
            }
            else if(arr[i]>secmax && arr[i]!=max){
                    return arr[i];
            }
            
        }
        return -1;
    }
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
    public static void main(String[] args) {
        int arr[]=input_array();
        System.out.println("the second smallest integer in the array is : "+ secondSmallest(arr));
        System.out.println("the second largest integer in the array is : "+ secondLargest(arr));

    }
}
