import java.util.Scanner;

public class TimPhanTuLonNhatTrongMang2Chieu {
    public static void main(String[] args) {

        int soDong, soCot;
        int dong = 0;
        int cot = 0;
        int soLonNhat = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của mảng: ");
        soDong = scanner.nextInt();
        System.out.println("Nhập vào số cột của mảng:");
        soCot = scanner.nextInt();

        int[][] A = new int[soDong][soCot];
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.println("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                if (A[i][j] > soLonNhat) {
                    soLonNhat = A[i][j];
                    dong = i;
                    cot = j;
                }
            }
        }
        System.out.println("Số lớn nhất trong mảng: " + soLonNhat);
        System.out.println(("Vị trí: dòng thứ " + dong + ", cột thứ " + cot));
    }
}
