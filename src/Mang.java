import java.util.Scanner;

public class Mang {
    public static void main(String[] args) {
        String[] students = {
                "Christian", "Michael",
                "Camila", "Sienna", "Tanya",
                "Connor", "Zachariah", "Mallory",
                "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name’s student:");
        String input_name = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)){
                System.out.println("Sinh viên có trong list, "+ input_name+ " ở vị trí số "+i);
            }
        }
        if (!isExist){
            System.out.println("sinh viên "+input_name+" không có trong list");
        }
    }
}
