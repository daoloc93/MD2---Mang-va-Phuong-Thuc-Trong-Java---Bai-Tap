import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int array[] = new int[5];
        int i = 0;

        Scanner sc = new Scanner(System.in);
        while (i < array.length) {
            System.out.print("Nhập vào phần tử thứ " + (i+1) + " của mảng: ");
            array[i] = sc.nextInt();
            i ++;
        }
        System.out.println("Mảng vừa tạo gồm các phần tử:");

        int min = array[0];
        for (int j = 1; j < array.length; j++) {
            if (min > array[j]) {
                min = array[j];
            }
        }
        System.out.println("");
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + min);
    }
}
