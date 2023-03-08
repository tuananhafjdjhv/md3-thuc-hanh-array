package FindMinValueInArray;

public class FindMinValueInArray {
    public static void main(String[] args) {
        int []array = {0, 2, 3, 4, 5, 6};
        int index = minValue(array);
        System.out.println("gia tri nho nhat cua mang la: " + array[index]);
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
