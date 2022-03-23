import java.sql.Array;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int [] arr1 = new int[5];
        int [] arr2 = new int[5];
        int [] arr3 = new int [arr1.length + arr2.length];

        Scanner sc = new Scanner(System.in);

        int i = 0;
        while (i < arr1.length) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " cho arr1: ");
            arr1[i] = sc.nextInt();
            i ++;
        }

        int j = 0;
        while (j < arr2.length) {
            System.out.print("Nhập phần tử thứ " + (j + 1) + " cho arr2: ");
            arr2[j] = sc.nextInt();
            j ++;
        }

        for (int n = 0; n < arr1.length; n++) {
            arr3[n] = arr1[n];
        }

        for (int n = 0; n < arr2.length; n++) {
            arr3[n+ arr1.length] = arr2[n];
        }
        System.out.println("Mảng 3 " + "có " + arr3.length + " phần tử là:");
        for (int n = 0; n < arr3.length; n++) {
            System.out.print(arr3[n] + " ");
        }
    }
}
