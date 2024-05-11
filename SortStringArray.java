import java.util.Arrays;

public class SortStringArray {
    public static void main(String[] args) {
        String[] stringArray = {"violin", "viola", "cello", "double bass"};
        Arrays.sort(stringArray);
        for (String s : stringArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
