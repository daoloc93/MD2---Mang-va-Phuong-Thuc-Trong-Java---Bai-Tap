import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int [] array = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};

        System.out.println("Các phần tử trong mảng:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số cần chèn: ");
        int x = sc.nextInt();

        System.out.print("Nhập vào vị trí chèn: ");
        int index = sc.nextInt();
        if (index <= -1 || index >= array.length - 1) {
            System.out.println("Không chèn được phần tử vào mảng");
            System.exit(0);
        }

        for (int i = array.length-1; i > index ; i--) {
            array[i] = array[i-1];
        }

        array[index] = x;
        System.out.println("Mảng sau khi chèn x vào: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
