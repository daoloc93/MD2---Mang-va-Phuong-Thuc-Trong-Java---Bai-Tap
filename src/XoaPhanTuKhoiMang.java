import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] arr = {10,6,6, 4, 6, 7, 8, 6, 0,6,6, 0, 0, 0,6};
        boolean flagNgoai = false;

        System.out.println("Các phần tử trong mảng: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào phần tử cần xóa: ");
        int x = sc.nextInt();

        while (flagNgoai == false) {
            boolean flagTrong = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == x) {
                    if (i == arr.length-1) {
                        arr[i] = 0;
                    } else {
                        for (int j = i; j < arr.length-1; j++) {
                            arr[j] = arr[j + 1];
                            flagTrong = true;

                        }
                    }
                }
            }
            if (flagTrong == true) {
                flagTrong = false;
            } else {
                flagNgoai = true;
            }
        }
        System.out.println("Mảng sau khi xóa:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
