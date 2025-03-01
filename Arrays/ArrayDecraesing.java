// Arrange the Array in desc Order

import java.util.Scanner;

public class ArrayDecraesing {
    public static int [] inputArray(){
        System.out.print("Enter the size of the Array : ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("enter the elements of Array : ");
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        return arr;

    }
    public static int[] arrayDsc(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int arr[]=inputArray();
        arrayDsc(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
