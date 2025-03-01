import java.util.Scanner;

public class ArrayIncreasing {
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
            public static int [] arrayAsc(int arr[]){
                for (int i = 0; i < arr.length-1; i++) {

                    for (int j = i+1; j < arr.length; j++) {
                        if(arr[i]>arr[j]) {
                            int temp=arr[i];
                            arr[i]=arr[j];
                            arr[j]=temp;
                        }   
                    }
                }
                
               return arr;
            }
            public static void main(String[] args) {
                int arr[]=input_array();
                arrayAsc(arr);
                for (int i : arr) {
                    System.out.print(i + " ");
                }
            }

}
