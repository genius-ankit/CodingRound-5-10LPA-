// Problem Statement: You are given an array. The task is to reverse the array and print it. 



import java.util.Scanner;

public class ReverseArray{
public static void reverseArray(int arr[]){
    System.out.print("reverse of the array is : " );
    for (int i = arr.length-1; i >=0; i--) {
            System.out.print( arr[i] + " ");
    }
   
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
        int arr[] =input_array();
        reverseArray(arr);
    }

}
