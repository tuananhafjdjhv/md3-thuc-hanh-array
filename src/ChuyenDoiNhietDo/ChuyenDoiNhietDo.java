package ChuyenDoiNhietDo;

import java.rmi.server.RMISocketFactory;
import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double F;
        double C;
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1.Chuyen tu F sang C: ");
            System.out.println("2.Chuyen tu C sang F: ");
            System.out.println("0.Exit ");
            System.out.println("Chon:");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Nhap do F: ");
                    F = sc.nextDouble();
                    System.out.println("Ket qua: " +(5.0 / 9) * (F - 32));
                    break;
                }
                case 2: {
                    System.out.println("Nhap do C: ");
                    C = sc.nextDouble();
                    System.out.println("Ket qua: " +   (9.0 / 5) * C + 32);
                    break;
                }
                case 0:
                    System.exit(0);

            }
        } while (choice != 0);
    }

//    public static double CToF(double csu) {
//        double frh = (9.0 / 5) * csu + 32;
//        return frh;
//    }
//
//    public static double FToC(double frh) {
//        double csu = (5.0 / 9) * (frh - 32);
//        return csu;
//    }
}
