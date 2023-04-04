import java.util.Scanner;

public class Main {
    public static int findMin(int n, int[] arr) {
        //Function
        int minVal = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }
        return minVal;
    }
    public static void main(String[] args){
        //Function work check
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int[] myArr = new int[10];
        for(int i=0; i<n; i++) {
            myArr[i] = sc.nextInt();
        }
        System.out.println(findMin(n, myArr));
    }
}